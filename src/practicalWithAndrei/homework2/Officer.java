package practicalWithAndrei.homework2;

public class Officer extends Soldier{
    private String name;
    public String rank;
    public int yearsOfExperience;

    public Officer (String name,String rank,int yearsOfExperience){
        this.name = name;
        this.rank = rank;

        this.yearsOfExperience=yearsOfExperience;

    }

    @Override
    public void setName(String name){
        this.name=name;
    }
    @Override
    public String getName(){
        return name;
    }


    public void giveOrders(){
        System.out.println(rank+" "+name+" is giving the order!");
    }
    public void makeDecisions(){
        System.out.println(rank+" "+name+" is making decisions!");
    }
}
