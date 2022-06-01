package Exercise4;

import java.util.Scanner;

public class addNumber {
    public static void menu() {
        Scanner values = new Scanner(System.in);
        System.out.println("How many number do you want to input?");
        int total = values.nextInt();
        int[] list = new int[total];
        for (int I = 0; I < total; I++) {

            System.out.println("number" + I + ":");

            list[I] = values.nextInt();
        }

    }
}
