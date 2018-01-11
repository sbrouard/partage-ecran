import java.io.*;
import java.lang.*;
import java.awt.Toolkit;
import java.awt.Dimension;

public class CastServer{

  
    

    
    public static void main(String[] args){
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	int screenHeight = (int) screenSize.getHeight();
	int screenWidth = (int) screenSize.getWidth();

	try {

	    //String[] env = {"PATH=/bin:/usr/bin/"};
	    String cmd = "/home/sbrouard/Documents/partage-ecran/scripts/server.sh";
	    Process proc = Runtime.getRuntime().exec(cmd);//, env);



	    proc.waitFor();
	    /*StringBuffer output = new StringBuffer();
	    BufferedReader reader = new BufferedReader(new InputStreamReader(proc.getInputStream()));
	    String line = "";                       
	    while ((line = reader.readLine())!= null) {
		output.append(line + "\n");
	    }
	    System.out.println("### " + output);
	    */
	    
	    //Runtime.getRuntime().exec("../../scripts/server.sh");
	    //Process p = new ProcessBuilder("../../scripts/server.sh").start();

		} catch (Exception ex) {
	    ex.printStackTrace();
	}
    }
}
