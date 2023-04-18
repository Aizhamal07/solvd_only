package practicalWithAndrei.homework2;

public class Military {
    public static void main(String[] args) {

        Soldier soldier=new Soldier("John Smith","Sergeant");
        soldier.communicate();
        soldier.shoot();

        Officer officer=new Officer("George S. Patton","General",36);
        officer.giveOrders();
        officer.makeDecisions();

       Tank tank=new Tank("M1 Abrams","Main Battle Tank",0);
       tank.move();
       tank.totalDamaged();
       Helicopter helicopter=new Helicopter("AH-64 Apache","Attack Helicopter",1);
       helicopter.move();
       helicopter.totalDamaged();

    }

}
