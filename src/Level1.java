import java.util.Random;

import javafx.stage.Stage;

public class Level1 extends Level{
	private Stage stage;
	private int width;
	private int height;
	
	private int numBlueBalloonsR1 = 8;
	private int numPointBoostersR1 = 50;
	private int numBricksR1 = 20;

	public Level1(int w, int h, Stage s) {
		super(w, h, s);
		width = w;
		height = h;
		stage = s;
		
		displayPowerUps();
	}
	
	@Override
	public void displayPowerUps(){
		Random rand = new Random();
		
		for(int i = 0; i < numBlueBalloonsR1; i++){
			BlueBalloon bb = new BlueBalloon();
			this.add(bb);
			int x = rand.nextInt((int)(bb.getWorld().getPrefWidth() - bb.getFitWidth() / 2));
			int y = rand.nextInt((int)(bb.getWorld().getPrefHeight() - bb.getWorld().getObjects(Acid.class).get(0).getFitHeight() - bb.getFitHeight() / 2));
			bb.setX(x);
			bb.setY(y);
		}
				
		for(int i = 0; i < numPointBoostersR1; i++){
			PointBoosterBalloon yb = new PointBoosterBalloon();
			this.add(yb);
			int x = rand.nextInt((int)(yb.getWorld().getPrefWidth() - yb.getFitWidth() / 2));
			int y = rand.nextInt((int)(yb.getWorld().getPrefHeight() - yb.getWorld().getObjects(Acid.class).get(0).getFitHeight() - yb.getFitHeight() / 2));
			yb.setX(x);
			yb.setY(y);
		}
		
		for(int i = 0; i < numBricksR1; i++){
			Brick stopper = new Brick();
			this.add(stopper);
			int x = rand.nextInt((int)(stopper.getWorld().getPrefWidth() - stopper.getFitWidth() / 2));
			int y = rand.nextInt((int)(stopper.getWorld().getPrefHeight() - stopper.getFitHeight() / 2));
			for(int k = 0; k < stopper.getWorld().getObjects(Brick.class).size(); k++){
				if(stopper.getWorld().getObjects(Brick.class).get(k).getX() < x + stopper.getFitWidth()/2 && stopper.getWorld().getObjects(Brick.class).get(k).getX() > x - stopper.getFitWidth()/2){
					x = rand.nextInt((int)(stopper.getWorld().getPrefWidth() - stopper.getFitWidth() / 2));
				}
				
				if(stopper.getWorld().getObjects(Brick.class).get(k).getY() < y + stopper.getFitHeight() / 2 && stopper.getWorld().getObjects(Brick.class).get(k).getY() < y - stopper.getFitHeight() / 2){
					y = rand.nextInt((int)(stopper.getWorld().getPrefHeight() - stopper.getWorld().getObjects(Acid.class).get(0).getFitHeight() - stopper.getFitHeight() / 2));
				}
			}
			
			stopper.setX(x);
			stopper.setY(y);
		}
	}
	
	@Override
	public void act(long now){
		if(this.getObjects(DecaJumpCharacter.class).get(0).isGameOver()){
			GameOver go = new GameOver(width, height, stage, 1000);
			this.stop();
			
		}else if(this.getObjects(DecaJumpCharacter.class).get(0).getY() <= 0 ){
			Level2 l2 = new Level2(width, height, stage);
			this.stop();
			l2.start();
		
		}
	}
}
