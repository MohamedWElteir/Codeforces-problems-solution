import java.util.Scanner;

public class WordCapitalisation {
    public static void main(String[] args) {
        CapitaliseWord();
    }

    private static void CapitaliseWord() {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        System.out.println(word.substring(0, 1).toUpperCase() + word.substring(1));
    }

}
