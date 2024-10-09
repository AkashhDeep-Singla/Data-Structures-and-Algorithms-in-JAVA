package Practice;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        int n = scan.nextInt();
        int ans = 0;
        int i = 0;

        while (n != 0) {
            int digit = n % 10;
            if (digit == 1) {
                ans = ans + (int)Math.pow(2, i);
            }
            n = n / 10;
            i++;
        }

        System.out.println("Decimal equivalent: " + ans);
        scan.close();
    }
}