package practicalWithAndrei.homework2;

public abstract class Vehicle {
    public String name;
    public String type;
    private int damage;

    public Vehicle(String name,String type,int damage ){
        this.name=name;
        this.type=type;
        this.damage=damage;
    }
    public int getDamage(){
        return damage;
    }
    public void setDamage(int damage){
        this.damage=damage;
    }

    public void totalDamaged() {
        if (damage > 0) {

            System.out.println("There are total of " + damage + " " + "damaged \"" + name + "\"");
        }else{
            System.out.println("All "+type+" \""+name+"\" are in good shape!");
        }
    }
    public abstract void  move();

}
