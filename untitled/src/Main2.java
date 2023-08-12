import java.time.LocalDate;
import java.util.Scanner;

public class Main2 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age :");
        int age = scanner.nextInt();
        int year = LocalDate.now().minusYears(age).getYear();
        System.out.println("You were born on " + year);
        if (age>=18)
        {
            System.out.println("Adult you");
        }

    }
}
