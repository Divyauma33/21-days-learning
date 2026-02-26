import java.util.Scanner;
public class Practice{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);{
            String Correctusername="Divya";
            String Correctpassword="java123";
            int attempts=0;
            int maxAttempts=3;
            boolean isLoggedIn=false;
            while(attempts<maxAttempts){
            System.out.print("Enter username= ");
            String username=sc.nextLine().trim();
            System.out.print("enter password= ");
            String password=sc.nextLine().trim();
            if(username.equalsIgnoreCase(Correctusername)){
                if(password.equals(Correctpassword)){
                    System.out.println("Login successful");
                    isLoggedIn=true;
                    break;
                }
                else {
                    attempts++;
                    System.out.println("Wrong password");
                    System.out.println("Remaining attempts: " + (maxAttempts - attempts));
                }}
                if(!isLoggedIn){
                    System.out.println("Account locked");
                }}
            
            }
            sc.close();
            

        }

    }
