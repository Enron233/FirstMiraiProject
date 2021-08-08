package org.example;

import net.mamoe.mirai.Bot;
import net.mamoe.mirai.contact.ContactList;
import net.mamoe.mirai.contact.Group;
import net.mamoe.mirai.message.data.Message;
import net.mamoe.mirai.message.data.MessageUtils;
import org.example.API.Morning;

import java.io.IOException;

public class Send {
    public static void sendMess(Message message) {
        ContactList<Group> list = Bot.getInstance(1049768206).getGroups();
        for (Group group:list){
            group.sendMessage(message);
        }
    }
    public static void sendMorning(Message message) throws IOException {
        ContactList<Group> list = Bot.getInstance(1049768206).getGroups();
        for (Group group : list) {
            group.sendMessage(MessageUtils.newChain(message,Morning.getMorningImage(group)));
        }
    }
}
