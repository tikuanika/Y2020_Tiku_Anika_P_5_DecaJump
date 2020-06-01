import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import javafx.animation.AnimationTimer;
import javafx.collections.ObservableList;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;

public abstract class World extends Pane{
	private AnimationTimer timer;
	private HashSet<KeyCode> keyDown;
	public Score score;
	
	public World() {
		timer = new myAnimationTimer();
		keyDown = new HashSet<KeyCode>();
	}
	
	public abstract void act(long now);
	
	public Score getScore(){
		return score;
	}
	
	public void add(Actor actor) {
		this.getChildren().addAll(actor);
	}
	
	public void remove(Actor actor) {
		this.getChildren().remove(actor);
	}
	
	public void start() {
		timer.start();
	}
	
	public void stop() {
		timer.stop();
	}
	
	public  <A extends Actor> java.util.List<A> getObjects(java.lang.Class<A> cls){
		ObservableList actors = this.getChildren();
		List<A> result = new ArrayList();
		for (int i=0; i< actors.size(); i++) {
			if(cls.isInstance(actors.get(i))) {
				result.add(cls.cast(actors.get(i)));
			}
		}
		return result;
	}
	
	public void addKeyCode(KeyCode code) {
		keyDown.add(code);
	}
	
	public void removeKeyCode(KeyCode code) {
		keyDown.remove(code);
	}
	
	public boolean hasKeyCode(KeyCode code) {
		return keyDown.contains(code);
	}
	
	public class myAnimationTimer extends AnimationTimer{
		private long previousTime = 0;
		private double delay;
		@Override
		public void handle(long arg0) {
			// TODO Auto-generated method stub
			act(arg0);
			ObservableList actors = getChildren();
			for(int i=0; i<actors.size(); i++) {
				if(Actor.class.isInstance(actors.get(i))) {
					((Actor)actors.get(i)).act(arg0);
				}
			}
		}
	}
}
