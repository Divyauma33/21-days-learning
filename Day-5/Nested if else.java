import java.util.Scanner;
public class Nestedif{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //College Admission Check
        //System.out.print("Enter your mark=");
        //int mark=sc.nextInt();
        //System.out.print("Enter your age=");
        //int age=sc.nextInt();
        //if(mark>=60){
            //if(age>=18){
                //System.out.println("Eligible");
            //}
            //else{
                //System.out.println("not eligible");
           // }
        //}
        //else{
            //System.out.println("Not eligible for Admission");
        //}

        //Atm with pin
        int correctpin=1234;
        System.out.print("Enter your pin");
        int enteredpin=sc.nextInt();
        System.out.print("Enter your balance=");
        int balance=sc.nextInt();
        if(enteredpin==correctpin){
            System.out.println("Enter withdraw amount=");
        
        int withdraw=sc.nextInt();
        if(withdraw>0 && withdraw<=balance){
            balance-=withdraw;
            System.out.println("Withdrawal Succesfull");
        }
        else{
            System.out.println("Insufficient Balance");
        }}
        else{
            System.out.println("Wrong pin");

        }
    }
}
