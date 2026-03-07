//Area
/*class Rectangle{
    int length;
    int width;
    
    Rectangle(int l,int w){
        length=l;
        width=w;
    } 
    void area(){
        int result=length*width;
        System.out.println("Area= "+ result);
    }
}
public class Practice{
    public static void main(String[] args){
        Rectangle r1=new Rectangle(4,5);
        Rectangle r2=new Rectangle(10,10);
        r1.area();
        r2.area();
        
    }
}*/

//Bank Account

/*class BankAccount{
    String Accountholder;
    double balance;
    BankAccount(String name,double bal){
        Accountholder=name;
        balance=bal;
    }
    void deposit(double amount){
        balance=amount + balance;
        System.out.println("Deposited : "+ balance);
    }
    void withdraw(double amount){
        if(amount<=balance){
            balance=balance - amount;
            System.out.println("Withdraw : "+ balance);
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }
    void display(){
        System.out.println("Account Holder: "+ Accountholder);
        System.out.println("Balance: "+ balance);
    }
}
public class Practice{
    public static void main(String[] args){
        BankAccount acc=new BankAccount("Divya" , 5000);
        acc.deposit(2000);
        acc.withdraw(8000);
        acc.display();
    }
}*/

//Car details

/*class Car{
    String brand;
    String model;
    int price;
    Car( String b, String m, int p){
        brand=b;
        model=m;
        price=p;
    }
    void display(){
        System.out.println("Brand: "+ brand);
        System.out.println("Model: "+ model);
        System.out.println("Price: " + price);
    }
}
public class Practice{
    public static void main(String[] args){
        Car c1=new Car("Toyota","Camry",35000);
        Car c2=new Car("BMW","X5",1000000);
        c1.display();
        c2.display();

    }
}*/
// Total cost of product purchase

class Product{
    String ProductName;
    double price;
    int Quantity;

    Product(String p,double pri,int qn){
        ProductName=p;
        price=pri;
        Quantity=qn;
    }
    void display(){
        System.out.println("Product : "+ ProductName);
        System.out.println("Price: "+ price);
        System.out.println("Ouantity: "+ Quantity);
        double totalcost=price *Quantity;
        System.out.println("Total cost: "+ totalcost);

    }
}
public class Practice{
    public static void main(String[] args){
        Product pr=new Product("laptop",50000,2);
        pr.display();
    }
}

