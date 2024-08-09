package Observer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class EvenManager {
    Map<String, ArrayList<EventListner>> listeners = new HashMap<>();

    public EvenManager(String ... operations) {
        for(String op : operations){
            listeners.put(op,new ArrayList<>());
        }
    }
    public void subscribe(String event , EventListner listener){
        ArrayList<EventListner> users = listeners.get(event);
        if(!users.contains(listener)){
            users.add(listener);
        }
    }
    public void unsubscribe(String event, EventListner listner){
        ArrayList<EventListner> users = listeners.get(event);
        if(users.contains(listner)){
            users.remove(listner);
        }
    }
    public void notify(String event , String file){
        ArrayList<EventListner> users = listeners.get(event);
        for(EventListner user : users){
            user.notify(event,file);
        }
    }
}
