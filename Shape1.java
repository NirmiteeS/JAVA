class Shape{
    Shape(){
        getArea();
        getPerimeter();
        getSide();
    }
    double getArea(){
        return 0;
    }
    double getPerimeter(){
        return 0;
    }
    double getSide(){
        return 0;
    }
}
class Circle extends Shape{
    int r;
    Circle(int r){
        super();
        this.r=r;
    }
    @Override
    double getArea(){
       return 3.14*r*r;
    }
    @Override
    double getPerimeter(){
        return 2*3.14*r;
    }
    @Override
    double getSide(){
       
        return r;
    }
}
class Triangle extends Shape{
    int s1;
    Triangle(int s1){
        super();
        this.s1=s1;
    }
    @Override
    double getArea(){
       return (Math.sqrt(3)/4)*Math.pow(s1,2);
    }
    @Override
    double getPerimeter(){
        return 3*s1;
    }
    @Override
    double getSide(){
        return s1;
    }
}
class Pentagon extends Shape{
    int s2;
    Pentagon(int s2){
        super();
        this.s2=s2;
    }
    @Override
    double getArea(){
       return 1.720*Math.pow(s2,2);
    }
    @Override
    double getPerimeter(){
        return 5*s2;
    }
    @Override
    double getSide(){
        return s2;
    }
}

public class Shape1
{
public static void main(String[] args) {
Shape c=new Circle(4);
Shape t=new Triangle(5);
Shape p=new Pentagon(5);
System.out.println("The area of the circle is: "+c.getArea()+" unit\u00b2");
System.out.println("The perimeter of the circle is: "+c.getPerimeter()+" unit");
System.out.println("The radius of the circle is: "+c.getSide()+" unit\n");

System.out.println("The area of the triangle is: "+t.getArea()+" unit\u00b2");
System.out.println("The perimeter of the triangle is: "+t.getPerimeter()+" unit");
System.out.println("The side of the triangle is: "+t.getSide()+" unit\n");

System.out.println("The area of the pentagon is: "+p.getArea()+" unit\u00b2");
System.out.println("The perimeter of the pentagon is: "+p.getPerimeter()+" unit");
System.out.println("The side of the pentagon is: "+p.getSide()+" unit\n");
}
}
