import processing.core.PApplet;
import java.util.ArrayList;
import java.util.List;

public class MovingBalls extends PApplet {

    public static final int balls = 4;
    public static final int width = 800;
    public static final int height = 600;
    public static final int diameter = 40;
    public static List<MovingBalls> movingBallsList = new ArrayList<>();
    private int directionX;
    private int directionY;
    private int speedOfBall;

    public static void main(String args[]){
        PApplet.main("MovingBalls",args);
        for(int i=0;i<balls;i++){
            MovingBalls ball = new MovingBalls(i);
            movingBallsList.add(ball);
        }
    }

    public MovingBalls(){

    }
    public MovingBalls(int index){
        this.directionX=0;
        this.directionY= index+1;
        this.speedOfBall = index+1;
    }

    @Override
    public void settings(){
        super.settings();
        size(width,height);
    }

    @Override
    public void draw(){
        for(MovingBalls ball:movingBallsList){
            ballPositionChange(ball);
        }
    }

    private void ballPositionChange(MovingBalls ball) {
        ellipse(ball.directionX,((ball.directionY*height)/5),diameter,diameter);
        ball.directionX += ball.speedOfBall;
    }
}
