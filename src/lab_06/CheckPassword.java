package lab_06;

import java.util.Scanner;

public class CheckPassword {
    public static void main(String[] args) {
        String myPassword = "password123";
        Scanner scanner = new Scanner(System.in);
        int count = 0;

    for (int i=0;i<3; i++) {
           System.out.println("Please enter correct pw");
           String enterPassword = scanner.next();
            if (enterPassword.equals(myPassword))
            { System.out.println("your pw is correct");
                break;
            }
            else if (i==2)
            {System.out.println("your pw is Incorrect and you enter 3 times, please try again later");
               }
            else
            {
                System.out.println("your pw is Incorrect");
            }


        }


        }

    }

