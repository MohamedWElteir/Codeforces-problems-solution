import java.util.Scanner;

public class BoyOrGirl {
    public static void main(String[] args) {
        Tell();
    }

    private static void Tell() {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            for (int j = i + 1; j < name.length(); j++) {
                if (name.charAt(i) == name.charAt(j)) {
                    count++;
                    break;
                }
            }
        }
        if ((name.length() - count) % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
    }
}