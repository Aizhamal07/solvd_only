package theoryWithSerey;

public interface IPrintable {

    default void printDefault(){
        System.out.println("Default printing");
        //void print();
    }
//    public class Cat extends Animal implements Irunnable {
//        public Cat(String name, int age) {
//            super(name, age);
//        }
//    }
}
