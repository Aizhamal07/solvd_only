package practicalWithAndrei.homework3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {



        AirForce airForce = new AirForce("Steve Johnson","Officer",100000);
        try {
            airForce.allocateBudget(2000000);
        } catch (Military.MilitaryBudgetException e) {
            System.out.println(e.getMessage());
        }



        Drones drone = new Drones("Drone 1", 1000.0,7,"yes");
        try {
            drone.isFunctional();
        } catch (DronesException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

    Soldier soldier=new Soldier("John Smith","Soldier");
        soldier.addMilitaryPersonnel("Peter Tonn","soldier");
        soldier.toString();
        soldier.shoot();


       Officer officer=new Officer("Tim Connor","Officer");
        try {
            officer.makeDecisions(officer.makeDecisions("Attack"));
        } catch (Officer.InvalidDecisionException e) {
            System.out.println(e.getMessage());
        }




    }
}
