import java.io.*;
import java.lang.*;
import java.awt.Toolkit;
import java.awt.Dimension;

public class CastServer{
   
    public static void main(String[] args){
	/*String frameRate = "20";
	String input = ":1";
	String codecVideo = "libx264";
	String pixelFormat = "yuv444p";
	String compressionRate = "20";
	String maximumBitRate = "300000";
	String bufferSize = "1000000";
	String port="9000";*/

	// Get screen size
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	String screenHeight = ""+(int) screenSize.getHeight();
	String screenWidth = ""+(int) screenSize.getWidth();

	
	//System.out.println("Make sure you're connected to the wifi hotspot you want to share your screen with.\n");
	//System.out.println("Start streaming, waiting for the client connection ...\n");
	
	try {

	    // run script
	    String script = "../../scripts/server.sh";
		/*String script = "ffmpeg -f x11grab -s " + screenSize + " -framerate " + frameRate + " -i " + input + " -vf scale=" + screenHeight + ":" + screenWidth + " -c:v " + codecVideo + "-preset veryfast -tune zerolatency -pix_fmt " + pixelFormat + " -x264opts crf=" + compressionRate + ":vbv-maxrate=" + maximumBitRate + ":vbv-bufsize=" + bufferSize + ":intra-refresh=1:keyint=30:slice-max-size=1500:ref=1 -f mpegts - | nc -l -p " + port; */
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
