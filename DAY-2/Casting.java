public class Casting{
    public static void main(String[] args){
        int num=25;
        double no=num;
        double no1=89.7;
        int no2=(int)no1;
        System.out.println("result:" + no);
        System.out.println("casting:" + no1);

        System.out.println("Before swap");
        int a=10;
        int b=20;
        System.out.println("a="+a);
        System.out.println("b="+b);
        
        int temp=0;
        temp=a;
        a=b;
        b=temp;
        System.out.println("After swap");
        System.out.println("a="+  a);
        System.out.println("b=" + b);
    }
