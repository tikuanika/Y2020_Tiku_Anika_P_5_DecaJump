import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseEvent;

public class Balloon extends Actor{
	
	private double mainBalloonHeight = 30;
	private double mainBalloonWidth = 30;
	private double prevX;
	private boolean moveRight;
	private boolean moveLeft;
	
	
	public Balloon() {
		Image i = new Image("balloon.jpg"); 
		
		this.setImage(i);
		this.setFitHeight(mainBalloonHeight);
		this.setFitWidth(mainBalloonWidth);
		
		ImageView a = new ImageView(i);
		
		prevX = getX();
	}
	
	@Override
	public void act(long now) {
		if(getX()>prevX) {
			moveRight = true;
		}else {
			moveRight = false;
		}

		if(getX()<prevX) {
			moveLeft = true;
		}else {
			moveLeft = false;
		}
		prevX = getX();
		
		BlueBalloon bb = this.getOneIntersectingObject(BlueBalloon.class);
		
		if(bb != null){
			FireCracker fc = new FireCracker();
			getWorld().add(fc);
			fc.setX(this.getX());
			fc.setY(this.getY());
			getWorld().remove(bb);
			int s = ((DecaJumpWorld)getWorld()).getScoreObject().getScore();
			((DecaJumpWorld)getWorld()).getScoreObject().setScore(s - 1000);
			
		}
		
		if(this.getOneIntersectingObject(PointBoosterBalloon.class) != null) {
			 int s = ((DecaJumpWorld)getWorld()).getScoreObject().getScore();
			 ((DecaJumpWorld)getWorld()).getScoreObject().setScore(s + 1000);
			 ((DecaJumpWorld)getWorld()).remove(this.getOneIntersectingObject(PointBoosterBalloon.class));
			 
		 }
		
		
		
	}
	
	
	public boolean getRight() {
		return moveRight;
	}
	
	public boolean getLeft() {
		return moveLeft;
	}
	

	
}
