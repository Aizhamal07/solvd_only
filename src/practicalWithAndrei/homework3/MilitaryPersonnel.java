package practicalWithAndrei.homework3;

public interface MilitaryPersonnel {

    String getName();
    //void setRank(String rank);
    String getRank();

    static void addMilitaryPersonnel(String name, String rank) {
    }
    static void removeMilitaryPersonnel(String name, String rank) {

    }
    void report();
    }

