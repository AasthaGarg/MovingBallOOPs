import processing.core.PApplet;

public class Applet extends PApplet {

    public static final int width = 640;
    public static final int height = 480;
    public static final int numberOfBalls = 4;
    Ball balls[] = new Ball[numberOfBalls];

    public static void main(String args[]){
        PApplet.main("Applet",args);
    }

    @Override
    public void settings(){
        super.settings();
        size(width,height);
        initializeBalls();
    }

    public void initializeBalls(){

        for(int index=0;index<numberOfBalls;index++){
            balls[index]= new Ball(this,index+1,(index+1)*height/5);
        }

    }

    @Override
    public void draw(){

        for(Ball ball:balls){
            ball.drawBall();
        }

    }

}
