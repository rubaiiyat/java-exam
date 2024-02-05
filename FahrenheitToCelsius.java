import java.util.Scanner;
public class  FahrenheitToCelsius{
    public static void main(String []args){
        int  Fahrenheit,celcius;

        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter The Farenheight: ");
        Fahrenheit =sc.nextInt();

        celcius=((Fahrenheit-32)*5)/9;

        System.out.print("Celcius: "+celcius);
    }
} 
