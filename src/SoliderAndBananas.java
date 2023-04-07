import java.util.Scanner;

public class SoliderAndBananas {
    static int NumberOfBananas(int firstBanana, int numberOfBananas, int count) {
        if (count == numberOfBananas) {
            return count * firstBanana;
        } else {
            return count * firstBanana + NumberOfBananas(firstBanana, numberOfBananas, count+1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstBanana = sc.nextInt();
        int numberOfDollars = sc.nextInt();
        int numberOfBananas = sc.nextInt();

        int totalCost = NumberOfBananas(firstBanana, numberOfBananas, 1);
        if (totalCost > numberOfDollars) {
            System.out.println(totalCost - numberOfDollars);
        } else {
            System.out.println(0);
        }


    }
}
