package practicalWithAndrei.homework3;

public interface MilitaryPersonnel {

    String getName();

    //void setRank(String rank);
    String getRank();

    double getCompensation();

    static void addMilitaryPersonnel(String name, String rank) {
    }

    static void removeMilitaryPersonnel(String name, String rank) {

    }
}

