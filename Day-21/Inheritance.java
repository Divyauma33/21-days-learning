/*class person{
    String name="Divya";
    int age=18;
    void displayPerson(){
        System.out.println(name + " : " + age);
    }
}
class Student extends person{
    String studentId="Engineering";
    String course="ECE";
    void displayStudent(){
        System.out.println(studentId + " : "+ course);
    }
}
public class Demo{
    public static void main(String[] args){
        Student s1=new Student();
        s1.displayStudent();
        s1.displayPerson();
    }
}*/

//Multilevel inheritance

/*class Vehicle{
    String brand="Thar";
    int speed=900;
    void start(){
        System.out.println(brand);
        System.out.println(speed);
    }
}

class Car extends Vehicle{
    int Numberofdoors;
    void drive(){
        System.out.println("Numberofdoors" + " = "+ " 4");
    }
}

class ElectricCar extends Car{
    int batterycapacity;
    void chargeBattery(){
        System.out.println("batterycapacity" + " = "+ "2000MA");
    }
}
public class Demo{
    public static void main(String[] args){
        ElectricCar ec=new ElectricCar();
        ec.start();
        ec.drive();
        ec.chargeBattery();
    }
}*/

//Hierarchical inheritance

/*class Animal{
    void eat(){
        System.out.println(" Animal can eat");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Animal can bark");
    }
}
class Cat extends Animal{
    void meow(){
        System.out.println("Animal can meow");
    }
}
public class Demo{
    public static void main(String[] args){
        Cat c1=new Cat();
        c1.eat();
        c1.meow();
        Dog d1=new Dog();
        d1.bark();
        d1.eat();
    }
}*/

//Employee Problem

class Employee{
    void display(){
        System.out.println("Name" + " : "+ "Mercan");
        System.out.println("Salary" + " : "+ "40000");
    }
}
class Manager extends Employee{
    void manageTeam(){
        System.out.println("They can manage a Team");
    }
}
class Developer extends Employee{
    void writecode(){
        System.out.println("They can write a code");
    }
}
public class Demo{
    public static void main(String[] args){
        Developer obj =new Developer();
        obj.display();
        obj.writecode();
    }
}
