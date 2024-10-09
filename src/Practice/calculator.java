package Practice;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ans = 0;
        System.out.print("Enter two numbers : ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        while (true) {
            System.out.print("Select an operator : ");
            char op = scan.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/') {

                if(op == '+') {
                    ans = a+b;
                } else if(op == '-') {
                    ans = a-b;
                } else if(op == '*') {
                    ans = a*b;
                } else if(op == '/') {
                    if(b != 0){
                        ans = a/b;
                    } else {
                        System.out.println("Infinite");
                        break;
                    }
                }  else {
                    System.out.println("Not a valid operator");
                    break;
                }
                a = ans;
                System.out.println("Enter next number : ");
                b = scan.nextInt();
                System.out.println(ans);
            } else if (op == 'X' || op == 'x') {
                break;
            } else {
                System.out.println("Not a valid operator");
                break;
            }
        }
    }
}
