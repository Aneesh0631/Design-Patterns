package ChainOfResponsibility;

public class PayloadHandeler implements HandlerChain{
   String payload;
   public HandlerChain next;

    public PayloadHandeler(String payload) {
        this.payload = payload;
    }

    @Override
    public String addHandler(String inputHeader) {
        String outputHeader = inputHeader +"\n" + payload;
        if(next == null){
            return outputHeader;
        }
        else {
            return next.addHandler(outputHeader);
        }
    }
}
