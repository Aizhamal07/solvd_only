package practicalWithAndrei.homework2;

public class Soldier {
    private String name;
    public String rank;

    public Soldier(){

    }
    public Soldier (String name,String rank){
        this.name=name;
        this.rank=rank;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }



    public void shoot(){
        System.out.println(rank+" "+name+" is shooting");
    }

    public void communicate(){
        System.out.println(rank+" "+name+" is communicating with other soldiers");
    }
}
