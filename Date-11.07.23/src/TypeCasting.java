import java.util.Locale;
import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
  //      float num = input.nextFloat();
    //    System.out.println(num);
      /*
        int num= (int)(64.56f);
        System.out.println(num);
        int a = 257;
        byte b = (byte)(a);
        System.out.println(b);
      */
        System.out.println("Enter the day:");
        String day = input.next();
        switch (day.toUpperCase(Locale.ROOT)){
            case "MONDAY":
                System.out.println("Chiken grevy");
                break;
            case "TUESDAY":
                System.out.println("Egg");
                break;
            case "WEDNESDAY":
                System.out.println("Fish fry");
                break;
            case "THURSDAY":
                System.out.println("Briyani");
                break;
            case "FRIDAY":
                System.out.println("Veggie food");
                break;
            default:
                System.out.println("Invalid day");

        }
    }
}