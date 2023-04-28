package practicalWithAndrei.homework2;

public class AirForce extends Militarys implements MilitaryTraining {


    @Override
    public void doBasicTraining() {
        System.out.println("Performing basic training");
    }

    @Override
    public void doSpecializedTraining(String specialty) {
        System.out.println("Performing specialized training for the AirForce in "+specialty);
    }

    @Override
    public double getTotalExpences() {
        return 0;
    }

    @Override
    public void adjustedBudget(String department, double amount) {

    }

    @Override
    public void defend() {

    }

    @Override
    public void protect() {

    }

    @Override
    public void setRank(String rank) {

    }

    @Override
    public String getRank() {
        return null;
    }

    @Override
    public void addMilitaryPersonnel() {

    }

    @Override
    public void removeMilitaryPersonnel() {

    }

    @Override
    public double getTotalBudget() {
        return 0;
    }

    @Override
    public void report() {

    }

    @Override
    public void retire() {

    }
}
