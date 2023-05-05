package Homeworks;
import java.util.ArrayList;
import java.util.List;
public class SoldierCollection {

        private List<Soldier> soldierList;

        public SoldierCollection() {
            soldierList = new ArrayList<>();
        }

        public void addSoldier(Soldier soldier) {
            soldierList.add(soldier);
        }

        public void removeSoldier(Soldier soldier) {
            soldierList.remove(soldier);
        }

        public int getSize() {
            return soldierList.size();
        }

        public List<Soldier> getSoldiers() {
            return soldierList;
        }

}
