package practicalWithAndrei.homework3;

public final class Helicopter extends Military implements MilitaryVehicles {
    private double cost;
    private int quantity;
    private boolean functional;
    private String type;

    public Helicopter(String type, double cost, int quantity, boolean functional){

    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public boolean isFunctional() {
        return false;
    }
    @Override
    public String toString() {
        return "Helicopter{" +
                "cost=" + cost +
                ", quantity=" + quantity +
                ", functional=" + functional +
                ", type='" + type + '\'' +
                '}';
    }

}
