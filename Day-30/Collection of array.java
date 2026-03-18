import java.util.ArrayList;
import java.util.Scanner;
//Student Mark System
public class Demo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> marks=new ArrayList<>();
        for(int i=0;i<5;i++){
            System.out.println("Enter mark : ");
            int mark=sc.nextInt();
            marks.add(mark);
        }
        System.out.println("Marks : "+ marks);
        int total=0;
        for(int i=0;i<marks.size();i++){
            total=total + marks.get(i);
        }
        double Average=(double) total/marks.size();
        System.out.println("Total marks : "+ total);
        System.out.println("Average : "+ Average);
    }
}

//Shopping cart system

public class Demo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList <String> card=new ArrayList<>();
        card.add("Milk");
        card.add("Bread");
        card.add("Rice");
        card.add("Eggs");
        System.out.println("Card items : "+ card);
        System.out.println("Enter index to remove");
        int index=sc.nextInt();
        if(index >=0 && index<card.size()){
            card.remove(index);
            System.out.println("Item Removed Successfully");
        }
        else{
            System.out.println("Invalid Index");
        }
        System.out.println("Updated cart : "+ card);
        System.out.println("Total items in cart : "+ card.size());
    }
}

//Attendance tracker
public class Demo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<String> students=new ArrayList<>();
        System.out.println("Enter no of student : ");
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            System.out.println("Enter student name : ");
            String name=sc.nextLine();
            students.add(name);
        }
        System.out.println("Present Students : "+students);
        System.out.println("Enter name to check : ");
        String checkname=sc.nextLine();
        if(students.contains(checkname)){
            System.out.println(checkname + " is present");
        }
        else{
            System.out.println(checkname + " is absent ");
        }
        System.out.println("Total Present : "+ students.size());
    }
}
