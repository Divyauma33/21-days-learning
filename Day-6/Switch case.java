mport java.util.Scanner;
public class Switch{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //Take number and print day name:
        //System.out.print("Enter the number");
        //int number=sc.nextInt();
        //switch(number) {
            //case 1:
                //System.out.println("Monday");
                //break;
            //case 2:
                //System.out.println("Tuesday");
                //break;
            //case 3:
                //System.out.println("Wednesday");
                //break;
            //case 4:
                //System.out.println("Thursday");
                //break;
            //case 5:
                //System.out.println("Friday");
                //break;
            //case 6:
                //System.out.println("Saturday");
                //break;
            //case 7:
                //System.out.println("Sunday");
                //break;
            //default:
                //System.out.println("Invalid day");        

        //}

        //Build calculator using Switch

        //System.out.print("Enter the operator=");
        //char operator=sc.next().charAt(0);
        //double a=45;
        //double b=20;
        //switch(operator){
            //case '+':
                //System.out.println(a + b);
                //break;
            //case '-':
                //System.out.println(a - b);
                //break;
            //case '*':
                //System.out.println(a * b);
                //break;
           // case '/':
                //System.out.println(a / b);
                //break;
            //default:
                //System.out.println("Invalid Operator");                
        //}

        //Menu based Atm 
        int correctpin=1234;
        int balance=7000;
        System.out.print("Enter the pin=");
        int pin=sc.nextInt();
        if(correctpin==pin){
            System.out.println("1.Check Balnce");
            System.out.println("2.Withdraw");
            System.out.println("3.Exit");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Your balance is= " + balance);
                    break;
                case 2:
                    System.out.print("Enter withdraw amount");    
                    int withdraw=sc.nextInt();
                    if(withdraw>0 && withdraw<=balance){
                        balance-=withdraw;
                        System.out.println("withdraw Successful"); 
                        System.out.println("Remaining Balance = " + balance);   
                    }
                    else{
                        System.out.println("Insufficient money");
                    }
                    break;

                case 3:
                    System.out.println("Thank you"); 
                    break; 
                default:
                    System.out.println("Invalid choice");    
            }}
        else{
             System.out.println("Invalid pin");
            }
            sc.close();

            
        }

    }
