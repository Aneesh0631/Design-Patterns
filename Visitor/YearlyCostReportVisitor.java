package Visitor;

public class YearlyCostReportVisitor implements Visitor<Long>{
    @Override
    public Long visit(FixedPrice fixedPrice) {
        return fixedPrice.costPerYear;
    }

    @Override
    public Long visit(TimeAndMaterials timeAndMaterials) {
        return timeAndMaterials.costPerHour * timeAndMaterials.hour;
    }

    @Override
    public Long visit(SupportContract supportContract) {
        return supportContract.costPerMonth * 12 ;
    }
}
