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
                    event.getGroup().sendMessage(MessageUtils.newChain(at,new PlainText(" 60秒读懂世界，看看最近都发生了什么事？"),Morning.getMorningImage(event.getGroup())));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }else if (chain.contentToString().startsWith("时间表")) {
                if (event.getGroup().getId() == 512988077 || event.getGroup().getId() == 871253707) {
                    event.getGroup().sendMessage(MessageUtils.newChain(at, Image.fromId("{DF57B6A5-D712-A9F8-BD40-CFBC6324664E}.png")));
                }
            }else if (chain.contentToString().startsWith("课程表")) {
                if (event.getGroup().getId() == 512988077 || event.getGroup().getId() == 871253707) {
                    event.getGroup().sendMessage(MessageUtils.newChain(at, Image.fromId("{BADF50E4-9050-0EBD-1815-C6656265C2C6}.jpg")));
                }
            }else if (chain.contentToString().contains("安然")) {
                event.getGroup().sendMessage(MessageUtils.newChain(
                        at, new PlainText(" 请问您叫我主人干什么？")
                ));
            }else if (chain.contentToString().startsWith("今天作业是什么")){
                event.getGroup().sendMessage(MessageUtils.newChain(at, new PlainText(" 今天的作业是：\n"),
                        new PlainText("语文: " + Homework.chinese + "\n"),
                        new PlainText("数学: " + Homework.math + "\n"),
                        new PlainText("英语: " + Homework.eng + "\n"),
                        new PlainText("物理: " + Homework.phy + "\n"),
                        new PlainText("化学: " + Homework.che + "\n"),
                        new PlainText("生物: " + Homework.bio + "\n")));
            }else if (chain.contentToString().startsWith("提交作业 语文 ")){
                String[] cHome = event.getMessage().toString().split(" ");
                Homework.chinese = cHome[cHome.length-1];
                event.getGroup().sendMessage(MessageUtils.newChain(at, new PlainText(" 设置成功！")));
            }else if (chain.contentToString().startsWith("提交作业 数学 ")){
                String[] mHome = event.getMessage().toString().split(" ");
                Homework.math = mHome[mHome.length-1];
                event.getGroup().sendMessage(MessageUtils.newChain(at, new PlainText(" 设置成功！")));
            }else if (chain.contentToString().startsWith("提交作业 英语 ")){
                String[] eHome = event.getMessage().toString().split(" ");
                Homework.eng = eHome[eHome.length-1];
                event.getGroup().sendMessage(MessageUtils.newChain(at, new PlainText(" 设置成功！")));
            }else if (chain.contentToString().startsWith("提交作业 物理 ")){
                String[] pHome = event.getMessage().toString().split(" ");
                Homework.phy = pHome[pHome.length-1];
                event.getGroup().sendMessage(MessageUtils.newChain(at, new PlainText(" 设置成功！")));
            }else if (chain.contentToString().startsWith("提交作业 化学 ")){
                String[] cheHome = event.getMessage().toString().split(" ");
                Homework.che = cheHome[cheHome.length-1];
                event.getGroup().sendMessage(MessageUtils.newChain(at, new PlainText(" 设置成功！")));
            }else if (chain.contentToString().startsWith("提交作业 生物 ")){
                String[] bioHome = event.getMessage().toString().split(" ");
                Homework.bio = bioHome[bioHome.length-1];
                event.getGroup().sendMessage(MessageUtils.newChain(at, new PlainText(" 设置成功！")));
            }else if (chain.contentToString().startsWith("倒计时")){
                event.getGroup().sendMessage(MessageUtils.newChain(at, new PlainText(" 当你发送完这条消息的时候，你距离高考就仅剩下: " + Homework.Djs() + "天了。")));
            }else if (chain.contentToString().startsWith("帮助")){
                event.getGroup().sendMessage(MessageUtils.newChain(at, new PlainText(" 你可以问我：\n" +
                        "1. 你的主人是谁？\n" +
                        "2. 几点了\n" +
                        "3. 60s\n" +
                        "4. 一言\n" +
                        "5. 机器人\n" +
                        "6. 时间表\n" +
                        "7. 课程表\n" +
                        "8. 今天作业是什么？\n" +
                        "9. 倒计时\n" +
                        "快试试吧！！！")));
            }
        });
    }
}
