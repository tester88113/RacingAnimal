package Exercise4;

import java.util.Scanner;

public class searchValue
{
    public static void search() {
        Scanner values = new Scanner(System.in);
        System.out.println("How many number do you want to input?");
        int total = values.nextInt();
        int[] list = new int[total];
        for (int I = 0; I < total; I++)
        {

            System.out.println("number" + (I + 1 )+ ":");
            list[I] = values.nextInt();
        }
        System.out.println("Which number do you want to search?");
        int  searchNumber= values.nextInt();
        for( int e=0; e< list.length;e++)
        {
            if( list[e] == searchNumber)
            {
                System.out.printf("That number was found at index",e);
                break;
            }
            else
            {
                System.out.println("Your number was NOT found ") ;

            }

        }


    }

}
