import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        int uppercaseCount = 0, lowercaseCount = 0;
        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                uppercaseCount++;
            } else {
                lowercaseCount++;
            }
        }
        if (uppercaseCount > lowercaseCount) {
            System.out.println(word.toUpperCase());
        } else if (uppercaseCount < lowercaseCount) {
            System.out.println(word.toLowerCase());
        } else {
            System.out.println(word.toLowerCase());
        }
    }
}
