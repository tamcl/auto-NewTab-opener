import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.*;

public class robo
{
    public static void main(String[] args) throws IOException,
            AWTException, InterruptedException
    {
        /*String command = "notepad.exe";
        Runtime run = Runtime.getRuntime();
        run.exec(command);*/
        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // Create an instance of Robot class
        Robot robot = new Robot();

        // Press keys using robot. A gap of
        // of 500 mili seconds is added after
        // every key press
        while(true) {
            robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_N);
        	robot.keyRelease(KeyEvent.VK_N);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(1000);

			type(robot);

            Thread.sleep(5000);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_W);
            robot.keyRelease(KeyEvent.VK_W);
            robot.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(100);
        }

    }

	public static void type(Robot robot)throws IOException,
            AWTException, InterruptedException{
		robot.keyPress(KeyEvent.VK_E);
		robot.keyRelease(KeyEvent.VK_E);
		Thread.sleep(100);
		robot.keyPress(KeyEvent.VK_Z);
		robot.keyRelease(KeyEvent.VK_Z);
		Thread.sleep(100);
		robot.keyPress(KeyEvent.VK_G);
		robot.keyRelease(KeyEvent.VK_G);
		Thread.sleep(100);
		robot.keyPress(KeyEvent.VK_I);
		robot.keyRelease(KeyEvent.VK_I);
		Thread.sleep(100);
		robot.keyPress(KeyEvent.VK_F);
		robot.keyRelease(KeyEvent.VK_F);
		Thread.sleep(100);
		robot.keyPress(KeyEvent.VK_PERIOD);
		robot.keyRelease(KeyEvent.VK_PERIOD);
		Thread.sleep(100);
		robot.keyPress(KeyEvent.VK_C);
		robot.keyRelease(KeyEvent.VK_C);
		Thread.sleep(100);
		robot.keyPress(KeyEvent.VK_O);
		robot.keyRelease(KeyEvent.VK_O);
		Thread.sleep(100);
		robot.keyPress(KeyEvent.VK_M);
		robot.keyRelease(KeyEvent.VK_M);
		Thread.sleep(100);
		robot.keyPress(KeyEvent.VK_SLASH);
		robot.keyRelease(KeyEvent.VK_SLASH);
		Thread.sleep(100);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(100);
		robot.keyPress(KeyEvent.VK_I);
		robot.keyRelease(KeyEvent.VK_I);
		Thread.sleep(100);
		robot.keyPress(KeyEvent.VK_D);
		robot.keyRelease(KeyEvent.VK_D);
		Thread.sleep(100);
		robot.keyPress(KeyEvent.VK_E);
		robot.keyRelease(KeyEvent.VK_E);
		Thread.sleep(100);
		robot.keyPress(KeyEvent.VK_O);
		robot.keyRelease(KeyEvent.VK_O);
		Thread.sleep(100);
		robot.keyPress(KeyEvent.VK_MINUS);
		robot.keyRelease(KeyEvent.VK_MINUS);
		Thread.sleep(100);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_T);
		Thread.sleep(100);
		robot.keyPress(KeyEvent.VK_O);
		robot.keyRelease(KeyEvent.VK_O);
		Thread.sleep(100);
		robot.keyPress(KeyEvent.VK_MINUS);
		robot.keyRelease(KeyEvent.VK_MINUS);
		Thread.sleep(100);
		robot.keyPress(KeyEvent.VK_G);
		robot.keyRelease(KeyEvent.VK_G);
		Thread.sleep(100);
		robot.keyPress(KeyEvent.VK_I);
		robot.keyRelease(KeyEvent.VK_I);
		Thread.sleep(100);
		robot.keyPress(KeyEvent.VK_F);
		robot.keyRelease(KeyEvent.VK_F);
		Thread.sleep(100);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(100);
		
	}
}
