import java.util.Scanner;
public class minimumMaximum{
    public static void main(String[] args){
        int num1,num2,num3,num4;

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter The First Number: ");
        num1=sc.nextInt();

        System.out.println("Enter The Second Number: ");
        num2=sc.nextInt();

        System.out.println("Enter The Third Number: ");
        num3=sc.nextInt();

        System.out.println("Enter The Forth Number: ");
        num4=sc.nextInt();
        

        if(num1>num2 && num1>num3 && num1>num4){
            System.out.println("Maximum Number Is: "+num1);
        }else if(num2>num1 && num2>num3 && num2>num4){
            System.out.println("Maximum Number Is: "+num2);
        }else if(num3>num1 && num3>num2 && num3>num4){
            System.out.println("Maximum Number Is: "+num3);
        }else{
            System.out.println("Maximum Number Is: "+num4);
        }

        if(num1<num2 && num1<num3 && num1<num4){
            System.out.println("Minimum Number Is: "+num1);
        }else if(num2<num1 && num2<num3 && num2<num4){
            System.out.println("Minimum Number Is: "+num2);
        }else if(num3<num1 && num3<num2 && num3<num4){
            System.out.println("Minimum Number Is: "+num3);
        }else{
            System.out.println("Minimum Number Is: "+num4);
        }
    }
}