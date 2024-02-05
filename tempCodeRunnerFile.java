import java.util.Scanner;
public class  Area{
    public static void main(String []args){
        int  height,width,area;

        System.out.print("Enter Your Height: ");
        Scanner sc=new Scanner(System.in);
        height =sc.nextInt();


        System.out.print("Enter Your Width: ");
        Scanner sc=new Scanner(System.in);
        width =sc.nextInt();

        area=0.5*height*width;

        System.out.print("Area: "+area);
    }
} 
