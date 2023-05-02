package practicalWithAndrei.homework3;

public final class Helicopter implements MilitaryVehicles {
    private double cost;
    private int quantity;
    private boolean functional;
    private String type;

    public Helicopter(String type, double cost, int quantity, boolean functional){
        this.type=type;
        this.cost=cost;
        this.quantity=quantity;
        this.functional=functional;

    }

    @Override
    public String getType() {
        System.out.println("Vehicle type: "+type);
        return type;
    }

    @Override
    public double getCost() {
        System.out.println(type+" costs "+cost);
        return cost;
    }
    public void setCost(double cost) {
        this.cost = cost;

    }

    @Override
    public int getQuantity() {
        System.out.println("There are " + quantity + " " +type);
        return quantity;
    }

    @Override
    public boolean isFunctional() {
        return false;
    }
    @Override
    public String toString() {
        return "Helicopter {" +
                "cost=" + cost +
                ", quantity=" + quantity +
                ", functional=" + functional +
                ", type='" + type + '\'' +
                '}';
    }

}
