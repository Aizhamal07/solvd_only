package theoryWithSerey;

public abstract class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {

    }

    public void print() {
        System.out.println("Animal name is...");
    }

    protected void callProtected() {
    }

//    protected abstract void makeSound(){
//
//    }
}


