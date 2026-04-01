package Day2;
import java.util.Arrays;
import java.util.Scanner;

public class Sortedarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array ?");
        int size = sc.nextInt();
        int array[] = new int[size];
        System.out.println("Enter " + size + " numbers into an array");

        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
       for(int pass = 0; pass < size - 1; pass++){
           for (int i = 0; i < size - pass - 1; i++) {
               if(array[i] > array[i + 1]){
                   int temp = array[i];
                   array[i] = array[i +1];
                   array[i +1] = temp;
               }

           }
       }
                System.out.println("Sorted array:");
                for (int i = 0; i < size; i++) {
                    System.out.print(array[i] + " ");
                }
            }

        }