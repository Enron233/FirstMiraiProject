package org.example;

import net.mamoe.mirai.message.data.PlainText;
import java.io.IOException;


public class Hello {
    public static void timeHello() throws IOException { ;
        if (Plugin.hour == 5 && Plugin.minute == 30 && Plugin.second == 0 && !Plugin.hadSent) {
            Send.sendMess(new PlainText("大家早上好！美好的一天开始了！"));
            Plugin.hadSent = true;
        }else if (Plugin.hour == 12 && Plugin.minute == 0 && Plugin.second == 0 && !Plugin.hadSent) {
            Send.sendMess(new PlainText("大家中午好！不要忘了吃午饭哦~"));
            Plugin.hadSent = true;
        }else if (Plugin.hour == 12 && Plugin.minute == 40 && Plugin.second == 0 && !Plugin.hadSent){
            Send.sendMess(new PlainText("午休时间到！短暂的小憩能保证下午长久的活力哦~~"));
            Plugin.hadSent = true;
        }else if (Plugin.hour == 21 && Plugin.minute == 50 && Plugin.second == 0 && !Plugin.hadSent) {
            Send.sendMess(new PlainText("大家晚上好！已经九点五十了！千万别忘了早点休息呀！"));
            Plugin.hadSent = true;
        }else if (Plugin.hour == 18 && Plugin.minute == 0 && Plugin.second == 0 && !Plugin.hadSent) {
            Send.sendMess(new PlainText("晚饭时间到！千万不要忘记多少吃点东西哦~~"));
            Plugin.hadSent = true;
        }else if (Plugin.hour == 6 && Plugin.minute == 35 && Plugin.second == 0 && !Plugin.hadSent) {
            Send.sendMorning(new PlainText("早上好！60s读懂世界，看看最近都发生了什么事？"));
            Plugin.hadSent = true;
        }else if (Plugin.hour == 23 && Plugin.minute == 30 && Plugin.second == 0 && !Plugin.hadSent){
            Send.sendMess(new PlainText("已经晚上十一点半啦！什么？你还在熬夜？！赶紧睡觉！否则明天就没有精神啦！！"));
            Plugin.hadSent = true;
        }else {
            Plugin.hadSent = false;
        }
    }
}
