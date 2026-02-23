import java.util.Scanner;
public class While{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //int i=10;
        //while( i>0 && i<=10){
           // System.out.println(i);
            //i--;
        //}
        
        //print until the user enter 0
        
        //int num=-1;
        //while(num!=0){
            //System.out.print("enter number");
            //num=sc.nextInt();
        //}

        //ATM pin retry machine

        //int correctpin=1234;
        //int enteredpin=0;
        //int attempts=0;
        //while(enteredpin!=correctpin  && attempts<3){
            //System.out.print("enter the pin=");
            //enteredpin =sc.nextInt();
            //attempts++;
            //if(enteredpin==correctpin){
                //System.out.println("Access garanted");
            //}
            //else{
                //System.out.println("Acess denied");
            //}
        //}

        //Saving goal tracker

        
        int saving=0;
        int month=0;
        while(saving<=10000){
            saving+=2000;
            month++;
        }
        System.out.println("Total month to save 10000= " + month);

        // Shopping menu system

        int choice=0;
       do{
           System.out.println("1. Add item.");
           System.out.println("2. View card");
           System.out.println("3.Exit");
           
           System.out.println("Enter the choice");
           choice =sc.nextInt();
           switch(choice){
               case 1:
                   System.out.println("Item added");
                   break;
                case 2:
                    System.out.println("Cart displayed");
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                System.out.println("Invalid choice");
           }
           }while(choice!=3);
       
        
    }
}
