package Homeworks;

public class Military {

    public static long budget = 816_000_000_000L;
    public static String name;

    public static final String usMilitary = "United States Armed Forces";

    static {
        System.out.println("Welcome to " + usMilitary + "!");
    }

    public static long allocateBudget(long amount) {
        return budget-=amount;

    }
    public static double getRemainingBudget(double remainingBudget) {
        return budget-=remainingBudget;
    }
}

