import java.util.Scanner;
public class Forloop{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //Print number 1 to 10
        //for(int i=1;i<=10;i++){
            //System.out.println(i);

        // print even number 1 to 20
        //for (int i=2;i<=20;i=i+2){
            //System.out.println(i);

        //Sum of first 10 numbers
        //int sum=0;
        //for(int i=1;i<=10;i++){
            //sum=sum+i;
        //} 
        //System.out.println("Sum= " + sum);  

        //Multiplication table of 5
        System.out.println("Enter the number");
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            System.out.println( "5 x " + i + " = " + (5 * i));
        }
        
        //take marks and subject and find total and average
        
        System.out.print("Enter Total subject=");
        int subject=sc.nextInt();
        int totalmark=0;
        
        for(int i=1;i<=subject;i++){
            System.out.print("Total mark in the subject" +i +" = ");
            int mark=sc.nextInt();
            totalmark=totalmark+mark;
            
        }
        System.out.println("total mark= " + totalmark);
        System.out.println("Average= " + (totalmark/subject));
        
        
        
    }
}
