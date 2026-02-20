mport java.lang.Class;
import java.util.Scanner;
public class Input{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //take name and age from user and print hello divya,you are 19 years old

        //String name=sc.nextLine();
        //int age=sc.nextInt();
        //System.out.print("Hello"  +  name + ",");
        //System.out.print("you are  "  + age +  "years old");

        //take two numbersand print sum and product


        //System.out.print("Enter the number");
        //int num1=sc.nextInt();
        //System.out.println("Enter the number");
        //int num2=sc.nextInt();
        //System.out.println("Sum of two numbers:"  +  (num1+num2));
        //System.out.println("Product of two numbers: "  +  num1*num2);

        //Calculate Simple interest
       // System.out.println("Enter the principle=");
        //int p=sc.nextInt();
        //System.out.println("Enter the interest=");
        //int r=sc.nextInt();
        //System.out.println("Enter the time=");
        //int t=sc.nextInt();
        
        // System.out.println("SI=  " + ((p * r * t)/100));

        // take radius from the user and find area of the circle

        System.out.print("Enter the radius of the circle");
        double r=sc.nextDouble();
        double Area=Math.PI * r * r;
        System.out.println("Area of circle  = " +  Area );

    }
}
