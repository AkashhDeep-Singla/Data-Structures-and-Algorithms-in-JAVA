package Syntax;

import java.util.Scanner;

public class inputOutput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("Hi! " + name);
        System.out.println("What is your age ?");
        int age = scan.nextInt();
        System.out.println("Your age is " + age);
    }
}
