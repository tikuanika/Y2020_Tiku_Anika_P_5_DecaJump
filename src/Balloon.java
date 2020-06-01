import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseEvent;

public class Balloon extends Actor{
	
	private double mainBalloonHeight = 10;
	private double mainBalloonWidth = 10;
	
//	private boolean moveRight;
//	private boolean moveLeft;
//	private boolean moveUp;
//	private boolean moveDown;
//	private double prevX;
//	private double prevY;
	
	public Balloon() {
		Image i = new Image("balloon.jpg"); 
		
		this.setImage(i);
		this.setFitHeight(mainBalloonHeight);
		this.setFitWidth(mainBalloonWidth);
		
		ImageView a = new ImageView(i);
		
		
	}
	
	@Override
	public void act(long now) {
		
	}
	

	
}
