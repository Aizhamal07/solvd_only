package practicalWithAndrei.homework2;

public class Tank extends Vehicle{

    public Tank(String name, String type, int damage) {
        super(name, type, damage);
    }

    @Override
    public void move() {
        System.out.println(type+" "+"\""+name+"\""+" is going");
    }
}
