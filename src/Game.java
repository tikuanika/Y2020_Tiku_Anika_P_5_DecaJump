import javafx.application.Application;
import javafx.stage.Stage;

public class Game extends Application{

	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("Deca Jump"); 
		
		StartScreen start = new StartScreen(1000, 600, stage);
		stage.show();
	}

}
