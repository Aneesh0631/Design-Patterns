package Factory;

public class FactoryOS {
    public OS getInstance(String str){
        if(str.equals("w")){
            return new Windows();
        } else if (str.equals("a")) {
            return new Android();
        }else{
            return new IOS();
        }
    }
}
