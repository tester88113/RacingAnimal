package Exercise4;

import sun.nio.cs.ext.IBM500;

import java.util.Arrays;
import java.util.Scanner;

public class printNumber
{
    public static void print()
    {
        Scanner values = new Scanner(System.in);
        System.out.println("How many number do you want to input?");
        int total = values.nextInt();
        int[] list = new int[total];
        try {
            for (int I = 0; I < total; I++)
            {

                System.out.println("number" + (I+1) + ":");
                list[I] = values.nextInt();
            }
        }
        catch (Exception e)
        {
            System.out.println("you should enter over total of number");
        }

            System.out.println("Here is list of array: " + Arrays.toString(list));



    }

}
