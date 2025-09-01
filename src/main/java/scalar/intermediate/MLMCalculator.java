package scalar.intermediate;

public class MLMCalculator {

    public static long membersAtLevel(int level, int r) {
        return (long) Math.pow(r, level);
    }

    public static long totalMembers(int level, int r) {
        return (long) ((Math.pow(r, level + 1) - 1) / (r - 1));
    }
}