package youtubeDownloader;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class youtubeUI extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		Parent root=FXMLLoader.load(getClass().getResource("youtube.fxml"));
		Scene scene=new Scene(root);
		
		stage.setTitle("youtube downloader");
		stage.setScene(scene);;
		stage.show();
		
	}

}
