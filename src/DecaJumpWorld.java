
public class DecaJumpWorld extends World{
	
	private Score score;
	
	public DecaJumpWorld(){
		score = new Score();
		score.setX(getWidth());
		score.setY(0);
		getChildren().add(score);
		
	}
	
	@Override
	public void act(long now) {
		// TODO Auto-generated method stub
		
	}
	
	public Score getScoreObject(){
		return score;
		
	}

}
 