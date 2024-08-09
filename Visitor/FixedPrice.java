package Visitor;

public class FixedPrice implements ReportElement{
    long costPerYear;

    public FixedPrice(long costPerYear) {
        this.costPerYear = costPerYear;
    }

    @Override
    public <R> R accept(Visitor<R> visitor) {
        return visitor.visit(this);
    }
}
