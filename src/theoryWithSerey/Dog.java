package theoryWithSerey;

public class Dog extends Animal {

    private String breed;

    @Override
    public void print() {
        System.out.println("Dog has breed...");

    }

    public Dog(String name,int age,String breed){
        super(name,age);
//        this.name=name;
//        this.age=age;
      this.breed=breed;

    }
    public void callProtected(){
        super.callProtected();
        super.age=10;
    }


    protected void makeSound() {
        System.out.println("bark");
    }

    public class Cat extends Animal{
        public Cat(String name, int age) {
            super(name, age);
        }

        public void makeSound(){
            System.out.println("meow");
        }
    }

    public abstract class Cow extends Animal{
        public Cow(String name, int age) {
            super(name, age);
        }
    }


}
