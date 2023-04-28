package practicalWithAndrei.homework3;

public interface MilitaryEquipment {
    String getName();
    double getCost();
    int getQuantity();
    void setQuantity(int quantity);
    public boolean isFunctional() throws DronesException;




}
