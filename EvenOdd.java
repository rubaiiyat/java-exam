import java.util.Scanner;
public class EvenOdd{
    public static void main(String[] args){
        int num;

        Scanner sc= new Scanner(System.in);
        
        System.out.print("Enter Your Number: ");
        num=sc.nextInt();

        if(num%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }

    sc.close();
    }
}