package org.example;

import net.mamoe.mirai.console.plugin.jvm.JavaPlugin;
import net.mamoe.mirai.console.plugin.jvm.JvmPluginDescriptionBuilder;

import java.io.IOException;
import java.util.*;

public final class Plugin extends JavaPlugin {
    public static final Plugin INSTANCE = new Plugin();
    public static Calendar cal;
    public static int hour,minute,second,xq;
    public static Boolean hadSent,button;

    private Plugin() {
        super(new JvmPluginDescriptionBuilder("org.example.plugin", "1.0-SNAPSHOT").build());
    }

    @Override
    public void onEnable() {
        getLogger().info("Plugin loaded!");
        button = false;
        timeUpdate();
        task();
        Listener.onListen();

    }
    private void task() {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                try {
                    Hello.timeHello();
                    Lesson.lessonTx();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        },1000,1000);
    }
    private void timeUpdate() {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                cal = Calendar.getInstance();
                xq = cal.get(Calendar.DAY_OF_WEEK);
                hour = cal.get(Calendar.HOUR_OF_DAY);
                minute = cal.get(Calendar.MINUTE);
                second = cal.get(Calendar.SECOND);
            }
        }, 1000, 1000);
    }
}