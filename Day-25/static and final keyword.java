class Student{
    String name;
    int Rollno;
    static String collegename= "Sathyabama";
    Student(String name,int Rollno){
        this.name=name;
        this.Rollno=Rollno;
    }
    void Information(){
        System.out.println("Name : "+ name);
        System.out.println("Rollno : " + Rollno);
        System.out.println("College name : "+ collegename);
        System.out.println();
    }
}
public class Demo{
    public static void main(String[] args){
        Student s1=new Student("Divya",101);
        Student s2=new Student("Arun",102);
        Student s3=new Student("Priya",103);
        s1.Information();
        s2.Information();
        s3.Information();


    }
}
//Final keyword
//Bank Minimum Balance
import java.util.Scanner;
public class Demo{
    public static void main(String[] args){
        final int minimumbalance=200;
        minimumbalance=300;
        

    }
}
//Employee ID System
class Employee{
    String name;
    int salary;
    final String Employeeid;
    Employee(String name,int salary, final String Employeeid){
        this.name=name;
        this.salary=salary;
        this.Employeeid=Employeeid;
    }
    void display(){
        System.out.println("Name : "+name);
        System.out.println("Salary : "+salary);
        System.out.println("Employee ID : "+ Employeeid);
        System.out.println();
    }
}
public class Demo{
    public static void main(String[] args){
        Employee e1=new Employee("Divya",60000,"EMP101");
        Employee e2=new Employee("Mercan",40000,"EMP102");
        e1.display();
        e2.display();

    }
}
