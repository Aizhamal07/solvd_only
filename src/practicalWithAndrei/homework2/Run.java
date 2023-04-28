package practicalWithAndrei.homework2;

public class Run {

    public static void main(String[] args) {

        Soldier soldier=new Soldier("John Smith","Sergeant");
        soldier.communicate();
        soldier.shoot();

        Officer officer=new Officer("George S. Patton","General");
        officer.giveOrders();
        officer.makeDecisions();

        Helicopter helicopter=new Helicopter(1000000);


        Medical medical=new Medical("Tim Connor","Advanced trauma care","mild");
        medical.heal();


//        Drones mines=new Drones("Anti-tank mines","old");
//        mines.explode();


    }

}
