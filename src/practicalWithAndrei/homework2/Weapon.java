package practicalWithAndrei.homework2;

public class Weapon {
    public String name;
    public String type;

    private String condition;

    public Weapon(String name,String condition){
        this.name=name;
        this.condition=condition;

    }

    public String getCondition(){
        return condition;
    }

    public void setCondition(String condition){
        this.condition=condition;
    }
public void fire() {
    System.out.println("Fire");
}
private void reload(){
    System.out.println("Reload");
}

}
