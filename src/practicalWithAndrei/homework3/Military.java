package practicalWithAndrei.homework3;

import java.util.ArrayList;
import java.util.List;

public abstract class Military extends Expenses implements MilitaryPersonnel,MilitaryBudget {

    public static final String usArmy = "US Army";
    private String name;
    private String rank;

    private long totalBudget;

    private List<String> personnel = new ArrayList<String>();

    static {
        System.out.println("Welcome to "+usArmy+"!");
    }


    public Military(String name,String rank,long totalBudget) {
        this.name=name;
        this.rank=rank;
        this.totalBudget=totalBudget;
    }

    public Military(){

    }
    @Override
    public long getTotalBudget() {
        System.out.println("According to "+rank+" "+name+"total budget is "+totalBudget);
        return totalBudget;
    }

    @Override
    public void setTotalBudget(long totalBudget) {
        this.totalBudget = totalBudget;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getRank() {
        return rank;
    }


    @Override
    public void addMilitaryPersonnel(String name, String rank) {
            String personnelDetails = name + " - " + rank;
            personnel.add(personnelDetails);
    }
    @Override
    public void removeMilitaryPersonnel(String name, String rank) {
        String personnelDetails = name + " - " + rank;
        for (int i = 0; i < personnel.size(); i++) {
            if (personnel.get(i).equals(personnelDetails)) {
                personnel.remove(i);
                break;
            }
        }
    }

    @Override
    public void report() {
        System.out.println("Total budget currently: "+totalBudget);
    }

    public abstract void defend();

    public static class MilitaryBudgetException extends Exception {
        public MilitaryBudgetException(String message) {
            super(message);
        }
    }

    public void allocateBudget(long amount) throws MilitaryBudgetException {
        if (amount > totalBudget) {
            throw new MilitaryBudgetException("Insufficient budget");
        }
        totalBudget -= amount;
    }

}
