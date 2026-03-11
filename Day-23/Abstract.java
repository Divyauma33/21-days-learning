abstract class shape{
    abstract void area();

}
class circle extends shape{
    double radius;
    circle(double r){
        radius=r;
    }
    void area(){
        double result=3.14 * radius*radius;
        System.out.println("Area of circle: "+ result);
    }
}
class rectangle extends shape{
    int length;
    int width;
    rectangle(int l,int w){
        length=l;
        width=w;
    }
    void area(){
        int result=length * width;
        System.out.println("Area of rectangle: "+ result);
    }
}
class triangle extends shape{
    double base;
    double height;
    triangle(double b,double h){
        base=b;
        height=h;
    }
    void area(){
        double result=0.5 *base * height;
        System.out.println("Area of triangle: "+ result);
    }
}
public class Demo{
    public static void main(String[] args){
        shape s1=new circle(5);
        shape s2=new rectangle(4,6);
        shape s3=new triangle(3,8);
        s1.area();
        s2.area();
        s3.area();
        
    }
}
