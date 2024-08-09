package Visitor;

public class SupportContract implements ReportElement{
    long costPerMonth;

    public SupportContract(long costPerMonth) {
        this.costPerMonth = costPerMonth;
    }

    @Override
    public <R> R accept(Visitor<R> visitor) {
        return visitor.visit(this);
    }
}
