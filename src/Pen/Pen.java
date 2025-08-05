package Pen;
import Point.Point2D;


import java.util.Scanner;

public class Pen {
    public Point2D position;
    public boolean is_visible = true;
    public float size;
    public String colour;
    public String type;

    public Pen() {
        // we'll write default constructor to give point new space
        position = new Point2D();

    }

    public void setPenDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Co-ordinates i-e (x,y) for point");
        int x = sc.nextInt();
        int y = sc.nextInt();
        position.setX(x);
        position.setY(y);

        System.out.println("Is it visible or not? (true/false)");
        is_visible = sc.nextBoolean();

        System.out.println("Enter size");
        size = sc.nextFloat();

        sc.nextLine();  //will clear buffer

        System.out.println("Define colour");
        colour = sc.nextLine();

        System.out.println("Define type");
        type = sc.nextLine();
    }

    public void DisplayPen() {
        System.out.println("Position: ( " + position.getX() + "," + position.getY() + " )");

        if (is_visible) {
            System.out.println("Pen is visible");
        } else {
            System.out.println("Pen is not visible");
        }

        System.out.println("Size is: " + size);
        System.out.println("Colour is: " + colour);
        System.out.println("Type is: " + type);
    }

    public void setPosition(Point2D p){
        position = p;
    }

    public void moveTo(Point2D z){
        System.out.println("Pen moved to: "+ z);
    }

    public void lineTo(Point2D z){
        Point2D start = position;
        Point2D end = z;
        System.out.println("Drawing Line from "+ start + " to "+ end );
    }
}