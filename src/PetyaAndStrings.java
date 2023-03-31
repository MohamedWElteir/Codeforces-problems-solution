import java.util.Scanner;

public class PetyaAndStrings {
    public static void main(String[] args) {
compareStrings();
    }
    public static void compareStrings() {
        Scanner scanner = new Scanner(System.in);
        String firstString = scanner.next();
        String secondString = scanner.next();

        if(firstString.compareToIgnoreCase(secondString)==0)
            System.out.println("0");
        else if(firstString.compareToIgnoreCase(secondString)>0)
            System.out.println("1");
        else
            System.out.println("-1");
        }
    }

