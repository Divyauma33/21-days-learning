//Voting System
import java.util.Scanner;
public class Demo{
    static void checkage(int age) throws Exception {
            if( age<0 && age< 18){
                throw new Exception("Not eligible");
            }
            else{
                System.out.println("Eligible to vote");
            }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        try{
        System.out.print("Enter age  : ");
        int age=sc.nextInt();
        checkage(age);
        }
        catch (Exception e){
            System.out.println(e);
        }

    }
}

//Student mark validation System
public class Demo{
    static void checkmark(int mark) throws Exception{
        if(mark < 0 || mark>100){
            throw new Exception("Invalid mark entered");
        }
        else{
            System.out.println("Valid mark : "+ mark);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        try{
            System.out.print("Enter mark : ");
            int mark=sc.nextInt();
            checkmark(mark);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
