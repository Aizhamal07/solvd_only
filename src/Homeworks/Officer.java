package Homeworks;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Officer implements MilitaryPersonnel {
    private static final Logger logger = LogManager.getLogger(Officer.class);
    private String name;
    private String rank;

    private double compensation;

    public Officer(String name, String rank) {
        this.name = name;
        this.rank = rank;

    }

    public String toString() {
        return "Personnel [name=" + name + ", rank=" + rank + "]";
    }


    public final void giveOrders() {
        logger.info(rank + " " + name + " is giving the order!");
    }

    public final String makeDecisions(String decision) throws InvalidDecisionException {
        if (decision.equals("Attack")) {
            logger.info("We will launch an attack.");
        } else if (decision.equals("Retreat")) {
            logger.info("We will retreat.");
        } else {
            logger.info("Invalid decision.");
        }
        return decision;
    }

    public Officer(String name, String rank, double compensation) {
        this.name = name;
        this.rank = rank;
        this.compensation = compensation;
    }
    public Officer(){

    }

    public String getName() {
        System.out.println(name);
        return name;

    }

    public String getRank() {
        System.out.println(rank);
        return rank;
    }

    @Override
    public double getCompensation() {
        return compensation;
    }


}
