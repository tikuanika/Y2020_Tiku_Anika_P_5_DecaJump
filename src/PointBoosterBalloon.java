import javafx.scene.image.Image;

public class PointBoosterBalloon extends Actor{
	
	private double pointsBalloonWidth = 5;
	private double pointsBalloonHeight = 5;

	public PointBoosterBalloon(){
		Image i = new Image("yellowballoon.jpg");
		this.setImage(i);
		this.setFitHeight(pointsBalloonHeight);
		this.setFitWidth(pointsBalloonWidth);
		
	}
	@Override
	public void act(long now) {
		// TODO Auto-generated method stub
		
	}

}
