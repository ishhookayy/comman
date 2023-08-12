package bala.foo;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter an number: ");
        int n =s.nextInt();
        int sum = 0;
        int i = 0;
        while (i<=n){
            sum+=i;
            i++;
        }
        System.out.println("sum = "+sum);
    }


}
