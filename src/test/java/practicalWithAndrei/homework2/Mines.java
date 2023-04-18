package practicalWithAndrei.homework2;

public class Mines extends Weapon{

    public Mines(String name,String condition) {
        super(name, condition);
    }
    public void explode(){
        System.out.println(name+" exploded!");
    }



}
