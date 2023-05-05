package Homeworks;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Soldier extends Military implements MilitaryPersonnel {
    private static final Logger logger = LogManager.getLogger(Soldier.class);
    private String name;
    private String rank;
    private double compensation;


    public Soldier(String name, String rank, double compensation) {
        this.name = name;
        this.rank = rank;
        this.compensation=compensation;
    }
    public Soldier(){

    }

    public String getName() {
        logger.info(name);
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

    public final void shoot(){
        logger.info(rank+" "+name+" is shooting");
    }

    public String toString() {
        return "Personnel [name=" + name + ", rank=" + rank +", compensation"+compensation+ "]";
    }


}
