class Payment{
    void pay(){
        System.out.println("Processing payment...");
    }
}
class Creditcard extends Payment{
    void pay(){
        System.out.println("Payment done using Creditcard");
    }
}
class UPI extends Payment{
    void pay(){
        System.out.println("Payment done using UPI");
    }
}
class Netbanking extends Payment{
    void pay(){
        System.out.println("Payment done using Net Banking");
    }
}
public class Demo{
    public static void main(String[] args){
        Payment p1=new Creditcard();
        Payment p2=new UPI();
        Payment p3=new Netbanking();
        p1.pay();
        p2.pay();
        p3.pay();
    }
}

class Calculator{
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
    double add(double a,double b){
        return a+b;
    }
    }
public class Demo{
    public static void main(String[] args){
        Calculator c1=new Calculator();
        System.out.println("Sum of two numbers: "+ c1.add(5,3));
        System.out.println("Sum of three numbers: "+ c1.add(4,6,2));
        System.out.println("Sum of decimal numbers: "+ c1.add(9.5,3.8));
    }
}    
