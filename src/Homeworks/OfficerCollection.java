package Homeworks;

import java.util.ArrayList;
import java.util.List;
public class OfficerCollection {
        private List<Officer> officerList;

        public OfficerCollection() {
            this.officerList = new ArrayList<>();
        }

        public void addOfficer(Officer officer) {
            officerList.add(officer);
        }

        public void removeOfficer(Officer officer) {
            officerList.remove(officer);
        }

        public int getSize() {
            return officerList.size();
        }

        public List<Officer> getOfficers() {
            return officerList;
        }
}
