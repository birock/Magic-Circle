import processing.core.PApplet;
/*
 * CS101: HW #8
 * Author: Ben Rock
 * This application is a simple exercise of the Processing library and its functionalities. Within the class "Magic Circle", 
 * the user interacts with a dynamic circle which changes color and dimensions depending upon the position of the mouse. 
 * The x-position and red component vary with the horizontal location of the mouse, and the y-position and green component vary
 * with the vertical location of the mouse. When the user clicks, the circle magically turns into a rectangle which exhibits
 * the same properties. It's visually captivating and magical!
 */

// Create public class which extends PApplet library (imported prior to documentation)
public class Magic_Circle extends PApplet {
	
	// Use setup method to initialize size of the window 
	public void setup() {
		
		size(500,500);
		
	}
	
	// Use draw method to create the magic circle 
	public void draw() {
		
		// Instantiate an object of type Shape using the 'Shape' class
		// It will have the identity 'c' for circle
		Shape shape = new Shape('c',this);
		
		// Including the constant iteration of background as black will allow the user to freely move
		// the magic circle around the screen without leaving a path 
		background(0,0,0);
		
		// Use mouseX and mouseY from PApplet library to have color and dimensions vary with location of the mouse
		// This allows for user interaction with the application
		fill(mouseX,mouseY,127);
		
		// Use makeShape method to create the circle 
		shape.makeShape(mouseX, mouseY, mouseX, mouseY);
		
		// Use mousePressed functionality to have the shape change when the user clicks 
		if (mousePressed) {
			
			// changeShape method switches the object shape to the opposite identity
			// In this case is switches from circle to square
			shape.changeShape();
			
			// mouseX and mouseY should be divided by 2 when specifying the location of the rectangle so as
			// to maintain consistency with the circle 
			fill(mouseY,mouseX,127);
			shape.makeShape(mouseX/2, mouseY/2, mouseX, mouseY);
			
		}
		
		}
	}


