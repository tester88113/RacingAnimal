package exercise4;

import java.util.Scanner;

public class Lab_04 {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {


        System.out.println("=====MENU======");
        System.out.println("1. Add number into ArrayList");
        System.out.println("2. Print numbers");
        System.out.println("3. Get maximum number");
        System.out.println("4. Get minimum number");
        System.out.println("5.Search number");
        Scanner scanner = new Scanner(System.in);
        int selectNumber = scanner.nextInt();


        switch (selectNumber) {
            case (1):
                AddNumber.menu();
                break;
            case (2):

                PrintNumber.print();
                break;
            case (3):
                MaxNumber.maxValue();
                break;
            case (4):
                MinNumber.minValue();
                break;

            case (5):

                SearchValue.search();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + selectNumber);
        }


    }
}

