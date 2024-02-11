import java.util.Scanner;
public class NumberSwaping{
    public static void main(String []args){
        int num1,num2,temp;

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter The First Number: ");
        num1=sc.nextInt();

        System.out.print("Enter The Second Number: ");
        num2=sc.nextInt();

        temp=num1;
        num1=num2;
        num2=temp;

        System.out.println("First Number: "+num1);
        System.out.println("Second Number: "+num2);

    }
}