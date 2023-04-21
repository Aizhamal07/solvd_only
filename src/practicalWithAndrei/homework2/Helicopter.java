package practicalWithAndrei.homework2;

public class Helicopter extends Vehicle{
    public Helicopter(String name, String type, int damage) {
        super(name, type, damage);
    }
    @Override
    public void move() {
        System.out.println(type+" "+name+" is flying ");

    }
}
