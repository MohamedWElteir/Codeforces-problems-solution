import java.util.Scanner;

public class Buttons {
    static int button(int n) {
        if (n == 1) {
            return 1;

        }
        return n + button(n - 1);

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int sum = n;

        for (int i = 1; i < n; i++) {
            sum += button(n - i);

        }

        System.out.println(sum);

    }
}