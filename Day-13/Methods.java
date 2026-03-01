import java.util.Scanner;
/*public class Practice{
    static  int multiply(int x,int y){
        return x* y;
    }
    public static void main(String[] args){
        int  n=multiply(4,5);
        System.out.println(n);
    }
}*/
// Print greater number

/*public class Practice{
    static int number(int a, int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }
    public static void main(String[] args){
        int result=number(4,5);
        System.out.println("Result= "+ result);

    }
}*/

//Palindrome

/*public class Practice{
    static boolean isPalindrome(int num){
        int original=num;
        int reverse=0;
        while(num>0){
        //int original=0;
        //int reverse=0;
        int digit=num %10;
        reverse=reverse *10 + digit;
        num=num /10;
        }
        if(original==reverse){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        
        System.out.println(isPalindrome(121));
    }
}*/

//Calculate simple interest

public class Practice{
    static double CalculateSI(double p,double r,double t){
        double SI=(p*r*t)/100;
        return SI;
    }
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter Principle= ");
    double p=sc.nextDouble();
    System.out.print("Enter rate= ");
    double r=sc.nextDouble();
    System.out.print("Enter Time= ");
    double t=sc.nextDouble();
    double result=CalculateSI(p,r,t);
    System.out.println("result="+ result);
    }

}
