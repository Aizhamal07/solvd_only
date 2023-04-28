package practicalWithAndrei.homework3;

import java.util.Objects;

public final class Drones extends Expenses implements MilitaryEquipment {
    private String name;
    private double cost;
    private int quantity;
    private String functional;

    private long totalBudget;


    public Drones(String name, double cost, int quantity, String functional) {
        this.name = name;
        this.cost = cost;
        this.quantity = quantity;
        this.functional = functional;

    }

    public Drones(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public Drones(long totalBudget) {
        this.totalBudget = totalBudget;
    }

    @Override
    public String getName() {
        System.out.println("Equipment is " + name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getCost() {
        System.out.println(name + " costs " + cost);
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;

    }

    @Override
    public int getQuantity() {
        System.out.println("There are " + quantity + " " + name);
        return quantity;
    }

    @Override
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setFunctional(String functional) {
        this.functional = functional;
    }

    public String getFunctional() {
        return functional;
    }

    @Override
    public boolean isFunctional() throws DronesException {
        if (functional.equalsIgnoreCase("yes")) {
            System.out.println("Great!Still functional...");
            return true;

        } else if (functional.equalsIgnoreCase("no")) {
            System.out.println("No problem!We will fix it");
            throw new DronesException("Drone is not functional");
        } else {
            throw new DronesException("Functional status is not valid");
        }
    }

    @Override
    public String toString() {
        return "Drones{" +
                "cost=" + cost +
                ", quantity=" + quantity +
                ", functional=" + functional +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((functional == null) ? 0 : functional.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Drones drones = (Drones) obj;
        return Double.compare(drones.cost, cost) == 0 &&
                quantity == drones.quantity &&
                Objects.equals(functional, drones.functional) &&
                Objects.equals(name, drones.name);
    }


    @Override
    public long getTotalBudget() {
        return totalBudget;
    }

    @Override
    public void addMilitaryPersonnel(String name, String rank) {

    }

    @Override
    public void removeMilitaryPersonnel(String name, String rank) {

    }
}
