import processing.core.PApplet;

// Create Shape class
public class Shape extends PApplet {

	// Identity character determines whether object is a circle or square
	public char identity;
	
	// Initialize other variables
	PApplet canvas;
	float length;
	float width;
	float x_pos;
	float y_pos;
	
	// Create constructors
	public Shape(char identity, PApplet canvas) {
		this.identity = identity;
		this.canvas = canvas;
	}
	
	public Shape(float length, float width, float x_pos, float y_pos) {
		this.length = length;
		this.width = width;
		this.x_pos = x_pos;
		this.y_pos = y_pos;
	}
	
	// makeShape method creates a shape of the identity specified in the object instantiation
	public void makeShape(float length, float width, float x_pos, float y_pos) {
		if (this.identity == 'c') {
			canvas.ellipse(length, width, x_pos, y_pos);
		}
		else {
			canvas.rect(length,width,x_pos,y_pos);
		}
	}
	
	// changeShape method switches an object to the other shape 
	public void changeShape() {
		if (this.identity == 'c') {
			this.identity = 's';
		}
		else {
			this.identity = 'c';
		}
	}
	
	
	
}
