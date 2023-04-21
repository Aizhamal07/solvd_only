package practicalWithAndrei.homework1;

public class MainClass {
            public static void main(String[] args) {

                if (args.length > 0) {
                    for(String str:args) {
                        System.out.println(str);
                    }
                } else {
                    System.out.println("No arguments");
                }


                /*if (args.length > 0) {
                    System.out.println("The list of args: ");
                    for (String str : args) {
                        System.out.println(str);
                    }
                } else {
                    System.out.println("No args");
                }*/


            }
        }
