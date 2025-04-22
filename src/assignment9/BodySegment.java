package assignment9;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class BodySegment {

	private double x, y, size;
	private Color color;
	
	public BodySegment(double x, double y, double size) {
		//FIXME
		 this.x = x;
	     this.y = y;
	     this.size = size;
	     this.color = Color.GREEN;
		
		//See ColorUtils for some color options (or choose your own)
	}
	
	/**
	 * Draws the segment
	 */
	public void draw() {
		//FIXME
		 StdDraw.setPenColor(color);       
	     StdDraw.filledCircle(x, y, size / 2);
	}
	
	public double getX() {
		return this.x;
	}
	
	public double getY() {
		return this.y;
	}
	
}
