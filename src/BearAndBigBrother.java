import java.util.Scanner;

public class BearAndBigBrother {
    static int After(int Limak, int Bob){
        int count = 0;
        if(Limak > Bob)
            return count;
        else {
            count++;
            return count + After(Limak*3, Bob*2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(After(sc.nextInt(),sc.nextInt()));

    }
}
