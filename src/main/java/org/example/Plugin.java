package org.example;

import net.mamoe.mirai.console.plugin.jvm.JavaPlugin;
import net.mamoe.mirai.console.plugin.jvm.JvmPluginDescriptionBuilder;

import java.io.IOException;
import java.util.*;

public final class Plugin extends JavaPlugin {
    public static final Plugin INSTANCE = new Plugin();
    public static Calendar cal = Calendar.getInstance();
    public static int hour,minute,second;
    public static Boolean hadSent;

    private Plugin() {
        super(new JvmPluginDescriptionBuilder("org.example.plugin", "1.0-SNAPSHOT").build());
    }

    @Override
    public void onEnable() {
        timeUpdate();
        Listener.onListen();
        getLogger().info("Plugin loaded啦!");

    }
    public static void timeUpdate() {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                cal = Calendar.getInstance();
                hour = cal.get(Calendar.HOUR_OF_DAY);
                minute = cal.get(Calendar.MINUTE);
                second = cal.get(Calendar.SECOND);
                try {
                    Hello.timeHello();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        },500, 1000);
    }
}