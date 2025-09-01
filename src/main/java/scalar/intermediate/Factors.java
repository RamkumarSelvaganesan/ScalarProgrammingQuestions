/* Question: A program to count the factors of a number
Example
Number: 12
Factors: 1, 2, 3, 4, 6, 12
Total count: 6
 */

package scalar.intermediate;

public class Factors {
    public int getNoOfFactors(int n) {
        int count = 0;
        for (int i = 1; i * i <= Math.abs(n); i++) {
            if (n % i == 0) {
                if (i == n / i) {
                    count++;
                } else {
                    count += 2;
                }
            }
        }
        return count;
    }

    public boolean isPrime(int n) {
        return n > 1 && getNoOfFactors(n) == 2;
    }
}

/* Explaination of getNoOfFactors

Why Use √n Optimization?
 - Instead of checking all numbers from 1 to n, we only check numbers up to √n because:
 - If i is a factor of n, then n/i is also a factor.
    Example: For 36, checking until 6 is enough because pairs (6, 6) and (2, 18) cover all factors.
This reduces unnecessary iterations.

🔹 Time Complexity
     We iterate only until √n, so complexity is O(√n).

🔹 Space Complexity
       We use only a few variables (n, count, i), so space complexity is O(1).
 */