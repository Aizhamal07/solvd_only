package practicalWithAndrei.homework3;

public class MilitaryEquipmentExpense extends Military implements MilitaryExpenses {

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
        return getRemainingBudget(budget-equipmentsBudget);

    }


    @Override
    public String toString() {
        return "Equipment name: "+name+" Equipment's budget: $"+equipmentsBudget+
                "\nRemaining budget $" + getRemainingBudget(budget-equipmentsBudget) +
                '}';
    }


}

