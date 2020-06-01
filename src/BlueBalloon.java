import javafx.scene.image.Image;

public class BlueBalloon extends Actor{
	private double blueHeight = 5;
	private double blueWidth = 5;
	
	public BlueBalloon(){
		Image i = new Image("blueballoon.jpg");
		this.setImage(i);
		this.setFitHeight(blueHeight);;
		this.setFitWidth(blueWidth);
		
	}

	@Override
	public void act(long now) {
		// TODO Auto-generated method stub
		
	}

}
