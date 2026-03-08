class Bankaccount{
    private double balance;

    public void deposit(double amount){
        balance=balance + amount;
    }
    public void withdraw(double amount){
        if(amount<=balance){
            balance = balance - amount;
        }
        else{
            System.out.println("Insufficient balance");
        }
    }
    public double getbalance(){
        return balance;
    }
}
public class Demo{
    public static void main(String[] args){
        Bankaccount acc=new Bankaccount();
        acc.deposit(200);
        acc.withdraw(100);
        System.out.println("Current balance : "+ acc.getbalance());
    }
}
