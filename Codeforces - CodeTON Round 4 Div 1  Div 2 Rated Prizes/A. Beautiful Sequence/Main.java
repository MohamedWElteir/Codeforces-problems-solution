import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sc = scanner.nextInt(); // number of test cases
        for (int i = 0; i < sc; i++) {
            int n = scanner.nextInt();
            int[] numbers = new int[n];
            for (int j = 0; j < n; j++) {
                numbers[j] = scanner.nextInt();
            }
            int[] temp = new int[n];
            for (int j = 0; j < n; j++) {
                if (numbers[j] == j + 1) {
                    temp[j] = numbers[n / 2];
                } else {
                    temp[j] = numbers[Math.abs(n / 2 - (j > n / 2 ? n - 1 - j : j) / 2)];
                }
            }
            boolean isBeautiful = true;
            for (int j = 0; j < n - 1; j++) {
                if (Math.abs(temp[j + 1] - temp[j]) > 1) {
                    isBeautiful = false;
                    break;
                }
            }
            if (isBeautiful) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
