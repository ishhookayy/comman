import java.util.Scanner;

public class Example1 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = input.nextInt();
        int i=2;
        if (number == 1 || number == 2)
        {
            System.out.println(number + " is a Prime Number");
        }
        else
        {
            while (i*i <= number) //Time Complexity : log n
            {
                if (number % i == 0)
                {
                    System.out.println(number + " is a Prime Number");
                    i++;
                    break;
                }
                else
                {
                    System.out.println(number + " is not a Prime Number");
                    break;
                }
            }
            }
    }

}
