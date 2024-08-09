package composite;

public class Client {
    public static void main(String[] args) {
        Composite computer = new Composite("PC");
        Equipment processor = new Equipment("Processor" , 200);
        Equipment hdd = new Equipment("Hard Drive" , 250);
        Composite mem = new Composite("Mem");
        Equipment rom = new Equipment("ROM" , 500);
        Equipment ram = new Equipment("RAM" , 100);

        mem.add(ram).add(rom);
        computer.add(processor).add(hdd).add(mem);

        System.out.println("PC price "  + computer.getPrice());
    }
}
