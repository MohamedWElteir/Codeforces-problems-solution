import java.util.Scanner;

public class Bitmap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfOperations = scanner.nextInt();
        int x = 0;
        for (int i = 0; i < numberOfOperations; i++) {
            String operation = scanner.next();
            if (operation.contains("++")) {
                x++;
            } else if (operation.contains("--")) {
                x--;
            }
        }
        System.out.println(x);
    }

}
