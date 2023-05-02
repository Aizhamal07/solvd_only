package practicalWithAndrei.homework3;

import java.util.ArrayList;

public class POfficer implements MilitaryPersonnel {

    private String name;
    private String rank;

    private double compensation;

    public POfficer(String name, String rank) {
        this.name = name;
        this.rank = rank;

    }

    public String toString() {
        return "Personnel [name=" + name + ", rank=" + rank + "]";
    }


    public final void giveOrders() {
        System.out.println(rank + " " + name + " is giving the order!");
    }

    public final String makeDecisions(String decision) throws InvalidDecisionException {
        if (decision.equals("Attack")) {
            System.out.println("We will launch an attack.");
        } else if (decision.equals("Retreat")) {
            System.out.println("We will retreat.");
        } else {
            System.out.println("Invalid decision.");
        }
        return decision;
    }

    public POfficer(String name, String rank, double compensation) {
        this.name = name;
        this.rank = rank;
        this.compensation = compensation;
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
