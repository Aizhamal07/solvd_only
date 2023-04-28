package practicalWithAndrei.homework2;

public class Expences implements MilitaryBudgets {

    private double totalExpences;
    private double adjustedBudget;

    public Expences(double totalBudget,double adjustedBudget){
        this.totalExpences=totalBudget;
        this.adjustedBudget=adjustedBudget;
    }

    @Override
    public double getTotalExpences() {
        return totalExpences;
    }

    @Override
    public void adjustedBudget(String department, double amount) {
        totalExpences+=amount;
        adjustedBudget-=amount;

    }
}
