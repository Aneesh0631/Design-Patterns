public class Main {

    public static void main(String[] args) {
       SingletonEager eager = SingletonEager.getEager();
        SingletonEager eager2 = SingletonEager.getEager();
        System.out.println(eager);
        System.out.println(eager2);

        SingletonStaticBlock singletonStaticBlock = SingletonStaticBlock.getInstance();
        SingletonStaticBlock singletonStaticBlock1 = SingletonStaticBlock.getInstance();

        System.out.println(singletonStaticBlock1);
        System.out.println(singletonStaticBlock);

        SingletonLAzy singletonLAzy  = SingletonLAzy.getSingletonLAzy();
        SingletonLAzy singletonLAzy1  = SingletonLAzy.getSingletonLAzy();
        System.out.println(singletonLAzy1);
        System.out.println(singletonLAzy);

        Vechicle vechicle = Vechicle.getInstance();
        Vechicle vechicle1 = Vechicle.getInstance();
        System.out.println(vechicle1);
        System.out.println(vechicle);

    }
}

class SingletonStaticBlock{
    private static SingletonStaticBlock instance;

    static {
        instance = new SingletonStaticBlock();
    }
    private SingletonStaticBlock(){

    }
    public static SingletonStaticBlock getInstance(){
        return instance;
    }
}

class SingletonEager{
    private static SingletonEager eager = new SingletonEager();
    private SingletonEager(){
    }
    public static SingletonEager getEager(){
        return eager;
    }
}


class SingletonLAzy{
    private static SingletonLAzy singletonLAzy;

    SingletonLAzy(){

    }
    public static SingletonLAzy getSingletonLAzy(){
        if(singletonLAzy == null){
            singletonLAzy = new SingletonLAzy();
        }
        return singletonLAzy;
    }
}
class Vechicle{
    private static Vechicle instance;
    public static  synchronized  Vechicle getInstance(){
        if(instance == null){
            instance = new Vechicle();
        }
        return instance;
    }


}