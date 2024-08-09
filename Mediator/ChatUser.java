package Mediator;

public class ChatUser {
    String name;
    Mediator mediator;

    public ChatUser(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public void sendMessage(String sendMessage){
        System.out.println(name + ": sending message to " + sendMessage);
        mediator.sendMessage(sendMessage,this);
    }

    public void receiveMessage(String message){
        System.out.println(name +": received message" + message );
    }
}
