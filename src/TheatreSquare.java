import java.util.Scanner;

public class TheatreSquare {
    public static void main(String[] args) {
        numberOfFlagstones();

    }
    public static void numberOfFlagstones() {
        Scanner scanner = new Scanner(System.in);
        var n= scanner.nextDouble();
      var m = scanner.nextDouble();
      var a = scanner.nextDouble();
        System.out.println((long) Math.ceil(n/a) * (long) Math.ceil(m/a));
    }}

