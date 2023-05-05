package Homeworks;

import java.util.ArrayList;
import java.util.List;

public class HelicopterCollection {
        private List<Helicopter> helicopters;

        public HelicopterCollection() {
            this.helicopters = new ArrayList<>();
        }

        public void addHelicopter(Helicopter helicopter) {
            this.helicopters.add(helicopter);
        }

        public void removeHelicopter(Helicopter helicopter) {
            this.helicopters.remove(helicopter);
        }

        public List<Helicopter> getHelicopters() {
            return this.helicopters;
        }

        public int getSize() {
            return this.helicopters.size();
        }


    }
