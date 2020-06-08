import javafx.scene.image.Image;

public class Brick extends Actor {
	
	private double brickWidth = 30;
	private double brickHeight = 30;

	public Brick(){
		Image i = new Image("brick.jpg");
		this.setImage(i);
		this.setFitHeight(brickHeight);
		this.setFitWidth(brickWidth);
		
	}
	public void setLength(double length){
		brickWidth = length;
	}
	
	public void setHeight(double length){
		brickHeight = length;
	}
	
	@Override
	public void act(long now) {
		// TODO Auto-generated method stub
		
	}

}
