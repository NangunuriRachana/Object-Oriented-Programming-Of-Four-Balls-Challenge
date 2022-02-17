import processing.core.PApplet;

import java.util.*;

public class FourBallsChallenge extends PApplet {
    private final int WIDTH = 800;
    private final int HEIGHT = 600;
    private final int DIAMETER = 10;

    private int ballsWidth;
    private int ballsHeightPosition;
    private int ballsIncrementSpeed;

    private static List<FourBallsChallenge> balls = new ArrayList<>();

    public FourBallsChallenge() {
    }

    public FourBallsChallenge(int ballsWidth, int ballsHeightPosition, int ballsIncrementSpeed) {
        this.ballsWidth = ballsWidth;
        this.ballsHeightPosition = ballsHeightPosition;
        this.ballsIncrementSpeed = ballsIncrementSpeed;
    }

    public static void main(String[] args) {
        PApplet.main("FourBallsChallenge", args);

        FourBallsChallenge firstBall = new FourBallsChallenge(0, 1, 1);
        balls.add(firstBall);

        FourBallsChallenge secondBall = new FourBallsChallenge(0, 2, 2);
        balls.add(secondBall);

        FourBallsChallenge thirdBall = new FourBallsChallenge(0, 3, 3);
        balls.add(thirdBall);

        FourBallsChallenge fourthBall = new FourBallsChallenge(0, 4, 4);
        balls.add(fourthBall);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        for (FourBallsChallenge ball : balls) {
            ball.ballsWidth = drawCircle(ball);
        }
    }

    private int drawCircle(FourBallsChallenge ball) {
        int height = ball.ballsHeightPosition * HEIGHT / 5;
        ellipse(ball.ballsWidth, height, DIAMETER, DIAMETER);
        ball.ballsWidth += ball.ballsIncrementSpeed;
        return ball.ballsWidth;
    }
}