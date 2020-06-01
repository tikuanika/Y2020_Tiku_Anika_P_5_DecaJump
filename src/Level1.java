import java.util.Random;

import javafx.stage.Stage;

public class Level1 extends Level{
	private Stage stage;
	private int width;
	private int height;
	private int numBlueBalloonsNBricksL1 = 15;

	public Level1(int w, int h, Stage s) {
		super(w, h, s);
		width = w;
		height = h;
		stage = s;
		
		
	}
	
	public void displayPowerUps(){
		for(int i = 0; i < numBlueBalloonsNBricksL1; i++){
			Random rand = new Random();
			BlueBalloon bb = new BlueBalloon();
			int maxX = (int) this.getPrefWidth(); 
			int maxY = (int) this.getPrefHeight();
			int randomX = rand.nextInt(maxX);
			int randomY = rand.nextInt(maxY);
			
			bb.setX(randomX);
			bb.setY(randomY);
			
			getChildren().add(bb);
			
			int brickMaxX = (int) this.getPrefWidth(); 
			int brickMaxY = (int) this.getPrefHeight();
			int brickRandomX = rand.nextInt(brickMaxX);
			int brickRandomY = rand.nextInt(brickMaxY);
			
			Brick br = new Brick();
			br.setX(brickRandomX);
			br.setY(brickRandomY);
		}
	}
	
	@Override
	public void act(long now){
		
	}
}
