package adapter;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        DataBaseDataGenerator gen = new DataBaseDataGenerator();
        DisplayDataAdapter adapter = new DisplayDataAdapter();
        List<DisplayDataThirdParty>  legacyData = adapter.convertData(gen.generateData());

        for(DisplayDataThirdParty datum : legacyData){
            datum.displayData();
        }
    }
}
