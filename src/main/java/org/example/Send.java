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
        for (int i=0;i<Bot.getInstances().size();i++){
            ContactList<Group> list = Bot.getInstances().get(i).getGroups();
            for (Group group:list){
                group.sendMessage(message);
            }
        }
    }
    public static void sendMorning(Message message) throws IOException {
        ContactList<Group> list = Bot.getInstances().get(0).getGroups();
        for (Group group : list) {
            group.sendMessage(MessageUtils.newChain(message,Morning.getMorningImage(group)));
        }
    }
}
