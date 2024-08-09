package Visitor;

public class TimeAndMaterials implements ReportElement{
    long costPerHour;
    long hour;

    public TimeAndMaterials(long costPerHour, long hour) {
        this.costPerHour = costPerHour;
        this.hour = hour;
    }

    @Override
    public <R> R accept(Visitor<R> visitor) {
        return visitor.visit(this);
    }
}
