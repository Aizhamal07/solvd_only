package practicalWithAndrei.homework3;

import java.util.ArrayList;

public class PSoldier extends Military implements MilitaryPersonnel {

    private String name;
    private String rank;
    private double compensation;


    public PSoldier(String name, String rank,double compensation) {
        this.name = name;
        this.rank = rank;
        this.compensation=compensation;
    }

    public String getName() {
        System.out.println(name);
        return name;

    }
    public String getRank() {
        System.out.println(rank);
        return rank;
    }

    @Override
    public double getCompensation() {
        return compensation;
    }

    public final void shoot(){
        System.out.println(rank+" "+name+" is shooting");
    }

    public String toString() {
        return "Personnel [name=" + name + ", rank=" + rank +", compensation"+compensation+"]";
    }


}
