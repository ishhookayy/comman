import java.util.Scanner;

class SpecificArrayInt{
    int a[];
    SpecificArrayInt(int a[]){
        this.a=a;
    }

    void printInt(){
        for(int x: a){
            System.out.println(x);
        }
    }

    void reverseInt(){
        int j= a.length-1,temp;
        for (int i=0;i<j;i++)
        {
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            j--;
        }
        printInt();
    }
}
class Exa{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a[]={2,4,6,8};
        SpecificArrayInt ob = new SpecificArrayInt(a);
        System.out.println("1.PrintInt \n2.ReverseInt");
        int choice=input.nextInt();
        switch (choice){
            case 1:
                ob.printInt();
                break;
            case 2:
                ob.reverseInt();
                break;
        }


    }
}