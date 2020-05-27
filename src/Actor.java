import java.util.ArrayList;
import java.util.List;

import javafx.scene.layout.Pane;

public abstract class Actor extends javafx.scene.image.ImageView{
	private double dx = 0;
	private double dy = 0;

	public abstract void act(long now);
	
	public double getDx(){
		return dx;
	}
	
	public double getDy(){
		return dy;
	}
	
	
	public void move(double dx, double dy){
		this.dx = dx;
		this.dy = dy;
		this.setX(this.getX() + dx);
		this.setY(this.getY() + dy);
	}
	
	public World getWorld(){
		return (World)(this.getParent());
	}
	
	public double getWidth(){
		return getBoundsInParent().getWidth();
	}
	
	public double getHeight(){
		return getBoundsInParent().getHeight();
	}
	
	public <A extends Actor> java.util.List<A> getIntersectingObjects(java.lang.Class<A> cls){
		
		List<A> objects = this.getWorld().getObjects(cls);
		
		ArrayList<A> intersectingObjects = new ArrayList<A>();
		
		for(int i = 0; i < objects.size(); i++){
			if(!objects.get(i).equals(this) && objects.get(i).intersects(getX(), getY(), getWidth(), getHeight())){
				intersectingObjects.add(objects.get(i));
			}
		}
		
		return intersectingObjects;
		
	}
	
	public <A extends Actor> A getOneIntersectingObject(java.lang.Class<A> cls){
		List<A> objects = this.getWorld().getObjects(cls);
		
		for(int i = 0; i < objects.size(); i++){
			if(!objects.get(i).equals(this) && objects.get(i).intersects(getX(), getY(), getWidth(), getHeight())){
				return objects.get(i);
			} 
		}
		return null; 
	}

}
