import java.awt.*;
import java.awt.event.InputEvent;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello world!");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        reactionTime();
    }

    public static void reactionTime(){
        Robot robot = null;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
        for(int i = 0; i < 5; i++){
            robot.mouseMove(500, 500);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            robot.delay(20);
            Color red = robot.getPixelColor(500, 500);
            while(true){
                if(!robot.getPixelColor(500, 500).equals(red)){
                    break;
                }
            }
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            robot.delay(20);
        }

    }
}