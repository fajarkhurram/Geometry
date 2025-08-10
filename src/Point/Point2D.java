package Point;

public class Point2D {
    private int x;
    private int y;

    public Point2D(){
    }

    public Point2D(int x , int y){
        this.x = x;
        this.y = y;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public Point2D add ( Point2D other){  //copy constructor
        return new Point2D (this.x+other.x , this.y+ other.y);
    }

    @Override
    public String toString(){
        return "("+x+","+y+")";
    }
}
