package practicalWithAndrei.homework3;

public abstract class Military {

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
        return budget-remainingBudget;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Military other = (Military) obj;
        if (budget != other.budget)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }
}

