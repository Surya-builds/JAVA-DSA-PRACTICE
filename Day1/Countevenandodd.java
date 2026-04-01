package Day1;

import java.util.Scanner;

public class Countevenandodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = sc.nextInt();
        int no[] = new int[size];

        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            no[i] = sc.nextInt();
        }

        int even = 0, odd = 0;
        for (int i = 0; i < no.length; i++) {
            if (no[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);

        sc.close();
    }
}
