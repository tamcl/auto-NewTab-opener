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
	int tab = 10;

        // Press keys using robot. A gap of
        // of 500 mili seconds is added after
        // every key press
        while(true) {
            robot.keyPress(KeyEvent.VK_CONTROL);
            
		for(int i=0;i<tab;i++){
		robot.keyPress(KeyEvent.VK_N);
            	robot.keyRelease(KeyEvent.VK_N);
Thread.sleep(500);
		}
		robot.keyRelease(KeyEvent.VK_CONTROL);
            Thread.sleep(5000);
	robot.keyPress(KeyEvent.VK_CONTROL);
            for(int i=0;i<tab;i++){
		robot.keyPress(KeyEvent.VK_W);
            	robot.keyRelease(KeyEvent.VK_W);
Thread.sleep(500);
		}
            robot.keyRelease(KeyEvent.VK_CONTROL);
        }

    }
}
