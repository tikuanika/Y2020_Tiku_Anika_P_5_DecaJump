import javafx.scene.image.Image;

public class Acid extends Actor{
	
	public Acid(){
		Image i = new Image("acid.jpg");
		this.setImage(i);
		if(this.getWorld() == null){
			System.out.println("lol");
		}
		this.setFitHeight(10);
		this.setFitWidth(10);
	}

	@Override
	public void act(long now) {
		// TODO Auto-generated method stub
		
	}

}
