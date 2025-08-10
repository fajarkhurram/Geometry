//THE CONTROL CENTER

package Shape;

import Point.Point2D;
import Drawing.Pen;
import Drawing.Canvas;

import javax.swing.*;


public class Program {
    public void run(){
        //---Point Demo----
        Point2D point = new Point2D();
        point.setX(5);
        point.setY(10);
        Point2D point2 = new Point2D(20, 25);

        //let first point be this
        Point2D p1 = new Point2D(100,300);

       //let second point be this
        Point2D p2 = new Point2D(200,500);

        Point2D p3 = p1.add(p2);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(point);


        //----Pen+Canvas demo-----

        Canvas canvas = new Canvas();
        Pen pen = new Pen(canvas);

        //square
        pen.moveTo(100, 100);
        pen.lineTo(200, 100);
        pen.lineTo(200, 200);
        pen.lineTo(100, 200);
        pen.lineTo(100, 100);



        JFrame jframe = new JFrame("Fajar Canvas");
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setSize(400,400);
        jframe.add(canvas);
        jframe.setVisible(true);

        System.out.println("program completed");

    }

}
