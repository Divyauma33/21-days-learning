import java.util.Scanner;
public class Array{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //System.out.println("enter the number:");
        //int n=sc.nextInt();
        //int[] marks=new int[5];
        //int total=0;
        //for(int i=0; i<5; i++){
            //marks[i]=sc.nextInt();
            //total =total+ marks[i];
        //}
        //System.out.println("Total= " +total);

        //Take 5 numbers and print them

        /* System.out.println("enter the number:");
        int n=sc.nextInt();
        int[] num=new int[n];
         System.out.println("Enter the values : ");
        for(int i=0;i<num.length;i++){
           
            num[i]=sc.nextInt();
        }
        System.out.println("the values are:");
        for(int i=0;i<num.length;i++){
            System.out.println(num[i]);
        }*/

        //Find the sum of array
        
        /*System.out.print("Enter the number= ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        int sum=0;
        System.out.print("Enter the value= ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
            
        }System.out.print("The sum of values are= ");
        //for(int i=1;i<arr.length;i++){
            System.out.println(sum);*/

     /*int n=sc.nextInt();
     int[] arr=new int[n];
     int largest=arr[0];
     System.out.print("enter the number of elements= ");
     for(int i=0;i<arr.length;i++){
          arr[i]=sc.nextInt();
         if(arr[i]>largest){
             largest=arr[i];
         }
      System.out.println("largest number is= "+ largest);   
     }*/

    //Count Event numbers
    /*System.out.print("Enter the number of array= ");
    int n=sc.nextInt();
    int[] arr=new int[n];
    int count=0;
    System.out.print("Enter the element= ");
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
        if(arr[i]%2==0){
            count++;
        }
        
    }
     System.out.println("Count of even number= "+ count);*/

     //Students mark Management System

     /*int[] marks=new int[5];
     int total=0;
     int average=0;
     int highest=marks[0];
     
     for(int i=0;i<marks.length;i++){
        System.out.print("Enter the marks of student "+ i + " = " );
        marks[i]=sc.nextInt();
        if(marks[i]>highest){
            highest=marks[i];
        }
        System.out.println("Highest mark = "+ highest);
        total +=marks[i];
        average=total/5;

     }
     
     System.out.println( "Total= " + total);
     System.out.println("Average= " +average);*/

     //Shopping Cart System

     /*double[] prices=new double[4];
     int count=0;
     double total=0;
     for(int i=0;i<prices.length;i++){
        System.out.print("Enter the product price " + i + " = ");
        prices[i]=sc.nextInt();
        if(prices[i]>500){
            count++;
        }
        total += prices[i];
        
     }
     
     System.out.println("Total prices= " + total);
     System.out.println("Total count of product above 500= " + count);*/

     //Attendance Tracker
     int[] attendence=new int[7];
     int presentcount=0;
     int absentes=0;
     double percentage;
     for(int i=0;i<attendence.length;i++){
        System.out.print("Enter  the Student "+ (i+1) + " Present or Absent= " );
        attendence[i]=sc.nextInt();
        if(attendence[i]==1){
            presentcount++;
        }
        

     }
     percentage=( presentcount /(double) attendence.length )*100;
     System.out.println("Percentage= " + percentage + "%");
     System.out.println("Total present count= "+ presentcount);

    
    }
}
