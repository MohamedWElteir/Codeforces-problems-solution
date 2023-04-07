//  A. String Task

import java.util.*;


class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next().toLowerCase();
        String vowels = "aeiouy";
        String result = "";
        //if thre is a vowel, do not add it to the result
        for (int i = 0; i < word.length(); i++) {
            if (vowels.indexOf(word.charAt(i)) == -1) {
                result.append(".").append(word.charAt(i));
            }


        }
        System.out.println(result.toLowerCase());


    }
}