//File Handling
//ATM Withdrawal System
import java.util.Scanner;
public class Demo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double balance=900;
        try{
        System.out.println("Enter withdrawal Amount : ");
        double withdraw=sc.nextDouble();
        if(withdraw > balance){
            throw new Exception("Insufficient Balance");
        }
        balance=balance - withdraw;
        System.out.println("Withdrawal Successful");
        System.out.println("Remaining balance : "+balance);
        }
        catch(Exception e){
        System.out.println(e);
        }
        finally{
            System.out.println("Thank you for using ATM");
        }
        
    }
}

//Division Calculator

public class Demo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int result=0;
        try{
            System.out.println("Enter number: ");
            int num1=sc.nextInt();
            System.out.println("Enter number: ");
            int num2=sc.nextInt();
            result=num1 / num2;
            System.out.println("Result : "+result); 
        }
        catch(Exception e){
            System.out.println(e + "Cannot divide by zero");
        }
    }
}

//Array index System
public class Demo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] marks={80,60,70,90,100};
        try{
            System.out.println("Enter index: ");
            int index=sc.nextInt();
            System.out.println("marks : " + marks[index]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index entered");
        }
    }
}

//Number conversion
public class Demo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        try{
            System.out.print("Enter a number :");
            String input=sc.next();
            int number=Integer.parseInt(input);
            System.out.println("Converted number: "+number);
        }
        catch(NumberFormatException e){
            System.out.println("Invalid number format");
        }
    }
}
