package practicalWithAndrei.homework3;

public abstract class Expenses {
    //the cost of paying military personnel like salaries,benefits,bonuses
    double getPersonnelBudget() {
        return 0;
    }

    double getMedicalExpenses(){
        return 0;
    }

    //the cost of operating and maintaining military equipment,bases and facilities like fuel,repairs and supplies.
    double getOperations_MaintenanceBudget() {
        return 0;
    }

    //the cost for getting new military equipment like weapons,vehicles...
    double getProcurementBudget() {
        return 0;
    }

    //the cost of developing and testing new military techs
    double getResearch_developmentBudget() {
        return 0;
    }

    //the cost of training military personnel
    double trainingBudget() {
        return 0;
    }

    void setPersonnelBudget(double personnelBudget) {

    }

    void setOperationsBudget(double operationsBudget) {

    }

    void setProcurementBudget(double procurementBudget) {

    }

    void setResearchBudget(double researchBudget) {

    }

    void setTrainingBudget(double trainingBudget) {

    }


    public abstract long getTotalBudget();

    public abstract void addMilitaryPersonnel(String name, String rank);

    public abstract void removeMilitaryPersonnel(String name, String rank);
}
