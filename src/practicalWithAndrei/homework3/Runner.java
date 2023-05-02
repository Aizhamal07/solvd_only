package practicalWithAndrei.homework3;

public class Runner {

    public static void main(String[] args) {

        MorseCode morseCode = new MorseCode();
        morseCode.setMorseCodeMsg("Kuba");
        morseCode.getMorseCodeMsg();
        morseCode.receive();

        System.out.println("==============================");


        AirForce airForce = new AirForce();
        airForce.bombardment();
        airForce.deploy();
        airForce.retreat();
        airForce.setAirForceBudget(185000000000L);
        airForce.getAirForceBudget();
        System.out.println(airForce.toString());
        System.out.println(airForce.hashCode());

        AirForce airForce2 = new AirForce();
        airForce2.setAirForceBudget(175000000000L);
        airForce2.getAirForceBudget();
        System.out.println(airForce2.equals(airForce));


        System.out.println("-----------------------------");

        Army army = new Army();
        army.ambush();
        army.deploy();
        army.retreat();
        army.setArmyBudget(177000000000L);
        army.getArmyBudget();
        System.out.println(army.toString());
        System.out.println(army.hashCode());

        Army army2 = new Army();
        army2.setArmyBudget(177000000000L);
        System.out.println(army2.equals(army));

        System.out.println("=================================");

        MilitaryEquipmentExpense equipmentExpense = new MilitaryEquipmentExpense(2000, 300, 177000000000L, "Drones");
        equipmentExpense.setEquipmentsBudget(19000000000l);
        //equipmentExpense.getEquipmentsBudget();
        equipmentExpense.setEquipmentsCount(1300);
        equipmentExpense.setEquipmentsCost(2000);
        equipmentExpense.getEquipmentsCost();
        equipmentExpense.getEquipmentsCount();
        equipmentExpense.calculateExpenses();
        System.out.println(equipmentExpense.toString());

        System.out.println("=====================================");

        MilitaryPersonnelExpense personnelExpense = new MilitaryPersonnelExpense();
        personnelExpense.setPersonnelBudget(160000000);
        personnelExpense.updatePersonnelCount(18900000);
        personnelExpense.updatePersonnelCost(100000.0);
        personnelExpense.getPersonnelCost();
        personnelExpense.getPersonnelBudget();
        personnelExpense.getPersonnelCount();
        personnelExpense.calculateExpenses();
        System.out.println(personnelExpense.toString());

        System.out.println("==================================");

        Drones drone = new Drones("Drone 1", 1000.0, 7, "yes");
        try {
            drone.isFunctional();
        } catch (DronesException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        drone.getName();
        drone.setQuantity(345);
        drone.setCost(1000);
        drone.getCost();
        drone.getQuantity();
        drone.hashCode();
        System.out.println(drone.toString());

        Drones drone2 = new Drones("Drone2", 1000, 10, "yes");
        drone.equals(drone2);
        System.out.println(drone.toString());


        PSoldier soldier = new PSoldier("John Smith", "Soldier", 110000);
        MilitaryPersonnel.addMilitaryPersonnel("Peter Tonn", "soldier");
        MilitaryPersonnel.removeMilitaryPersonnel("Peter Tonn","soldier");
        soldier.getCompensation();
        soldier.toString();
        soldier.shoot();


        POfficer officer = new POfficer("Tim Connor", "Officer");
        try {
            officer.makeDecisions("Attack");
        } catch (InvalidDecisionException e) {
            System.out.println("Invalid decision: " + e.getMessage());
        }
    }
}
