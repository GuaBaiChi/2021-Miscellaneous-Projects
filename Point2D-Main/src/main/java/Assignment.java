public class Assignment {

    public static void main(String[] args) {
        Point2D pointA = new Point2D();
        Point2D pointB = new Point2D(0, 5);
        Point2D pointC = new Point2D(5, 5);

        double distanceA = pointA.distance(pointB);
        double distanceB = pointA.distance(pointC);
        double distanceC = pointB.distance(pointC);

        System.out.println("Distance A should be 5.0, you calculated: " + distanceA);
        System.out.println("Distance B should be 7 something, you calculated: " + distanceB);
        System.out.println("Distance C should be 5.0, you calculated: " + distanceC);

        Triangle triangle = new Triangle(pointA, pointB, pointC);
        
        System.out.println("Triangle perimeter of ABC should be 17 something, you said: " + triangle.getPerimeter());
        System.out.println("Triangle area of ABC should be 12.5, you said: " + triangle.getArea());

    }
}