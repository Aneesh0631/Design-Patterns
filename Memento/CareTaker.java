package Memento;

import java.util.ArrayList;

public class CareTaker {
    ArrayList<Memento> mementos = new ArrayList();

    public void saveState(Memento mem){
        mementos.add(mem);
    }
    public Memento restoreState(int index){
        return mementos.get(index);
    }
}
