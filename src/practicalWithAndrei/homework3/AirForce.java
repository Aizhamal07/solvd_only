package practicalWithAndrei.homework3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AirForce extends Military implements MilitaryTraining{

    public static final String airForce="US Air Force";
    private long totalBudget;
    private String rank;
    private String name;

    private double trainingBudget;


    private List<String> personnel = new ArrayList<String>();

    public AirForce(String name,String rank,long totalBudget) {

        super(name,rank,totalBudget);

    }

    public AirForce(double trainingBudget){
        this.trainingBudget = trainingBudget;
    }


    @Override
    public long getTotalBudget() {
        return totalBudget;
    }

    @Override
    public void setTotalBudget(long totalBudget) {
       this.totalBudget= totalBudget;
    }

    @Override
    public String getRank() {
        return rank;
    }

    @Override
    public String getName() {
        return name;
    }
    @Override
    public void addMilitaryPersonnel(String name, String rank) {
        String personnelDetails = name + " - " + rank;
        personnel.add(personnelDetails);
    }
    @Override
    public void removeMilitaryPersonnel (String name, String rank) {
        String personnelDetails = name + " - " + rank;
        for (int i = 0; i < personnel.size(); i++) {
            if (personnel.get(i).equals(personnelDetails)) {
                personnel.remove(i);
                break;
            }
        }
    }
    public List<String> getPersonList() {
        return personnel;
    }

    @Override
    public void report() {
            System.out.println("Total budget currently: "+totalBudget);
    }

    @Override
    public void defend() {
        System.out.println("Air Force is ready to defend our country!");

    }

    @Override
    public void doBasicTraining() {
        System.out.println("Performing basic training");
    }

    @Override
    public void doSpecializedTraining(String specialty) {
        System.out.println("Performing specialized training for the AirForce in "+specialty);
    }


    @Override
    public String toString() {
        return "AirForce [totalBudget=" + totalBudget + ", rank=" + rank + ", name=" + name + "]";
    }



    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + (int) totalBudget;
        result = prime * result + ((rank == null) ? 0 : rank.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            AirForce other = (AirForce) obj;
            if (totalBudget != other.totalBudget)
                return false;
            if (rank == null) {
                if (other.rank != null)
                    return false;
            } else if (!rank.equals(other.rank))
                return false;
            if (name == null) {
                if (other.name != null)
                    return false;
            } else if (!name.equals(other.name))
                return false;
            return true;
        }
    }
