import javafx.scene.image.Image;

public class Brick extends Actor {
	
	private double brickWidth = 10;
	private double brickHeight = 10;

	public Brick(){
		Image i = new Image("brick.jpg");
		this.setImage(i);
		this.setFitHeight(brickHeight);
		this.setFitWidth(brickWidth);
		
	}
	@Override
	public void act(long now) {
		// TODO Auto-generated method stub
		
	}

}
