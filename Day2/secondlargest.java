package Day2;

import java.util.Scanner;

public class secondlargest {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter "+ size +" Numbers");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > largest){
                largest =  arr[i];
            }
        }
        int secondlargest = Integer.MIN_VALUE;
        for (int i = 0; i <arr.length; i++) {
            if(arr[i] < largest && arr[i] > secondlargest){
                secondlargest = arr[i];
            }
            
        }
        System.out.println(secondlargest);

    }
}
