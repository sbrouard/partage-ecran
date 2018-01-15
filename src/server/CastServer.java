import java.io.*;
import java.lang.*;
import java.awt.Toolkit;
import java.awt.Dimension;

public class CastServer{
   
    public static void main(String[] args){
	// Get screen size
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	String screenHeight = ""+(int) screenSize.getHeight();
	String screenWidth = ""+(int) screenSize.getWidth();

	
	//System.out.println("Make sure you're connected to the wifi hotspot you want to share your screen with.\n");
	//System.out.println("Start streaming, waiting for the client connection ...\n");
	
	try {

	    // run script
	    String script = "../../scripts/server.sh";
	    String[] cmd = {script,screenWidth,screenHeight};
	    Process proc = Runtime.getRuntime().exec(cmd);
	    
	    proc.waitFor();
	    //System.out.println("Streaming\n");
	    
	} catch (Exception ex) {
	    //System.out.println("Connection failed\n");
	    ex.printStackTrace();
	}
    }
}
