import javafx.scene.image.Image;

public class PointBoosterBalloon extends Actor{
	
	private double pointsBalloonWidth = 10;
	private double pointsBalloonHeight = 10;

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
