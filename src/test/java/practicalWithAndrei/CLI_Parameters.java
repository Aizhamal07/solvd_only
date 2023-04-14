package practicalWithAndrei;

public class CLI_Parameters {
    public static void main(String[] args) {
        //one way
        for(String str : args) {
            System.out.println(str);
        }
        //second way
         if(args.length>0){
             System.out.println(args);
         }else{
             System.out.println("Null");
         }

         //third way
        if(args.length>0){
            System.out.println("The list of args: ");
            for(String str : args) {
                System.out.println(str);
            }
        }else{
            System.out.println("No args");
        }

    }
}
