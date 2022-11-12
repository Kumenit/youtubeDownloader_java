package youtubeDownloader;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class youtubecont {
    
	@FXML
	TextField tField;
	@FXML
	Button b1,b11,b12;
	@FXML
	TextArea tArea;
	
	
	
	public void video(ActionEvent event)
	{
		//tArea.setText("download started");
		
		String[] command =
		    {
		        "cmd",
		    };
		    Process p;
			try {
				p = Runtime.getRuntime().exec(command);
			        new Thread(new SyncPipe(p.getErrorStream(), System.err)).start();
		                new Thread(new SyncPipe(p.getInputStream(), System.out)).start();
		                PrintWriter stdin = new PrintWriter(p.getOutputStream());
		                stdin.println("cd src/youtubeDownloader/youtube_videos");
		                stdin.println("youtube-dl.exe "+tField.getText());
		                
		                
		                tArea.setText("download finished");
		             
		                stdin.close();
		                p.waitFor();
		    	} catch (Exception e) {
		 		e.printStackTrace();
		 		tArea.setText("download faild");
			}
		
	}
	public void audio(ActionEvent event)
	{
		String[] command =
		    {
		        "cmd",
		    };
		    Process p;
			try {
				p = Runtime.getRuntime().exec(command);
			        new Thread(new SyncPipe(p.getErrorStream(), System.err)).start();
		                new Thread(new SyncPipe(p.getInputStream(), System.out)).start();
		                PrintWriter stdin = new PrintWriter(p.getOutputStream());
		                stdin.println("cd src/youtubeDownloader/youtube_videos");
		                stdin.println("youtube-dl.exe -f bestaudio "+tField.getText());
		                
		                stdin.close();
		                p.waitFor();
		    	} catch (Exception e) {
		 		e.printStackTrace();
			}
	}
	public void cancel(ActionEvent event)
	{
		String[] command =
		    {
		        "cmd",
		    };
		    Process p;
			try {
				p = Runtime.getRuntime().exec(command);
				//InputStream is=p.getInputStream();
				new Thread(new SyncPipe(p.getErrorStream(), System.err)).start();
		                new Thread(new SyncPipe(p.getInputStream(), System.out)).start();
		                PrintWriter stdin = new PrintWriter(p.getOutputStream());
		                stdin.println("exit");
		                stdin.close();
		                p.waitFor();
		       //  String iString=IOUtils.toString()
		                
		    	} catch (Exception e) {
		 		e.printStackTrace();
			}
	}
	
	
	
	
	
}
