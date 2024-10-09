package Questions;

import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
//        String name = scan.nextLine();
        String pass = scan.nextLine();

        if(pass.length()<6) {
            System.out.println("Too Short!");
        } else {
            boolean flag;
            flag = false;
            for(int i=0; i<pass.length();i++) {
                if(pass.charAt(i) <='9' && pass.charAt(i) >='0' ) {
                    flag = true;
                    break;
                }
            }
            if(flag) {
                System.out.println("Correct");
            } else {
                System.out.println("No digit!");
            }
        }
    }
}