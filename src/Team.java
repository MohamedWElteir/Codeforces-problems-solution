import java.util.*;

public class Team {
    //make an analog clock
    public static void main(String[] args) {
       canwesolve();


    }
public static void canwesolve() {
    Scanner scanner = new Scanner(System.in);
    int numberOfProblems = scanner.nextInt();
    int counter = 0;
    for (int i = 0; i < numberOfProblems; i++) {
        int sum = 0;
           int a = scanner.nextInt();
           int b = scanner.nextInt();
           int c = scanner.nextInt();
           sum= a+b+c;
           if(sum>=2){
              ++counter;
           }
       }
        System.out.println(counter);

}
}






