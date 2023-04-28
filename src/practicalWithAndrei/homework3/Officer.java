package practicalWithAndrei.homework3;

import java.util.ArrayList;

public class Officer extends Military{

    private String name;
    private String rank;
    private long totalBudget;

    //private List<String> personnel = new ArrayList<String>();

    public Officer(String name,String rank) {
        this.name = name;
        this.rank = rank;

    }
    public Officer(long totalBudget){
        this.totalBudget=totalBudget;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRank(String rank) {
        this.rank=rank;

    }
    public String getRank() {

        return rank;
    }

    public long getTotalBudget(){
        return totalBudget;
    }
    public void setTotalBudget(long totalBudget){
        this.totalBudget=totalBudget;
    }

    public String toString(){
        return "Personnel [name=" + name + ", rank=" + rank + "]";
    }

    ArrayList<Officer> personnelList = new ArrayList<>();

    @Override
    public void addMilitaryPersonnel(String name, String rank) {
            Officer personnel = new Officer(name, rank);
            personnelList.add(personnel);
        }
    @Override
    public void removeMilitaryPersonnel(String name, String rank) {
        for (Officer person : personnelList) {
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
        System.out.println("Officers are defending our country!");

    }

    public final void  giveOrders(){
        System.out.println(rank+" "+name+" is giving the order!");
    }
    public final String makeDecisions(String decision) throws InvalidDecisionException {
        if (decision.equals("Attack")) {
            System.out.println("We will launch an attack.");
        } else if (decision.equals("Retreat")) {
            System.out.println("We will retreat.");
        } else {
            System.out.println("Invalid decision.");
        }
        return decision;
    }

    public static class InvalidDecisionException extends Exception {
        public InvalidDecisionException(String message) {
            super(message);
        }
    }







}
