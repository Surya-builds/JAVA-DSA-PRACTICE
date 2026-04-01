package arrays;

import java.util.Scanner;

public class linearsearch {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        System.out.println("Enter the x value to search");
        int x = sc.nextInt();
        System.out.println("Enter the array elements");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        boolean found = false;

        for (int i = 0; i <array.length; i++) {
            if(x == array[i]){
                System.out.println("Found at the index " + i);
                found = true;
                break;
            }

            }if(!found){
            System.out.println("Not found");

        }
    }
}