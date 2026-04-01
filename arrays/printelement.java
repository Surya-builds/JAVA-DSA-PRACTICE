package arrays;


import java.util.Scanner;

public class printelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array?");
        int size = sc.nextInt();
        System.out.println("Enter the array elements");
        int nums[] = new int[size];

        //input
        for (int i = 0; i < size ;i++ ){

            nums[i] = sc.nextInt();

        }
        System.out.println("Enter the value you wanna search?");
        int x = sc.nextInt();

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == x){
                System.out.println("Found the x at " + x);
            }
        }
    }
}

