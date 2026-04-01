package Day1;

import java.util.Scanner;

public class smallestnumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an array");
        int size = sc.nextInt();
        int s[] = new int[size];

        for (int i = 0; i < size; i++) {
            s[i] = sc.nextInt();
        }
        int min = s[0];
        for (int i = 1; i <s.length; i++) {
            if(s[i] < min){
                min = s[i];
            }

        }
        System.out.println(min);
    }
}
