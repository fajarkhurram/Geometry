import Pen.Pen;
import Point.Point2D;



public class Main {
    public static void main(String[] args) {
        Pen p = new Pen();
        p.setPenDetails();
        p.DisplayPen();

        //let first point be this
        Point2D p1 = new Point2D(100,300);

        //let second point be this
        Point2D p2 = new Point2D(200,500);

        Point2D p3 = p1.add(p1);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        p.setPosition(p2);

    }

}