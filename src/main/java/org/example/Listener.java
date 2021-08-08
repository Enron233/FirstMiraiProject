package org.example;

import net.mamoe.mirai.event.EventHandler;
import net.mamoe.mirai.event.GlobalEventChannel;
import net.mamoe.mirai.event.events.GroupMessageEvent;
import net.mamoe.mirai.message.data.*;
import org.example.API.Morning;
import org.example.API.Sentence;

import java.io.IOException;
import java.util.Objects;

public class Listener{
    @EventHandler
    public static void onListen(){
        GlobalEventChannel.INSTANCE.subscribeAlways(GroupMessageEvent.class, event -> {
            At at = new At(event.getSender().getId());
            MessageChain chain = event.getMessage();
            if (chain.contentToString().startsWith("你的主人是谁")) {
                event.getGroup().sendMessage("当然是帅气的小安啦！！！");
            }else if (chain.contentToString().startsWith("几点了")) {
                event.getGroup().sendMessage(MessageUtils.newChain(at, new PlainText(" 现在是: " + Plugin.hour + " 点 " + Plugin.minute + " 分，咋了？")));
            } else if (chain.contentToString().startsWith("一言")) {
                try {
                    event.getGroup().sendMessage(Objects.requireNonNull(Sentence.getYi()));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else if (chain.contentToString().startsWith("机器人")) {
                event.getGroup().sendMessage(MessageUtils.newChain(at, Image.fromId("{E3A5107C-BC3E-675B-6475-0C01B4E6B16F}.png")));
            }else if (chain.contentToString().startsWith("60s")) {
                try {
                    event.getGroup().sendMessage(MessageUtils.newChain(at,new PlainText(" 60s读懂世界，看看最近都发生了什么事？"),Morning.getMorningImage(event.getGroup())));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }else if (chain.contentToString().startsWith("傻逼机器人")) {
                event.getGroup().sendMessage(MessageUtils.newChain(at,new PlainText(" 你妈！！！！")));
            }else if (chain.contentToString().startsWith("时间表")) {
                if (event.getGroup().getId() == 249801649 || event.getGroup().getId() == 871253707) {
                    event.getGroup().sendMessage(MessageUtils.newChain(at, Image.fromId("{C8FE359C-9827-EF38-1F06-2A9948C2475A}.png")));
                }
            }else if (chain.contentToString().startsWith("课程表")) {
                if (event.getGroup().getId() == 249801649 || event.getGroup().getId() == 871253707) {
                    event.getGroup().sendMessage(MessageUtils.newChain(at, Image.fromId("{76305C0B-141D-41B9-99AC-9130E8FF4768}.png")));
                }
            }
        });
    }
}
