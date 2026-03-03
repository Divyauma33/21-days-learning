import java.util.Scanner;
public class Problem{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        /*int rows=5;
        int cols=6;
        char[][] seats=new char[rows][cols];
        System.out.print("Enter seat status(A for available, B for booking): ");
        for(int i=0;i<rows;i++){
            System.out.println("Row "+(i+1 +":"));
            for (int j=0;j<cols;j++){
                seats[i][j]=sc.next().charAt(0);
            }
        } 
        System.out.println("Seating Layout: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(seats[i][j] + "  ");
            }
            System.out.println();
        }
        int bookedcount=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(seats[i][j]=='B'){
                    bookedcount++;
                }
            }
        }
        System.out.println("Total booked Seats: "+ bookedcount);

        for(int i=0;i<rows;i++){
            int available=0;
            for(int j=0;j<cols;j++){
                if(seats[i][j]=='A'){
                    available++;
                }
            }
            System.out.println("Available seats in row "+ (i+1) + ": " + available);
        }*/

       //Student Attendence System

       int students=4;
       int days=5;
       int[][] attendence=new int[students][days];
       System.out.print("Enter student  for (1=present or 0=absent): ");
       for(int i=0;i<students;i++){
        System.out.print(" student " +(i+ 1) + " = ");
        for(int j=0;j<days;j++){
            attendence[i][j]=sc.nextInt();
        }
       }
       System.out.println("Attendence Table: ");
       for(int i=0;i<students;i++){
        for(int j=0;j<days;j++){
            System.out.print(attendence[i][j] + "  ");
        }
        System.out.println( );
       }
       for(int i=0;i<students;i++){
        int total=0;
        for(int j=0;j<days;j++){
            if(attendence[i][j]==1){
                total++;
            }
            }
            System.out.println("Student "+ (i+1)+ ": "+ total);
       }
       int maxattendence=0;
       int maxday=-1;
       for(int j=0;j<days;j++){
        int count=0;
        for(int i=0;i<students;i++){
        if(attendence[i][j]==1){
            count++;
        }
       }
       if(count>maxattendence){
        maxattendence=count;
        maxday=j;
       }}
       System.out.println("Day with maximum attendence: Day "+ (maxday + 1));
       System.out.println("Number of student present: "+ maxattendence);

    }
}
