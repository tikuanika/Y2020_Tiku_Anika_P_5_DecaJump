import javafx.beans.property.BooleanProperty;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Level extends DecaJumpWorld{
	
	private BooleanProperty cleared;
	
	
	public Level(double width, double height, Stage s) {
		BorderPane root = new BorderPane(); 
		
		this.setPrefHeight(height);
		this.setPrefWidth(width);
		
		displayPowerUps();
		
		
		root.setCenter(this);
		Scene sc = new Scene(root);
		
		
		
		DecaJumpCharacter p = new DecaJumpCharacter();
		p.setX(this.getPrefWidth() / 2 - p.getFitWidth() / 2);
		p.setY(this.getPrefHeight() - p.getFitHeight());
		this.add(p);
		
		Balloon b = new Balloon();
		
		Acid a = new Acid();
		this.add(a);
		
		if(p.isGameOver()){
			GameOver go = new GameOver((int)(width), (int)(height), s, 1000);
		}
		
		//root.setBottom(this.getScoreObject());
		
		//BorderPane.setAlignment(this.getScoreObject(), Pos.CENTER);
		this.start();
		s.show();
		
		this.requestFocus();
		
		this.setOnMouseMoved(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				b.setX(event.getX()-b.getWidth()/2);
			}
		});
		
		this.setOnMouseMoved(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				b.setX(event.getX() - b.getWidth() / 2);
			}
		});
		
		s.setScene(sc);
	}
	
	public void displayPowerUps(){ 
		
	}
}
