import java.util.Scanner;
public class Test{
    public  void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter credit score = ");
        int credit_score=sc.nextInt();
        System.out.print("Enter income = ");
        int income=sc.nextInt();
        System.out.print("Enter emi = ");
        int emi=sc.nextInt();
        sc.nextLine();
        System.out.print("Employement : ");
        String employement=sc.nextLine();
        
        if(credit_score>600 && credit_score>=749){
            System.out.println("Status : Approved");
        }
        else if(credit_score>600){
            System.out.println("Proceeds to further check");
        }
        else{
            System.out.println("Rejected");
        }

        /*if(income<=25000){
            if(emi>=0.5 * income){
                System.out.println("Rejected");
            }
            else{
                System.out.println("Applicable");
            }
        }
        else{
            System.out.println("Applicable");
        }*/
        if(employement.equals("Salaried")){
            System.out.println("Salaried");
        }
        if(credit_score>=800){
            System.out.println("Interset rate : 7%");
        }
        else{
            System.out.println("Interset rate : 8%");
        }
    }
}
