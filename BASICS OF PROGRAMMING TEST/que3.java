import java.util.Scanner;
public class Test{
    public  void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("number of request : ");
      int request=sc.nextInt();
      if(request<=5){
        System.out.println("Allowed");
      }
      else{
        System.out.println("Blocked");
      }
    }
}
