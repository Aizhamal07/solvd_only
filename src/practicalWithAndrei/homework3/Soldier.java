package practicalWithAndrei.homework3;

import java.util.ArrayList;

public class Soldier extends Military {

    private String name;
    private String rank;
    private long totalBudget;


    public Soldier(String name, String rank) {
        this.name = name;
        this.rank = rank;
    }
    public Soldier(long totalBudget){
        this.totalBudget=totalBudget;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println(name);
    }

    public String getName() {
        System.out.println(name);
        return name;

    }
    public void setRank(String rank) {
        System.out.println(rank);
        this.rank = rank;
    }
    public String getRank() {
        System.out.println(rank);
        return rank;
    }

    public long getTotalBudget(){
        return totalBudget;
    }
    public void setTotalBudget(long totalBudget){
        this.totalBudget=totalBudget;
    }

    public String toString() {
        return "Personnel [name=" + name + ", rank=" + rank + "]";
    }
    ArrayList<Soldier> personnelList = new ArrayList<>();

    @Override
    public void addMilitaryPersonnel(String name, String rank) {
        Soldier personnel = new Soldier(name, rank);
        personnelList.add(personnel);
    }

    @Override
    public void removeMilitaryPersonnel(String name, String rank) {
        for (Soldier person : personnelList) {
            if (person.getName().equals(name) && person.getRank() == rank) {
                personnelList.remove(person);
                break;
            }
        }
    }

    @Override
    public void report() {
        System.out.println("Total budget currently: "+totalBudget);
    }

    @Override
    public void defend() {
        System.out.println("Soldiers are defending our country!");
    }

    public final void shoot(){
        System.out.println(rank+" "+name+" is shooting");
    }
}
