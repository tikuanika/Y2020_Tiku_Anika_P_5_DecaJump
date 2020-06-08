import javafx.scene.image.Image;

public class Acid extends Actor{
	
	public Acid(){
		Image i = new Image("acid.jpg");
		this.setImage(i);
		
		this.setFitHeight(50);
		this.setFitWidth(50);
	}

	@Override
	public void act(long now) {
		// TODO Auto-generated method stub
		
	}

}
