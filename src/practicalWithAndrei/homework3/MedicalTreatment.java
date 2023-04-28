package practicalWithAndrei.homework3;

import practicalWithAndrei.homework2.Medical;

public class MedicalTreatment extends Expenses {

    private String doctorName;
    private String patientName;
    private String injuryType;
    private String severity;
    private String rank;

    private double medicalExpenses;
    private long totalBudget;



    public MedicalTreatment(String doctorName, String patientName, String injuryType, String severity,String rank) {
        this.doctorName = doctorName;
        this.patientName = patientName;
        this.injuryType = injuryType;
        this.severity = severity;
        this.rank=rank;

    }

    public MedicalTreatment(double medicalExpenses,long totalBudget){
        this.medicalExpenses=medicalExpenses;
        this.totalBudget=totalBudget;

    }
    public String getDoctorName() {
        return doctorName;
    }
    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }
    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getInjuryType() {
        return injuryType;
    }

    public void setInjuryType(String injuryType) {
        this.injuryType = injuryType;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public double getMedicalExpenses(){
        return medicalExpenses;
    }

    @Override
    public long getTotalBudget() {
        return totalBudget;
    }

    @Override
    public void addMilitaryPersonnel(String name, String rank) {

    }

    @Override
    public void removeMilitaryPersonnel(String name, String rank) {

    }

    public void setMedicalExpenses(double medicalExpenses){
        this.medicalExpenses=medicalExpenses;

    }

    public String toString(){
        return "Current status for "+rank+" "+patientName+"with "+injuryType+" is "+severity+". Total expenses: "+medicalExpenses;
    }
    public String heal() {
        return ("According to Dr. "+doctorName+" "+patientName + " is currently getting treatment.His current condition is " + severity);
    }
}
