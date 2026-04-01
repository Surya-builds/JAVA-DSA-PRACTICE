package arrays;

import java.util.Scanner;

public class minmax {
    public static void main(String[]args){
       Scanner sc = new Scanner(System.in);
       int size = sc.nextInt();
       int boss [] = new int[size];

        for (int i = 0; i <size; i++) {
         boss[i] = sc.nextInt();
        }

        int min = boss[0];
        int max = boss[0];

        for (int i = 0; i < boss.length; i++) {
            if(boss[i] > max){
                 max = boss[i];
            }if(boss[i] < min){
               min = boss[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
