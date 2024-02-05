import java.util.Scanner;
public class  Area{
    public static void main(String []args){
        int  height,width,area;

        Scanner sc=new Scanner(System.in);

        
        System.out.print("Enter Your Height: ");
        height =sc.nextInt();


        System.out.print("Enter Your Width: ");
        width =sc.nextInt();

        area=(int)(0.5*height*width);

        System.out.print("Area: "+area);
    }
} 
