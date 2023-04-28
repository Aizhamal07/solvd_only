package practicalWithAndrei.homework3;

import java.util.ArrayList;
import java.util.List;

public class CyberCommand extends Military implements MilitaryTraining{

    public static final String cyberCommand="US Cyber Command";

    private long totalBudget;
    private String rank;
    private String name;
    private double trainingBudget;

    private List<String> personnel = new ArrayList<String>();

    public CyberCommand(String name,String rank ,long totalBudget) {
        super(name,rank,totalBudget);
    }
    public CyberCommand(double trainingBudget){
        this.trainingBudget = trainingBudget;
    }

    @Override
    public long getTotalBudget() {
        return totalBudget;
    }

    @Override
    public void setTotalBudget(long totalBudget) {
        this.totalBudget=totalBudget;
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
        System.out.println("Cyber command is defending our country from cyber attacks");

    }

    @Override
    public void doBasicTraining() {
        System.out.println("Performing basic training");
    }

    @Override
    public void doSpecializedTraining(String specialty) {
        System.out.println("Performing specialized training for the Cyber Command in "+specialty);
    }

    @Override
    public String toString() {
        return "Cyber Command [totalBudget=" + totalBudget + ", rank=" + rank + ", name=" + name + "]";
    }


    @Override
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
        CyberCommand other = (CyberCommand) obj;
        return this.totalBudget == other.totalBudget &&
                this.rank.equals(other.rank) &&
                this.name.equals(other.name);
    }

}
