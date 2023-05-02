package practicalWithAndrei.homework3;

import java.util.Objects;

public class AirForce extends Military implements MilitaryForces{
    private double airForceBudget;

    public static final String airForce="US Air Force";

    public AirForce() {

    }
    public void setAirForceBudget(double airForceBudget) {
        this.airForceBudget =airForceBudget;
        allocateBudget((long) airForceBudget);

    }

    public double getAirForceBudget() {
        return airForceBudget;
    }



    public void bombardment(){
        System.out.println("Air Force is conducting a bombardment.");
    }
    @Override
    public void deploy() {
        System.out.println("Deploying Air Force with planes.");

    }
    @Override
    public void retreat() {
        System.out.println("Retreating Air Force.");


    }
    @Override
    public String toString() {
        return airForce+": {" +
                "Air Force budget: $" + getAirForceBudget() +
                "\nRemaining budget $" +getRemainingBudget(budget-airForceBudget)+
                '}';
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(airForceBudget);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        AirForce other = (AirForce) obj;
        if (airForceBudget != other.airForceBudget)
            return false;
        return true;
    }
}
