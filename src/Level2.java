import java.util.Random;

import javafx.stage.Stage;

public class Level2 extends Level{

	private Stage stage;
	private int width;
	private int height;
	
	private int numBlueBalloonsR2 = 8;
	private int numPointBoostersR2 = 5;
	private int numBricksR2 = 40;

	public Level2(int w, int h, Stage s) {
		super(w, h, s);
		width = w;
		height = h;
		stage = s;
		
		displayPowerUps();
	}
	
	@Override
	public void displayPowerUps(){
		Random rand = new Random();
		
		for(int i = 0; i < numBlueBalloonsR2; i++){
			BlueBalloon bb = new BlueBalloon();
			this.add(bb);
			int x = rand.nextInt((int)(bb.getWorld().getPrefWidth() - bb.getFitWidth() / 2));
			int y = rand.nextInt((int)(bb.getWorld().getPrefHeight() - bb.getFitHeight() / 2));
			bb.setX(x);
			bb.setY(y);
		}
				
		for(int i = 0; i < numPointBoostersR2; i++){
			PointBoosterBalloon yb = new PointBoosterBalloon();
			this.add(yb);
			int x = rand.nextInt((int)(yb.getWorld().getPrefWidth() - yb.getFitWidth() / 2));
			int y = rand.nextInt((int)(yb.getWorld().getPrefHeight() - yb.getFitHeight() / 2));
			yb.setX(x);
			yb.setY(y);
		}
		
		for(int i = 0; i < numBricksR2; i++){
			Brick stopper = new Brick();
			this.add(stopper);
			int x = rand.nextInt((int)(stopper.getWorld().getPrefWidth() - stopper.getFitWidth() / 2));
			int y = rand.nextInt((int)(stopper.getWorld().getPrefHeight() - stopper.getFitHeight() / 2));
			stopper.setX(x);
			stopper.setY(y);
			stopper.setLength(30);
		}
	}
	
	@Override
	public void act(long now){
		if(this.getObjects(DecaJumpCharacter.class).get(0).isGameOver() || this.getObjects(DecaJumpCharacter.class).get(0).getY() <= 0 ){
			GameOver go = new GameOver(width, height, stage, 1000);
			this.stop();
			
		} 
	}

}
