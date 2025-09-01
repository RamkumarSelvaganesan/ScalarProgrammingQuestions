package scalar.intermediate;

public class MLMCalculator {

    public static long membersAtLevel(int level, int r) {
        return (long) Math.pow(r, level);
    }

    public static long totalMembers(int level, int r) {
        return (long) ((Math.pow(r, level + 1) - 1) / (r - 1));
    }
}

/*
MLMCalculator:
---------------
A utility class to calculate members in a Multi-Level Marketing (MLM) structure
based on a Geometric Progression (GP).

Problem:
- Level 0 starts with 1 member (the original person).
- Each member recruits 'r' new members at the next level.
- This pattern forms a GP where:
    a (first term) = 1
    r (common ratio) = recruits per member

Formulas:
1. Members at Level n:
       members = r^n

2. Total Members from Level 0 to n:
       total = (r^(n+1) - 1) / (r - 1)

Example:
--------
Let r = 3 (each member recruits 3 others), n = 4 (4 levels):

Level 0: 1
Level 1: 3
Level 2: 9
Level 3: 27
Level 4: 81

Members at Level 4 = 3^4 = 81
Total members up to Level 4 = (3^5 - 1) / (3 - 1) = (243 - 1) / 2 = 121
*/
