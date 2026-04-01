package Day1;

import java.util.Scanner;

public class sumofallno {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Whats the n value");
        int size = sc.nextInt();
        int n[] = new int[size];
        int sum = 0;
        for (int i = 0; i < size; i++){
           n[i] = sc.nextInt();
        }
        for (int i = 0; i < n.length; i++) {
            sum = sum + n[i];

        }
        System.out.println(sum);
    }
}
