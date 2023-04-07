import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt(); // destination
        int steps = 0;
        while (x > 0) {
            if (x >= 5) {
                x -= 5;
                steps++;
            } else if (x >= 4) {
                x -= 4;
                steps++;
            } else if (x >= 3) {
                x -= 3;
                steps++;
            } else if (x >= 2) {
                x -= 2;
                steps++;
            } else {
                x -= 1;
                steps++;
            }
        }
        System.out.println(steps); // print the number of steps taken
    }
}
