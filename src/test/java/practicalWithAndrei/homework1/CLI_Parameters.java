package practicalWithAndrei.homework1;

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


    }
}
