package arrays;

import java.util.Scanner;

public class secondlargest {
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];

        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        int largest = nums[0];
        int secondlargest = Integer.MIN_VALUE;


        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            if( current > largest) {
               secondlargest = largest;
               largest = current;

            }else if (current < largest && current > secondlargest){
                secondlargest = current;
            }

        }
        System.out.println("Second largest element is: " + secondlargest);

    }
}
