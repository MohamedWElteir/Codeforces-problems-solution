import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // read number of test cases
        for (int i = 0; i < t; i++) {
            long n = scanner.nextLong(); // read n
            long k = scanner.nextLong(); // read k
            if (canRepresent(n, k)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        scanner.close();
    }

    public static boolean canRepresent(long n, long k) {
        if (k == 1) {
            // if k=1, then n must be even to be representable in coins
            return n % 2 == 0;
        } else {
            // if k>2, check if there exists a non-negative integer solution for 2x+ky=n
            long x = n / 2; // set x to the maximum possible value
            while (x >= 0) {
                if ((n - k*x) % 2 == 0) {
                    // if (n-kx) is even, then the solution is possible
                    return true;
                }
                x--; // try a smaller value of x
            }
            // if no solution is found, return false
            return false;
        }
    }
}
