import java.util.Scanner;

public class DigitsSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n<10){
            System.out.println(n);
    }else {
            System.out.println((n-11)/2);
        }
    }

}
