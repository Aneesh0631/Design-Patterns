package Visitor;

public interface ReportElement {
    <R> R accept(Visitor<R> visitor);
}
