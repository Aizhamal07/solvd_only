package practicalWithAndrei.homework3;

public interface MilitaryBudget{

    static long getTotalBudget() {
        return 0;
    }

    void setTotalBudget(long totalBudget);


    void addMilitaryPersonnel(String name, String rank);

    void removeMilitaryPersonnel(String name, String rank);
}
