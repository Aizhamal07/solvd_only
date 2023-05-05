package Homeworks;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Runner {

    private static final Logger logger = LogManager.getLogger(Runner.class);

    public static void main(String[] args) {
        logger.info("Starting MyApp...");
        logger.debug("Debugging message...");
        logger.error("Error message...");

        AirForce airForce = new AirForce();
        airForce.setAirForceBudget(185000000000L);
        airForce.getAirForceBudget();
        System.out.println(airForce.toString());
        System.out.println(airForce.hashCode());
        airForce.bombardment();
        airForce.deploy();
        airForce.retreat();

        AirForce airForce2 = new AirForce();
        airForce2.setAirForceBudget(185000000000L);
        airForce2.getAirForceBudget();
        System.out.println(airForce.equals(airForce2));


        System.out.println("-----------------------------");

        Army army = new Army();
        army.setArmyBudget(177000000000L);
        army.getArmyBudget();
        System.out.println(army.toString());
        System.out.println(army.hashCode());
        army.ambush();
        army.deploy();
        army.retreat();

        Army army2 = new Army();
        army2.setArmyBudget(176000000000L);
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
            logger.info(personnelExpense.toString());

            System.out.println("==================================");

            Drones drone = new Drones("Drone 1", 1000.0, 7, "yes");
            try {
                drone.isFunctional();
            } catch (DronesException e) {
                logger.info("Exception caught: " + e.getMessage());
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
        System.out.println("===========================");

        SoldierCollection soldierCollection = new SoldierCollection();
        soldierCollection.addSoldier(new Soldier("John Doe", "Private", 1000));
        soldierCollection.addSoldier(new Soldier("Jane Smith", "Corporal", 2000));
        logger.info("Number of soldiers: " + soldierCollection.getSize());
        List<Soldier> soldiers = soldierCollection.getSoldiers();
        for (Soldier soldier : soldiers) {
            System.out.println(soldier);
        }
        System.out.println("====================================");

            Soldier soldier = new Soldier("Lucas Tonn","Soldier",4000);
            MilitaryPersonnel.addMilitaryPersonnel("Peter Tonn", "Soldier");
            MilitaryPersonnel.removeMilitaryPersonnel("Peter Tonn", "Soldier");
            soldier.getCompensation();
            soldier.toString();
            soldier.shoot();

        System.out.println("==============================");
        List<Officer> officerList = new ArrayList<>();
        officerList.add(new Officer("John Doe", "Captain", 5000));
        officerList.add(new Officer("Jane Smith", "Major", 7000));
        officerList.add(new Officer("Peter Tonn", "Officer", 3000));

        for (Officer officers : officerList) {
           logger.info(officers.getName());
        }

        System.out.println("===================================");
            Officer officer = new Officer();

            try {
                officer.makeDecisions("Attack");
            } catch (InvalidDecisionException e) {
                logger.info("Invalid decision: " + e.getMessage());
            }

            System.out.println("==================================");

            HelicopterCollection helicopterCollection = new HelicopterCollection();
            Helicopter cobra = new Helicopter("Cobra", 1000000, 10, true);
            Helicopter blackHawk = new Helicopter("Black Hawk", 500000, 20, true);
            Helicopter dolphin= new Helicopter("Dolphin",800000,33,true);
            helicopterCollection.addHelicopter(cobra);
            helicopterCollection.addHelicopter(blackHawk);
            helicopterCollection.addHelicopter(dolphin);
            logger.info("Number of helicopters: " + helicopterCollection.getSize());
            List<Helicopter> helicopters = helicopterCollection.getHelicopters();
            for (Helicopter helicopter : helicopters) {
                logger.info(helicopter);
            }

            helicopterCollection.removeHelicopter(cobra);
            logger.info("Number of helicopters after removal: " + helicopterCollection.getSize());


            System.out.println("============================");
            MorseCode morseCode = new MorseCode();
            morseCode.setMorseCodeMsg("Attack");
            morseCode.getMorseCodeMsg();
            morseCode.receive();

            System.out.println("==============================");
        }
    }