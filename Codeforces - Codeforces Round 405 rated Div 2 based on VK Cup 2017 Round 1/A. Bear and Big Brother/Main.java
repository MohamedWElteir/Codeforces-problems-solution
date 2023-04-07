//  A. Bear and Big Brother

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int BearAndBigBrother(int Limak, int Bob){
        int count = 0;
        if(Limak > Bob)
            return count;
        else {
            count++;
            return count + BearAndBigBrother(Limak*3, Bob*2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(BearAndBigBrother(sc.nextInt(),sc.nextInt()));

    }
}