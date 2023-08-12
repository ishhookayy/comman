package bala.bar.barbar;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no of rows : ");
        int rows=s.nextInt();
        int i=1;
        while (i <= rows){
            int j =1;
            while (j <= i){
                System.out.print("* ");
                j++;
            }
            System.out.println(" ");
            i++;
        }

    }
}
