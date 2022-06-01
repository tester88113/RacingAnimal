package Exercise4;

import sun.lwawt.macosx.CInputMethodDescriptor;

import java.util.Scanner;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;

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
                addNumber.menu();
                break;
            case (2):

                printNumber.print();
                break;
            case (3):
                maxNumber.maxValue();
                break;
            case (4):
                minNumber.minValue();
                break;

            case (5):

                searchValue.search();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + selectNumber);
        }


    }
}

