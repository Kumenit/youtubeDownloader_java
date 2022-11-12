package youtubeDownloader;

import java.io.InputStream;
import java.io.PrintWriter;

public class youtubeDownloader {

	public static void main(String[] args) {
		//this is
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
//                stdin.println("cd src/youtubeDownloader/youtube_videos");
//	                stdin.println("youtube-dl.exe"+" https://www.youtube.com/watch?v=K_zylJH4PRI");
		             stdin.println("cd src");                
		            
      	                stdin.close();
		                p.waitFor();
		          
		    	} catch (Exception e) {
		 		e.printStackTrace();
			}
			
		}

	}

