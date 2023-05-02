package practicalWithAndrei.homework3;

public class MilitaryPersonnelExpense extends Military implements  MilitaryExpenses {
    private double personnelCost;
    private int personnelCount;
    private double personnelBudget;
    public MilitaryPersonnelExpense(double personnelCost, int personnelCount, int personnelBudget) {
        this.personnelCost = personnelCost;
        this.personnelCount = personnelCount;
        this.personnelBudget=personnelBudget;
    }
    public MilitaryPersonnelExpense(){

    }

    public double getPersonnelCost() {
        return personnelCost;
    }

    public int getPersonnelCount() {
        return personnelCount;
    }

    public double getPersonnelBudget() {
        return personnelBudget;
    }
    public void setPersonnelBudget(double personnelBudget) {
        this.personnelBudget=personnelBudget;
    }



    @Override
    public double calculateExpenses() {
        return getRemainingBudget(budget-personnelBudget);
    }

    public void updatePersonnelCount(int personnelCount) {
        this.personnelCount=personnelCount;
    }

    public void updatePersonnelCost(double personnelCost){
        this.personnelCost=personnelCost;
    }

    @Override
    public String toString() {
        return "Personnel rank: " + name + " Personnel Budget: $" + personnelBudget +
                "\nRemaining budget $" + getRemainingBudget(budget - personnelBudget) +
                '}';
    }
}
