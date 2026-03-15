//Lambda Expression
//Calculator Operation System

interface Operation{
    int calculate(int a,int b);
}
public class Demo{
    public static void main(String[] args){
        Operation add=(a,b) -> a+b ;
        Operation sub=(a,b) -> a-b;
        Operation mul=(a,b) ->a*b;
        Operation div=(a,b) ->a/b;
        System.out.println("Addition: " + add.calculate(10,5));
        System.out.println("Subtraction: " + sub.calculate(10,5));
        System.out.println("Multiplication: " + mul.calculate(10,5));
        System.out.println("Division: " + div.calculate(10,5));

    }
}

//Discount Calculator 

interface Discount{
    double applydiscount(double price);
}
public class Demo{
    public static void main(String[] args){
        Discount festivaldis=(price) ->price *0.80;
        Discount memberdis=(price)-> price * 0.90;
        Discount nodis=(price) ->price;
        double price=1000;
        System.out.println("Festival Discount price: "+festivaldis.applydiscount(price));
        System.out.println("Member Discount price: "+memberdis.applydiscount(price));
        System.out.println("NO Discount price: "+nodis.applydiscount(price));
    }
    
}
