
//It should have the following private member variables: int x; int y;. 
//It should have the following constructors: 
//public Point2D() and public Point2D(int x, int y). 
//The constructors should initialize the internal member variables x and y. 
//The default constructor should initialize both x and y to 0. 
//Implement the following method in the Point2D class:
//public double distance(Point2D pointB)
//This function should return the distance between 
//the Point2D object and the Point2D argument (pointB). 
//The distance should be the cartesian distance between two coordinates, x and y.
//The cartesian distance between two coordinates can be calculated using 
//the following formula:
//distance == Math.sqrt(x * x + y * y)
//You can use the java.lang.Math package for Java's sqrt function (square root).
import java.lang.Math;

public class Point2D {

    private int x;
    private int y;

    public Point2D() {
        this.x = 0;
        this.y = 0;
    }

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    private int getX() {
        return this.x;
    }
    
    private int getY() {
        return this.y;
    }

    public double distance(Point2D otherPoint) {
        double distance = Math.sqrt((this.x - otherPoint.getX()) * (this.x - otherPoint.getX()) + (this.y - otherPoint.getY()) * (this.y - otherPoint.getY()));
        return distance;
    }
}

//        Point2D pointA = new Point2D();
//        Point2D pointB = new Point2D(2, 5);
// 4+25 = 29. sqrt29 = 5.38
//        Point2D pointC = new Point2D(-4, -1);
// 16+1 = 17. sqrt17 = 4.12
//        double distanceA = pointA.distance(pointB);
//        double distanceB = pointA.distance(pointC);
//        double distanceC = pointB.distance(pointC);
//       sqrt71.9 = 8.48
// 2 - -4 = 6
// 5 - -1 = 6
// 6*6 + 6*6 = 72. sqrt72 = 8.48

