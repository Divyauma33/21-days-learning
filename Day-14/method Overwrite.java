import java.util.Scanner;
/*public class Demo{
    static double area(double radius){
        return 3.14 * radius *radius;
    }
    static double area(double length,double breadth){
        return length*breadth;
    }
    static double area(double base,double height, boolean isTriangle){
        return 0.5 *base *height;
    }
    public static void main(String[] args){
        System.out.println(area(5));
        System.out.println(area(4,6));
        System.out.println(area(4,6,true));
    }
}*/

/*public class Demo{
    static double area(double radius){
        return 3.14 * radius * radius;
    }
    static double area(double length,double breadth){
        return length*breadth;
    }
    static int area(int side){
        return side*side;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter radius= ");
        double radius=sc.nextDouble();
        System.out.print("Enter length= ");
        double length=sc.nextDouble();
        System.out.print("Enter breadth= ");
        double breadth=sc.nextDouble();
        System.out.print("Enter side= ");
        int side=sc.nextInt();
        System.out.println(area(radius));
        System.out.println(area(length,breadth));
        System.out.println(area(side));
    }
}*/

public class Demo{
    static double discount(double price,String customertype){
        double discountpercent=0;
        if(customertype.equals("student")){
             discountpercent=10;
        }
        else if(customertype.equals("regular")){
            discountpercent=5;
        }
        else{
             discountpercent=20;
        }
        double finalprice = price - (price * discountpercent/100);
        return finalprice;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter price= ");
        double price=sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter customertype= ");
        String customertype=sc.nextLine();
        double result=discount(price,customertype);
        System.out.println("Final price: "+ result);
    }
}
