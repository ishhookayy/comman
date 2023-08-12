package bala.foo;

import java.util.Arrays;

public class Main1 {
    public static void main (String[] args){
        int [] number = {25,36,45,68,15,5,12,46};
        String [] name ={"Ambti","Bala","Diviya","Darshini"};
        for (int num:number){
           // System.out.println(num);
        }
        // enhanced for loop
        System.out.println(Arrays.toString(name));
        for (String no :name){
            if (no.startsWith("D")){
                continue;
            }
            System.out.println(no);
        }
        //System.out.println("Normal looping");
        // reverse order
        for (int i = name.length -1 ; i >= 0 ; i-- )
        {
            //System.out.println(name[i]);
        }
        //Arrays.stream(number).forEach(System.out::println);
        // ArrayName.for - it will create for loop in IDE

    }
}
