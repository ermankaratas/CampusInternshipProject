package Pages;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;


public class RobotPage extends ParentPage {
        public Robot robot;

    public RobotPage(Robot robot) {
        try {
            robot = new Robot();
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
    }

    public void robots(String action, int time) {
        if (action.equals("enter")) {
            enterPresser(time);
        } else if (action.equals("tab")) {
            tabPresser(time);
        } else if (action.equals("tabReverse")) {
            tabPresserReverse(time);
        } else {
            System.out.println("Invalid Action");
        }
    }

    private void tabPresser(int time) {
        for (int i = 0; i < time; i++) {
            myWait(1);
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
        }
    }

    public void clickBlank(String click, int x, int y) {
        if (click.equalsIgnoreCase("click")) {
            robot.mouseMove(x, y);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        } else if (click.equalsIgnoreCase("dontClick")) {
            robot.mouseMove(x, y);
        }
    }

    private void tabPresserReverse(int time) {
        for (int i = 0; i < time; i++) {
            myWait(1);
            robot.keyPress(KeyEvent.VK_SHIFT);
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_SHIFT);
        }
    }

    private void enterPresser(int time) {
        for (int i = 0; i < time; i++) {
            myWait(1);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
        }
    }
}
