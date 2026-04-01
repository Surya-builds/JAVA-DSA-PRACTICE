package Day2;

import java.util.Scanner;

public class Linearsearch {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array?");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter "+size+" numbers.");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the variable to search");
        int v = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == v){
                System.out.println("Found at the position " + i);
                return;
            }

        }

        System.out.println("The  variable "+v+ " is not present in the array");
        sc.close();
    }
}
