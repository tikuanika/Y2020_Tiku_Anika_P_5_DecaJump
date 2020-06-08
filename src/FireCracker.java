import javafx.scene.image.Image;

public class FireCracker extends Actor{

	private double fireCrackerWidth = 10;
	private double fireCrackerHeight = 10;
	
	public FireCracker(){
		Image i = new Image("firecracker.png");
		this.setImage(i);
		this.setFitWidth(fireCrackerWidth);
		this.setFitHeight(fireCrackerHeight);
	}
	@Override
	public void act(long now) {
		// TODO Auto-generated method stub
		
	}

}
