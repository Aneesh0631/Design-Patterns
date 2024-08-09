package Mediator;

import jdk.jfr.MemoryAddress;

import java.util.ArrayList;
import java.util.List;

public class Mediator {
    List<ChatUser> users = new ArrayList<>();
    public Mediator addUser(ChatUser user){
        users.add(user);
        return this;
    }

    public void sendMessage(String message, ChatUser source){
        for(ChatUser user : users){
            if(user != source){
                user.receiveMessage(message);
            }
        }
    }
}
