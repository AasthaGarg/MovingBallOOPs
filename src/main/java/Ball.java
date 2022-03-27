import processing.core.PApplet;

public class Ball {

    public static int xPosition;
    public static int yPosition;
    public static  int diameter=10;
    public static  int speed;
    PApplet obj;

    public Ball(PApplet obj,int speed,int yPosition){
        this.obj = obj;
        this.yPosition = yPosition;
        this.speed = speed;
        xPosition = 0;
    }

    public void moveTheBallForward(){
        this.xPosition += speed;
    }

    public void drawBall(){
        obj.ellipse(xPosition,yPosition,diameter,diameter);
        moveTheBallForward();
    }

}
