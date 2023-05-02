package practicalWithAndrei.homework3;

import static practicalWithAndrei.homework3.Military.getRemainingBudget;

public class MilitaryEquipmentExpense implements MilitaryExpenses {

    private double equipmentsCost;
    private int equipmentsCount;
    private double equipmentsBudget;

    public MilitaryEquipmentExpense(double equipmentsCost, int equipmentsCount,double equipmentsBudget,String equipmentsName) {
        this.equipmentsCost = equipmentsCost;
        this.equipmentsCount = equipmentsCount;
        this.equipmentsBudget=equipmentsBudget;
        Military.name=equipmentsName;
    }
    public MilitaryEquipmentExpense(){

    }

    public void setEquipmentsCost(double equipmentsCost) {
        this.equipmentsCost = equipmentsCost;

    }
    public double getEquipmentsCost() {
        return equipmentsCost;
    }

    public int getEquipmentsCount() {
        return equipmentsCount;
    }

    public void setEquipmentsCount(int equipmentsCount) {
        this.equipmentsCount = equipmentsCount;
    }
    public void setEquipmentsBudget(double equipmentsBudget) {
        this.equipmentsBudget = equipmentsBudget;
    }

    @Override
    public double calculateExpenses() {
        return getRemainingBudget(Military.budget-equipmentsBudget);

    }
    @Override
    public String toString() {
        return "Equipment name: "+Military.name+" \nEquipment's budget: $"+equipmentsBudget+
                "\nRemaining budget $" + getRemainingBudget(Military.budget-equipmentsBudget) +
                '}';
    }


}

