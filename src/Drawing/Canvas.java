package Drawing;

import Point.Point2D;               // Your custom Point class
import java.awt.Graphics;           // For paintComponent
import javax.swing.JPanel;          // For extending JPanel
import java.util.ArrayList;         // For ArrayList
import java.util.List;              // For List interface


public class Canvas extends JPanel {

    static class Line{
        Point2D start , end;

        Line(Point2D start, Point2D end) {
            this.start = start;
            this.end = end;
        }
    }
    private List<Line> lines = new ArrayList<>();

    public void addLine (Point2D p1 , Point2D p2){
        lines.add(new Line(p1,p2));
        System.out.println("Lines from ("+ p1.getX()+","+p1.getY()+") to ("+p2.getX()+","+p2.getY()+")");
        repaint(); // To trigger paintComponent and draw immediately
    }

    @Override   //tells the compiler that we're making our version of paintComponent() method from parent class (JPanel)
    protected void paintComponent(Graphics graphics){
        super.paintComponent(graphics);

        for(Line line : lines){
            graphics.drawLine((int) line.start.getX(),(int) line.start.getY(),(int) line.end.getX(),line.end.getY());
        }
    }
}
