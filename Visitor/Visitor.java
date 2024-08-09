package Visitor;

public interface Visitor<R> {
    public R visit(FixedPrice fixedPrice);

    public R visit(TimeAndMaterials timeAndMaterials);

    public R visit(SupportContract supportContract);


}
