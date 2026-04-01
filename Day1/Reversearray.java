package Day1;

import java.util.Scanner;

public class Reversearray {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = sc.nextInt();
        System.out.println("Enter " + size + " numbers");
        int array[] = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        int start = 0, end = array.length -1;
        while (start < end){
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            start++;
            end--;
        }
        System.out.println("Reversed array");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
