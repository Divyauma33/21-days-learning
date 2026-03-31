import java.util.Scanner;
public class Test{
    public  void main(String[] args){
        Scanner sc=new Scanner(System.in);
       System.out.print("Enter total number of messages : ");
       int total_messages=sc.nextInt();
       int compressed=total_messages-100;
        int active=total_messages-compressed;
       if(total_messages<=100){
        System.out.println("Status : Normal , Active : " + active + "Compressed : " + compressed);
       }
       else{
        System.out.println("Status : Optimized , Active : " + active + ", Compressed : " + compressed);
       }
}
}
