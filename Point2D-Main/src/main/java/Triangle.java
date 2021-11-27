
import java.lang.Math;

public class Triangle {
    private Point2D a;
    private Point2D b;
    private Point2D c;
    
    public Triangle(Point2D a, Point2D b, Point2D c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public Point2D getA() {
        return this.a;
    }
    public Point2D getB() {
        return this.b;
    }
    public Point2D getC() {
        return this.c;
    }
    
    public double getPerimeter() {
        double perimeter = this.a.distance(this.b) + this.b.distance(this.c) + this.c.distance(this.a);
        return perimeter;
    }
           
    public double getArea() {
        double perimeter = this.a.distance(this.b) + this.b.distance(this.c) + this.c.distance(this.a);
        double heron = perimeter/2;
        double area = Math.sqrt(heron * ((heron - (this.a.distance(this.b))) * (heron - (this.b.distance(this.c))) * (heron - (this.c.distance(this.a)))));
        return area;
    }
}

//        a Point2D pointA = new Point2D();
//        b Point2D pointB = new Point2D(2, 5);
//        c Point2D pointC = new Point2D(-4, -1);