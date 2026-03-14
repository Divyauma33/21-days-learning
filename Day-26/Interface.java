//Abstract method
//Vehicle Engine System
interface Vehicle{
    void start();
}
class Car implements Vehicle{
    public void start(){
        System.out.println("Car starts with Key");
    }
}
class Bike implements Vehicle{
    public void start(){
        System.out.println("Bike starts with self-start");
    }
}
public class Demo{
    public static void main(String[] args){
        Car c1=new Car();
        Bike b1=new Bike();
        c1.start();
        b1.start();
    }
}

//Notification System
interface sendNotification{
    void Notification();

}
class emailNotification implements sendNotification{
    public void Notification(){
        System.out.println("Message from Email");
    }
}
class SMSNotification implements sendNotification{
    public void Notification(){
        System.out.println("Message from SMS");
    }
}
public class Demo{
    public static void main(String[] args){
        emailNotification en=new emailNotification();
        SMSNotification sn=new SMSNotification();
        en.Notification();
        sn.Notification();
    }
}
