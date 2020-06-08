import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.InnerShadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class StartScreen extends Pane{

	int width, height;
	Stage st;
	public StartScreen(int w, int h, Stage s) {
		width = w;
		height = h;
		st = s;
		setPrefHeight(height);
		setPrefWidth(width);
		VBox titlePage = new VBox();
		titlePage.setPrefSize(width, height);
		titlePage.setAlignment(Pos.CENTER);
		Label title = new Label("Deca Jump");
		title.setTextFill(Color.STEELBLUE);
		title.setEffect(new InnerShadow());
		Label instr = new Label("How to Play");
		Label descr = new Label(" 1. Avoiding the stops \n 2. hitting the bottom is game over \n 3. move your mouse around the screen to move the balloon and bounce the deca jump character \n 4. collect as many points to increase ur score");
		descr.setAlignment(Pos.CENTER);
		title.setFont(Font.font(40));
		instr.setFont(Font.font(30));
		descr.setFont(Font.font(20));
		
		Button play = new Button("Play Game");
		titlePage.getChildren().addAll(title, instr, descr, play);
		
		Scene titleScene = new Scene(titlePage);
		s.setScene(titleScene);
		
		play.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				Level1 lv1 = new Level1(width, height, st);
				lv1.start();
			}
			
		});
	}

}
