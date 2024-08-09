package adapter;

import java.util.ArrayList;
import java.util.List;

public class DisplayDataAdapter implements  DataBaseDataConvertor{
    @Override
    public List<DisplayDataThirdParty> convertData(List<DataBaseData> data) {
        List<DisplayDataThirdParty> returnList = new ArrayList<>();
        for(DataBaseData dataum : data){
            float index = dataum.position;
            String pos = Integer.toString(dataum.amount);
            DisplayDataThirdParty dd = new DisplayDataThirdParty(index, pos);
            returnList.add(dd);
        }
        return returnList;
    }
}
