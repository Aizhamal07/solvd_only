package Homeworks;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Army implements MilitaryForces {
    private static final Logger logger = LogManager.getLogger(Army.class);
    private double armyBudget;
    public static final String army = "US Army";

    public Army() {

    }

    public void setArmyBudget(double armyBudget) {
        this.armyBudget = armyBudget;
        Military.allocateBudget((long) armyBudget);
    }

    public double getArmyBudget() {
        return armyBudget;
    }

    public void ambush() {
        logger.info("Army is conducting an ambush.");
    }

    @Override
    public void deploy() {
        logger.info("Deploying Army with soldiers.");
    }

    @Override
    public void retreat() {
        logger.info("Retreating Army.");
    }

    @Override
    public String toString() {
        return army + ": {" +
                "Army budget: $" + getArmyBudget() +
                "\nRemaining budget $" + Military.getRemainingBudget(Military.budget-armyBudget) +
                '}';
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(armyBudget);
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
        Army other = (Army) obj;
        if (Double.doubleToLongBits(armyBudget) != Double.doubleToLongBits(other.armyBudget))
            return false;
        return true;
    }

}
