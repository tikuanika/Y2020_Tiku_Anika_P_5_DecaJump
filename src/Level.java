import java.util.Random;

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
		p.setY(this.getPrefHeight() / 2 - p.getFitHeight() / 2);
		this.add(p);
		
		
		Balloon b = new Balloon();
		this.add(b);
		
		
		Acid a = new Acid();
		this.add(a);
		a.setFitWidth(a.getWorld().getPrefWidth());
		a.setFitHeight(a.getWorld().getPrefHeight()/30);
		a.setY(a.getWorld().getPrefHeight() - a.getFitHeight() * 2);
		
		
		
		
		//root.setBottom(this.getScoreObject());
		root.setTop(this.getScoreObject());
		BorderPane.setAlignment(this.getScoreObject(), Pos.TOP_RIGHT);
		//BorderPane.setAlignment(this.getScoreObject(), Pos.CENTER);
		this.start();
		s.show();
		
		this.requestFocus();
		
		this.setOnMouseMoved(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				b.setX(event.getX()-b.getWidth()/2);
				b.setY(event.getY()-b.getHeight()/2);
			}
		});
		
		this.setOnMouseMoved(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				b.setX(event.getX() - b.getWidth() / 2);
				b.setY(event.getY()-b.getHeight()/2);
			}
		});
		
		s.setScene(sc);
	}
	
	public void displayPowerUps(){ 
		 
	}
}
