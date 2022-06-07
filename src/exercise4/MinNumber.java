package exercise4;

import java.util.Scanner;

public class MinNumber {
    public static void minValue() {
        Scanner values = new Scanner(System.in);
        System.out.println("How many number do you want to input?");
        int total = values.nextInt();
        int[] list = new int[total];
        for (int I = 0; I < total; I++)
        {

            System.out.println("number" + (I+1) + ":");

            list[I] = values.nextInt();
        }
        int minValue= list[0];
        for( int k=0; k< list.length; k++)
        {

            if( list[k] < minValue)
            {
                minValue=  list[k];
            }

        }
        System.out.print("The minimum number is:" + minValue);
    }
}
