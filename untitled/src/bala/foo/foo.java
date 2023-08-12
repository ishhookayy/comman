package bala.foo;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class foo {
    public static void main(String [] args){
        String[] letters = {"A","A","B","C","D","D","D"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter letter to be searched ");
        String searchLetter = scanner.next();
        int count = countOccurance(letters,searchLetter.toUpperCase(Locale.ROOT));
        System.out.println(count);
    }
    public static int countOccurance(String[] letters,String searchLetter){
        int count=0;
        System.out.println(Arrays.toString(letters));
        System.out.println(searchLetter);
        for (String letter:letters)
        {
            if (letter.equals(searchLetter))
            {
                count++;
            }
        }
        return count;
    }
}
