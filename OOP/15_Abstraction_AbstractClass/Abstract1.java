abstract class Shape { 
    String color; 
    abstract double area();
}

class Circle extends Shape {
    double r;
    Circle(String c, double r) {
        this.color = c;
        this.r = r;
    }
    double area() { 
        return 3.14 * r * r;
    }
}

class Rectangle extends Shape {
    double l, w;
    Rectangle(String c, double l, double w) {
        this.color = c;
        this.l = l; 
        this.w = w;
    }
    double area() { 
        return l * w;
    }
}

public class Abstract1 {

	public static void main(String[] args) {
        Shape c = new Circle("Red", 5);
        Shape r = new Rectangle("Blue", 4, 6);

        System.out.println(c.color + " Circle Area: " + c.area());
        System.out.println(r.color + " Rectangle Area: " + r.area());
    }
}
