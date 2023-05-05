package Homeworks;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class AirForce implements MilitaryForces {
    private static final Logger logger = (Logger) LogManager.getLogger(AirForce.class);
    private double airForceBudget;

    public static final String airForce = "US Air Force";

    public AirForce() {

    }

    public void setAirForceBudget(double airForceBudget) {
        this.airForceBudget = airForceBudget;
        Military.allocateBudget((long) airForceBudget);

    }

    public double getAirForceBudget() {
        return airForceBudget;
    }

    public void bombardment() {
        logger.info("This is an info message");
        logger.error("This is an error message");
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
        return airForce + ": {" +
                "Air Force budget: $" + getAirForceBudget() +
                "\nRemaining budget $" + Military.getRemainingBudget(Military.budget - airForceBudget) +
                '}';
    }
    @Override
    public boolean equals(Object obj) {
        System.out.println("Calling equals method...");
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        AirForce other = (AirForce) obj;
        System.out.println("Comparing airForceBudget...");
        if (airForceBudget != other.airForceBudget) {
            System.out.println("airForceBudget is not equal");
            return false;
        }
        System.out.println("airForceBudget is equal");
        return true;
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

}
