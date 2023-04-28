package practicalWithAndrei.homework2;

public interface MilitaryPersonnels extends MilitaryBudgets {
    void setRank(String rank);
    public String getRank();
    public void addMilitaryPersonnel();
    public void removeMilitaryPersonnel();

    double getTotalBudget();

    public void report();
    public void retire();





}
