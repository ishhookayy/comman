package bala;
import java.util.Date;
public class Main {
    public static void main(String[] args) {
        //Write your code
        /*
         System.out.println("Hello world!")
         This is multiple line comment
         */
        int a ;
        a = 10;
        System.out.println(a);
        String b = "BALA";
        System.out.println(b);
        Date date = new Date();
        System.out.println(date);
        float pi =3.14F;
        boolean tf = true;
        System.out.println(pi);
        System.out.println(tf);

        Person alex = new Person("alex");
        Person mae = alex;
        System.out.println("before changing");
        System.out.println(alex.name+" "+mae.name);

        mae.name = "rohan";
        System.out.println("after changing");
        System.out.println(alex.name+" "+mae.name);
    }
    static class Person
    {
        String name;
        Person(String name)
        {
            this.name = name;
        }
    }
}