package practicalWithAndrei.homework2;

public class Sniper extends Weapon{

    public int accuracy;
    public Sniper(String name,String condition,int accuracy) {
        super(name, condition);
        this.accuracy=accuracy;
    }

    @Override
    public void fire() {
        if(accuracy==100){
            System.out.println("Sniper hit the target!");
        }else{
            System.out.println("Sniper missed the target");
        }
    }


}
