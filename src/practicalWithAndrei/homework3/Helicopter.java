package practicalWithAndrei.homework3;

import practicalWithAndrei.homework2.MilitaryEquipments;

public final class Helicopter extends Expenses implements MilitaryEquipment {

    private String name;
    private double cost;
    private int quantity;
    private String functional;

    private long totalBudget;


    public Helicopter(String name, double cost, int quantity,String functional){
        this.name=name;
        this.cost=cost;
        this.quantity=quantity;
        this.functional=functional;

    }
    public Helicopter(String name,double cost){
        this.name=name;
        this.cost=cost;
    }
     public Helicopter(long totalBudget){
        this.totalBudget=totalBudget;
     }

    @Override
    public String getName() {
        System.out.println("Equipment is "+name);
        return name;
    }
    @Override
    public double getCost() {
        System.out.println(name+" costs "+cost);
        return cost;
    }
    public void setCost(double cost){
        this.cost=cost;
    }
    @Override
    public int getQuantity() {
        System.out.println("There are "+quantity+" "+name);
        return quantity;
    }
    @Override
    public void setQuantity(int quantity) {
        this.quantity=quantity;
    }
    public void setFunctional(String functional){
        this.functional=functional;
    }
    public String getFunctional(){
        return functional;
    }
    @Override
    public boolean isFunctional() {
        if(functional.equalsIgnoreCase("yes")){
            System.out.println("Great!Still functional...");
            return true;

        }else if(functional.equalsIgnoreCase("no")){
            System.out.println("No problem!We will fix it");
            return false;
        }

        return false;
    }

    @Override
    public String toString() {
        return "Helicopter{" +
                "cost=" + cost +
                ", quantity=" + quantity +
                ", functional=" + functional +
                ", name='" + name + '\'' +
                '}';
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
