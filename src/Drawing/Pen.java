package Drawing;
import Point.Point2D;


import java.awt.*;
import java.util.Scanner;

public class Pen {
    private Point2D position;
    private Canvas canvas;
//    private boolean is_visible = true;
//    private float size;
//    private String colour;
//    private String type;

    public Pen(Canvas canvas) {
        // we'll write default constructor to give point new space
        position = new Point2D(0,0);
        this.canvas = canvas;

    }

//    public void setPenDetails() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Co-ordinates i-e (x,y) for point");
//        int x = sc.nextInt();
//        int y = sc.nextInt();
//        position.setX(x);
//        position.setY(y);
//
//        System.out.println("Is it visible or not? (true/false)");
//        is_visible = sc.nextBoolean();
//
//        System.out.println("Enter size");
//        size = sc.nextFloat();
//
//        sc.nextLine();  //will clear buffer
//
//        System.out.println("Define colour");
//        colour = sc.nextLine();
//
//        System.out.println("Define type");
//        type = sc.nextLine();
//    }
//
//    public void DisplayPen() {
//        System.out.println("Position: ( " + position.getX() + "," + position.getY() + " )");
//
//        if (is_visible) {
//            System.out.println("Pen is visible");
//        } else {
//            System.out.println("Pen is not visible");
//        }
//
//        System.out.println("Size is: " + size);
//        System.out.println("Colour is: " + colour);
//        System.out.println("Type is: " + type);
//    }



    public void moveTo(int x , int y){
        position = new Point2D(x , y);
        System.out.println("Pen moved to: "+ x +","+y);
    }



    public void lineTo(int x , int y){
        Point2D newPosition = new Point2D(x,y);
        canvas.addLine(position , newPosition);  //draw line
        position = newPosition;
    }

    public Point2D getPosition(){
        return position;
    }
}