//Student Registration System
//This keyword

class Student{
    String name;
    int age;
    String department;
    Student(String name,int age,String department){
        this.name=name;
        this.age=age;
        this.department=department;
    }
    void display(){
        System.out.println("Name : "+ name);
        System.out.println("Age : "+age);
        System.out.println("Department : "+ department);
    }

}
public class Demo{
    public static void main(String[] args){
        Student s1 =new Student("Divya",18,"ECE");
        s1.display();
    }
}

//Super keyword
//Employee salary system

class Employee{
    String name;
    int salary;
    Employee(String name,int salary){
        this.name=name;
        this.salary=salary;
    }
    void displayEmployee(){
        System.out.println("Employee name : "+ name);
        System.out.println("Employee salary : "+ salary);
    }
}
class Manager extends Employee{
    int bonus;
    Manager(String name,int salary,int bonus){
        super(name , salary);
        this.bonus=bonus;
    }
    void displayManager(){
        int total=bonus + salary;
        //System.out.println("Name : "+ name);
        //System.out.println("Salary : "+ salary);
        System.out.println("Bonus : "+ bonus);
        System.out.println("Total salary : "+ total);
    }
    

}
public class Demo{
    public static void main(String[] args){
        Manager m1=new Manager( "Divya",40000,700);
        m1.displayEmployee();
        m1.displayManager();
    }
}


