package Syntax;

import java.util.ArrayList;
import java.util.Scanner;

public class multiArrayList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> multiList = new ArrayList<>();

        //Initialisation
        for(int i=0; i<3; i++){
            multiList.add(new ArrayList<>());
        }
        //Add Elements
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                multiList.get(i).add(scan.nextInt());
            }
        }
    }
}
