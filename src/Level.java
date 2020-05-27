import javafx.beans.property.BooleanProperty;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Level extends BallWorld{
	
	private BooleanProperty cleared;
	
	public Level(double width, double height, Stage s) {
		BorderPane root = new BorderPane(); 
		
		this.setPrefHeight(height);
		this.setPrefWidth(width);
		
		displayBricks();
		
		
		root.setCenter(this);
		Scene sc = new Scene(root);
		
		Ball b = new Ball();
		b.setX(400);
		b.setY(400);
		this.add(b);
		
		Paddle p = new Paddle();
		p.setX(550);
		p.setY(550);
		this.add(p);
		
		root.setBottom(this.getScoreObject());
		BorderPane.setAlignment(this.getScoreObject(), Pos.CENTER);
		this.start();
		s.show();
		this.requestFocus();
		this.setOnMouseMoved(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				p.setX(event.getX()-p.getWidth()/2);
			}
		});
		this.setOnKeyPressed(new EventHandler<KeyEvent>() {

			@Override
			public void handle(KeyEvent event) {
				// TODO Auto-generated method stub
				addKeyCode(event.getCode());
			}
			
		});
		this.setOnKeyReleased(new EventHandler<KeyEvent>() {
			@Override
			public void handle(KeyEvent event) {
				removeKeyCode(event.getCode());
			}
		});
		
		s.setScene(sc);
	}
	
	public void displayBricks() {
		
	}
}
