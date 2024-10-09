package Syntax;

import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        switch(num) {
            case 1 -> System.out.println("ONE");
            case 2 -> System.out.println("TWO");
            case 3 -> System.out.println("THREE");
            case 4 -> System.out.println("FOUR");
            case 5 -> System.out.println("FIVE");
            default -> System.out.println("Out of range !");
        }
    }
}
