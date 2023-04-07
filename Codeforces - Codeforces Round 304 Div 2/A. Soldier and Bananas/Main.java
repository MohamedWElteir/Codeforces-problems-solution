import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        beautifulSequence(a);
    }

    static void beautifulSequence(int[] a) {
        Arrays.sort(a); // sort the array in ascending order
        int[] count = new int[100001]; // count the occurrences of each number
        for (int i = 0; i < a.length; i++) {
            count[a[i]]++;
        }
        int last = a[0]; // keep track of the last number we replaced
        for (int i = 0; i < a.length; i++) {
            if (count[a[i]] > 2) { // replace all but the first two occurrences
                int j = last + 1; // start searching for the next smallest number
                while (count[j] != 0) { // loop until we find a number that hasn't appeared yet
                    j++;
                }
                last = j; // update the last number we replaced
                count[j]++; // add the new number to the sequence
                count[a[i]]--; // remove the replaced number from the sequence
                a[i] = j; // update the array with the new number
            }
        }
        // print the beautiful sequence
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
