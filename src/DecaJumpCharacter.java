import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class DecaJumpCharacter extends Actor{

	private double dx = 0;
	private double dy = -3;
	private boolean flag;
	private double angledX;
	private double angledY;
	private double officialDx = 0;
	private double officialDy = -3;
	private boolean gameOver;
	
	public DecaJumpCharacter(){
		Image character = new Image("monkey.jpg");
		this.setImage(character);
		this.setFitHeight(10);
		this.setFitWidth(10);
		this.setX(500);
		this.setY(500);
		
		//if want to add effects on the character, use imageview.
		//ImageView image = new ImageView(character);
		
		angledX = dx * 1.5;
		angledY = dy * 0.5;
		
	}
	
	@Override
	public void act(long now) {
		// TODO Auto-generated method stub
		move(officialDx, officialDy);
		
		move(officialDx, officialDy); 
		
		if(this.getOneIntersectingObject(PointBoosterBalloon.class) != null){
			//getWorld().score.setScore(getWorld().score.getScore() + 100);
		}
		 
		if(this.getY() <= this.getWorld().getPrefHeight()){
			move(officialDx, officialDy);
			
			Balloon b = this.getOneIntersectingObject(Balloon.class);
			if(b != null){
				double third = b.getWidth() / 3;
				double balloonX = b.getX();
				double monkeyFeetX = getX() + getWidth() / 2;
				
				if(monkeyFeetX > balloonX && monkeyFeetX < balloonX + b.getFitWidth()){
					dy = dy * 0.9;
				}
			}
			
			
		}else if(this.getOneIntersectingObject(Acid.class) != null && this.getY() > this.getWorld().getPrefHeight()){
			gameOver = true;
		}
		
		
	}
	
	public boolean isGameOver(){
		return gameOver;
	}
	
	/*
	 * if(this.getX() + this.getWidth() > this.getWorld().getWidth() || this.getX() <= 0) {
			 officialDx = officialDx * (-1); 
		 }
		 
		 Balloon b = this.getOneIntersectingObject(Balloon.class);
		 if(b != null && !flag) {

			 officialDy = officialDy * (-1);
			 
			 double third = b.getWidth() / 3;
			 double balloonX = b.getX();
			 double ballX = getX() + getWidth() / 2;
			 
			 if(ballX > balloonX && ballX < balloonX + third && b.getLeft()) {
				 officialDx = dx*(-1);
			 }else if(ballX > balloonX + third && ballX < balloonX + 2 * third) {
				 
			 }else if(ballX > balloonX + 2 * third && ballX<balloonX + b.getWidth() && b.getRight()) {
				 officialDx = dx;
			 }else if(ballX < balloonX) {
				 
				 if(officialDy < 0) {
					 officialDy = angledY * (-1);
				 }else{
					 officialDy = angledY;
				 }
				 officialDx = angledX * (-1);
			 }else if(ballX > balloonX + b.getWidth()) {
				 
				 if(officialDy < 0) {
					 officialDy = angledY * (-1);
				 }else{
					 officialDy = angledY;
				 }
				 officialDx = angledX;
				 
			 }

			 flag = true;
			 
		 }else{
			 flag = false;
		 }
		 
		 
		 if(this.getY() + this.getHeight() >= getWorld().getHeight()) {
			 int s = ((DecaJumpWorld)getWorld()).getScoreObject().getScore();
			 ((DecaJumpWorld)getWorld()).getScoreObject().setScore(s - 1000);
		 }
	 */

}
