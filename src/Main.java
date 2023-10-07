import java.awt.*;
import java.awt.event.MouseEvent;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello world!");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    public void reactionTime(MouseEvent e) throws AWTException {
        Robot robot = new Robot();
        Color clickedColor = robot.getPixelColor(e.getX(),e.getY());
        System.out.println(clickedColor.getRGB());
    }
}