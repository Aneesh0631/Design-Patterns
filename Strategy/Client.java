package Strategy;

import java.util.Random;

public class Client {
    public static void main(String[] args) {


        LowerCaseStrategy str1 = new LowerCaseStrategy();
        UpperCaseStrategy str2 = new UpperCaseStrategy();
        RandomCaseStrategy str3 = new RandomCaseStrategy();

        String strig = "Aneesh is a good guy";

        Executor executor = new Executor(str1);
        executor.printString(strig);
        Executor executor2 = new Executor(str2);
        Executor executor3 = new Executor(str3);

        executor2.printString(strig);
        executor3.printString(strig);
    }
}
