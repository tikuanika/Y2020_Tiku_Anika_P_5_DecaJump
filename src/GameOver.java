import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.Reflection;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class GameOver extends Pane{
	int width;
	int height;
	Stage stage;
	
	public GameOver(int w, int h, Stage s, int score) {
		stage = s;
		width = w;
		height = h;
		setPrefHeight(height);
		setPrefWidth(width);
		VBox endPage = new VBox();
		endPage.setPrefSize(width, height);
		endPage.setAlignment(Pos.CENTER);
		
		Label title = new Label("Game Over");
		
		Label instr = new Label("Score:");
		Label descr = new Label("" + score);
		
		title.setFont(Font.font(40));
		instr.setFont(Font.font(30));
		descr.setFont(Font.font(20));
		
		Button play = new Button("Play Again");
		Reflection reflect2 = new Reflection();
		reflect2.setFraction(0.7);
		play.setEffect(reflect2);
		
		endPage.getChildren().addAll(title, instr, descr, play);
		
		Scene sc = new Scene(endPage);
		s.setScene(sc);
		
		play.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				StartScreen start = new StartScreen(width, height, stage);
			}
			
		});
	}

}
