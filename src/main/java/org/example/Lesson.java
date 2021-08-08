package org.example;

import net.mamoe.mirai.Bot;
import net.mamoe.mirai.message.data.Image;
import net.mamoe.mirai.message.data.MessageUtils;
import net.mamoe.mirai.message.data.PlainText;

import java.util.Objects;

public class Lesson {
    public static void lessonTx() {
        if (Plugin.xq == 2 && Plugin.hour == 7 && Plugin.minute == 0 && Plugin.second == 0 && !Plugin.hadSent) {
            Objects.requireNonNull(Bot.getInstance(1049768206).getGroup(871253707)).sendMessage(MessageUtils.newChain(new PlainText("同学们早上好！今天是星期一，美好的一周开始啦！！！现在已经七点多了，别忘了起床上课！今天的课程有:"), Image.fromId("{1DD71D04-1642-504A-9548-8AA128281D5D}.png")));
            Plugin.hadSent = true;
        } else if (Plugin.xq == 3 && Plugin.hour == 7 && Plugin.minute == 0 && Plugin.second == 0 && !Plugin.hadSent) {
            Objects.requireNonNull(Bot.getInstance(1049768206).getGroup(871253707)).sendMessage(MessageUtils.newChain(new PlainText("同学们早上好！今天是星期二，昨天已经一去不复返了！！！现在已经七点多了，别忘了起床上课！今天的课程有:"), Image.fromId("{874850DE-47CA-6C8B-7EF5-495694ECFA6A}.png")));
            Plugin.hadSent = true;
        } else if (Plugin.xq == 4 && Plugin.hour == 7 && Plugin.minute == 0 && Plugin.second == 0 && !Plugin.hadSent) {
            Objects.requireNonNull(Bot.getInstance(1049768206).getGroup(871253707)).sendMessage(MessageUtils.newChain(new PlainText("同学们早上好！今天是星期三，俗话说，过了星期三，不愁星期六~现在已经七点多了，别忘了起床上课！今天的课程有:"), Image.fromId("{D19DA554-4F2F-9523-D790-C6D2B56A0DE3}.png")));
            Plugin.hadSent = true;
        } else if (Plugin.xq == 5 && Plugin.hour == 7 && Plugin.minute == 0 && Plugin.second == 0 && !Plugin.hadSent) {
            Objects.requireNonNull(Bot.getInstance(1049768206).getGroup(871253707)).sendMessage(MessageUtils.newChain(new PlainText("同学们早上好！今天是星期四，转眼一周已经过半了！！！不过现在已经七点多了，别忘了起床上课！今天的课程有:"), Image.fromId("{6A92AA85-9652-CFD3-D83B-A7BFFC566E0E}.png")));
            Plugin.hadSent = true;
        } else if (Plugin.xq == 6 && Plugin.hour == 7 && Plugin.minute == 0 && Plugin.second == 0 && !Plugin.hadSent) {
            Objects.requireNonNull(Bot.getInstance(1049768206).getGroup(871253707)).sendMessage(MessageUtils.newChain(new PlainText("同学们早上好！今天是星期五，嘿嘿，周末马上就要来到啦！！！现在已经七点多了，别忘了起床上课！今天的课程有:"), Image.fromId("{791A5315-81E8-BC9B-B1DC-5B00E9AAFE9A}.png")));
            Plugin.hadSent = true;
        } else if (Plugin.xq == 7 && Plugin.hour == 7 && Plugin.minute == 0 && Plugin.second == 0 && !Plugin.hadSent) {
            Objects.requireNonNull(Bot.getInstance(1049768206).getGroup(871253707)).sendMessage(MessageUtils.newChain(new PlainText("同学们早上好！今天是星期六，这周马上就要结束啦！！！现在已经七点多了，别忘了起床上课！今天的课程有:"), Image.fromId("{8268DC04-9568-E063-69A3-042862ADA548}.png")));
            Plugin.hadSent = true;
        } else if (Plugin.xq == 1 && Plugin.hour == 7 && Plugin.minute == 0 && Plugin.second == 0 && !Plugin.hadSent) {
            Objects.requireNonNull(Bot.getInstance(1049768206).getGroup(871253707)).sendMessage(MessageUtils.newChain(new PlainText("同学们早上好！今天是星期日，下午有一堆自习课~~现在已经七点多了，别忘了起床上课！今天的课程有:"), Image.fromId("{25A25481-0D71-EFAF-F405-D3D180DDA573}.png")));
            Plugin.hadSent = true;
        } else {
            Plugin.hadSent = false;
        }
    }
}
