package Visitor;

public class MonthlyCostRepoert implements Visitor<Long>{
    @Override
    public Long visit(FixedPrice fixedPrice) {
        return fixedPrice.costPerYear/12;
    }

    @Override
    public Long visit(TimeAndMaterials timeAndMaterials) {
        return timeAndMaterials.costPerHour * timeAndMaterials.hour;
    }

    @Override
    public Long visit(SupportContract supportContract) {
        return supportContract.costPerMonth;
    }
}
