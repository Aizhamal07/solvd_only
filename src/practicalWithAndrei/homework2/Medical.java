package practicalWithAndrei.homework2;

public class Medical{

    private String name;
    public String type;
    public String severity;

    public Medical(String name,String type,String severity){
        this.name=name;
        this.type=type;
        this.severity=severity;

    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public void heal(){
        System.out.println(name+" is currently getting treatment.His current condition is "+severity);
    }

}
