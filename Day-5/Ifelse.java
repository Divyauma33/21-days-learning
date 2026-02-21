import java.util.Scanner;
public class Ifelse{
    public  static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        //Check the number is positive,negative and zero
        //int num=sc.nextInt();
        //if(num>0){
            //System.out.println("Number is positive");
        //}
        //else if(num<0){
            //System.out.println("Number is neagative");
        //}
        //else{
            //System.out.println("Number is zero");
        //}

        //Take marks and print
        //System.out.println("Enter the mark");
        //int num=sc.nextInt();
        //if(num>=75){
            //System.out.println("Distinction");
        //}
        //else if(num>=60){
            //System.out.println("Frist class");
        //}
        //else if(num>=40){
            //System.out.println("Pass");
        //}
        //else{
            //System.out.println("fail");
        //}



        //Find largest three number

       // System.out.print("Enter the number1=");
        //int num1=sc.nextInt();
        //System.out.print("Enter the number2=");
        //int num2=sc.nextInt();
        //System.out.print("Enter the number3=");
        //int num3=sc.nextInt();
        //if(num1>=num2   &&  num1>=num3){
            //System.out.println("Number 1 is largest");
        //}
        //else if(num2>=num1  &&  num2>=num3){
            //System.out.println("Number 2 is Largest");
        //}
        //else{
            //System.out.println("Number 3 is largest");
       // }


       //ATM mini program

       System.out.print("enter your balance=");
       int balance=sc.nextInt();
       System.out.print("Enter yor withdraw amount=");
       int withdraw=sc.nextInt();
       if(withdraw>0 && balance>=withdraw){
        balance-=withdraw;
        System.out.println("Withdrawal Successful");
        System.out.println(" your Balance = " + balance);
       }
       else{
        System.out.println("insufficient balance");
       }
    }
}
