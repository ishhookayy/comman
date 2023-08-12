package oops_concept;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

class GPA{
    int subjects;int[] marks;
    GPA(int subjects,int[] marks){
        this.subjects=subjects;
        this.marks=marks;
    }
    int calculateGpa(){
        int[] newMarks = new int[marks.length];
        for (int i=0;i< marks.length;i++)
        {
            if((90<=marks[i])&&(marks[i]<=100)){
                newMarks[i]=10;
            } else if ((80<=marks[i])&&(marks[i]<=89)) {
                newMarks[i]=9;
            } else if ((70<=marks[i])&&(marks[i]<=79)) {
                newMarks[i]=8;
            }
            else if ((60<=marks[i])&&(marks[i]<=69)) {
                newMarks[i]=7;
            }
            else if ((50<=marks[i])&&(marks[i]<=59)) {
                newMarks[i]=6;
            }else {
                newMarks[i]=0;
            }
        }
        System.out.println(Arrays.toString(newMarks));
        return 0;
    }

}

public class GPA_CGPA {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no of Subject:");
        int subjects = scanner.nextInt();
        int[] marks =new int[subjects];
        for (int i=0; i<subjects; i++){
            System.out.println("Enter Subject "+(i+1)+" mark:");
            marks[i]=scanner.nextInt();
        }
        System.out.println(Arrays.toString(marks));
        GPA gpa = new GPA(subjects,marks);
        gpa.calculateGpa();
    }
}
