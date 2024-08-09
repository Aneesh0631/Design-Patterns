package adapter;

import java.util.ArrayList;
import java.util.List;

public class DataBaseDataGenerator

{
    public List<DataBaseData> generateData(){
        List<DataBaseData> list = new ArrayList<>();

        list.add(new DataBaseData(2,2));
        list.add(new DataBaseData(22,42));
        list.add(new DataBaseData(35,33));
        list.add(new DataBaseData(66,25));
        return list;
    }
}
