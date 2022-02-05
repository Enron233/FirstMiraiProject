package org.example;

import net.mamoe.mirai.message.data.PlainText;
import java.io.IOException;
import java.util.Calendar;


public class Hello {
    public static void timeHello() throws IOException {
        if (Plugin.hour == 5 && Plugin.minute == 50 && Plugin.second == 0 && !Plugin.hadSent) {
            Send.sendMess(new PlainText("早上好！美好的一天开始了！今天是2022年" +
                    (Plugin.cal.get(Calendar.MONTH)+1) + "月" +
                    Plugin.cal.get(Calendar.DATE) + "日，" +
                    "距离高考还有不到 " + (Homework.Djs()) +
                    " 天，要加油啊！"));
            Plugin.hadSent = true;
        }else if (Plugin.hour == 12 && Plugin.minute == 0 && Plugin.second == 0 && !Plugin.hadSent) {
            Send.sendMess(new PlainText("中午好！不要忘了吃午饭哦~"));
            Plugin.hadSent = true;
        }else if (Plugin.hour == 13 && Plugin.minute == 10 && Plugin.second == 0 && !Plugin.hadSent){
            Send.sendMess(new PlainText("午休时间到！短暂的小憩能保证下午长久的活力哦~~"));
            Plugin.hadSent = true;
        }else if (Plugin.hour == 18 && Plugin.minute == 0 && Plugin.second == 0 && !Plugin.hadSent) {
            Send.sendMess(new PlainText("晚饭时间到！千万不要忘记多少吃点东西哦~~"));
            Plugin.hadSent = true;
        }else if (Plugin.hour == 7 && Plugin.minute == 10 && Plugin.second == 0 && !Plugin.hadSent) {
            Send.sendMorning(new PlainText("早上好！60秒读懂世界，看看最近都发生了什么事？"));
            Plugin.hadSent = true;
        }else if (Plugin.hour == 23 && Plugin.minute == 30 && Plugin.second == 0 && !Plugin.hadSent){
            Send.sendMess(new PlainText("已经晚上十一点半啦！什么？你还在熬夜？！赶紧睡觉！否则明天就没有精神啦！！"));
            Plugin.hadSent = true;
        }else {
            Plugin.hadSent = false;
        }
    }
}
