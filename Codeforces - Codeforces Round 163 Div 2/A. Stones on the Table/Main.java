//  A. Stones on the Table

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String stones = sc.next();
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            if (stones.charAt(i) == stones.charAt(i + 1)) {
                count++;
            }
        }
        System.out.println(count);
        

    }
}