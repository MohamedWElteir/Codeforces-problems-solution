import java.util.Scanner;

public class Elephent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int destination = scanner.nextInt();
        int steps = 0;
        while (destination > 0) {
            if (destination >= 5) {
                destination -= 5;
                steps++;
            } else if (destination >= 4) {
                destination -= 4;
                steps++;
            } else if (destination >= 3) {
                destination -= 3;
                steps++;
            } else if (destination >= 2) {
                destination -= 2;
                steps++;
            } else {
                destination -= 1;
                steps++;
            }
        }
        System.out.println(steps);
    }
}


