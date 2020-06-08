import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class DecaJumpCharacter extends Actor{

	private double dx = 0;
	private double dy = 1;
	private boolean gameOver;
	private int characterWidth = 20;
	private int characterHeight = 20;
	
	public DecaJumpCharacter(){
		Image character = new Image("monkey.jpg");
		this.setImage(character);
		this.setFitHeight(characterHeight);
		this.setFitWidth(characterWidth);
		
		
		
		ImageView image = new ImageView(character);
		
		
	}
	
	@Override
	public void act(long now) {
		// TODO Auto-generated method stub
		
		if(this.getY() <= this.getWorld().getPrefHeight() || this.getOneIntersectingObject(Acid.class) == null){
			
			dy = 1;
			
			Brick br = this.getOneIntersectingObject(Brick.class);
			if(br != null){
				this.setY(this.getY() + 50);
			}
			
			
			
			Balloon b = this.getOneIntersectingObject(Balloon.class);
			if(b != null){
				
				 double third = b.getWidth() / 3;
				 double balloonX = b.getX();
				 double ballX = this.getX() + this.getWidth() / 2;
				 
				 if(ballX > balloonX && ballX < balloonX + third && b.getLeft()) {
					 if(getX() + 30 > 0){
					 	setX(getX() - 30);
						setY(getY() - 30);
					 }else{
						 setX(getWorld().getPrefWidth() - 10);
					 }
				 }else if(ballX > balloonX + third && ballX < balloonX + 2 * third) {
					 setY(this.getY() - 60);
				 }else if(ballX > balloonX + 2 * third && ballX<balloonX + b.getWidth() && b.getRight()) {
					 if(getX() + 30 > getWorld().getPrefWidth()){
						 setX(getWorld().getPrefWidth() - 10);
					 }else{
					 	setX(this.getX() + 30);
						setY(this.getY() - 30);
					 }
				 }				
			}
			
			move(dx, dy); 
			
			Acid a = this.getOneIntersectingObject(Acid.class);
			
			if(a != null){
				gameOver = true;
			}
		}else {
			gameOver = true;
		}
	}
	
	public boolean isGameOver(){
		return gameOver;
	}

}
