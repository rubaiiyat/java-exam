import java.util.Scanner;
public class leapYear{
    public static void main(String[] args){
        int year;

        System.out.print("Enter Your Year: ");
        Scanner sc= new Scanner(System.in);

        year=sc.nextInt();

        if(year%400==0 || (year%4==0 && year%100!=0)){
            System.out.print(year + " Is Leap Year");
        }else{
            System.out.print(year + " Is Not Leap Year");
        }
    }
}