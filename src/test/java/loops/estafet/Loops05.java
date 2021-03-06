package loops.estafet;

import java.util.Scanner;

public class Loops05 {
    public static void main(String[] args) {

        // Starting with 3, display the first n numbers that are divisible by 3.
        // Numbers must be separated by commas. (hint - use keywords brake/continue)

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scan.nextInt();
        int counter =0;
        boolean isFirstNumberPrinted=false;

        // Version 1:
        for (int i = 3; i <= n; i++) {
            if (i % 3 == 0) {
                System.out.print(i);
                counter++;
                if (n / 3 == counter) {
                    break;
                } else {
                    System.out.print(",");
                }
            }
        }

        // Version 2:
        for (int i = 3; i <= n; i++) {
            if (i % 3 == 0) {
                if (isFirstNumberPrinted) {
                    System.out.print(",");
                } else {
                    isFirstNumberPrinted = true;
                }
                System.out.print(i);
            }
        }
        scan.close();
    }
}
