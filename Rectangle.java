/*
THIS CODE WAS MY OWN WORK, IT WAS WRITTEN WITHOUT CONSULTING
CODE WRITTEN BY OTHER STUDENTS OR COPIED FROM ONLINE RESOURCES. LAURA NEFF
*/


package ShapeRepresentations;

// This class represents a rectangle shape
public class Rectangle {

		private double L; // the length of the rectangle
		private double H; // the height of the rectangle
		private double x; // the x coordinate of the  bottom left corner of the rectangle
		private double y; // the y coordinate of the bottom left corner of the rectangle

		// TODO: [3 points] Write a basic constructor that creates a rectangle with
		// side lengths 1 whose bottom left corner is at (0.0,0.0)
		// ... Add your code here ... //

		public Rectangle(){
			L = 1;
			x = 0;
			y = 0;
		}

		// TODO: [3 points] Now write a constructor that takes all four inputs,
		// named Ell, Eich, Ex, and Why for L, H, x, and y, respectively.
		// ... Add your code here ... //

		public Rectangle(double Ell, double Eich, Double Ex, Double Why){
			L = Ell;
			H = Eich;
			x = Ex;
			y = Why;
		}

		// TODO: [2 points] Write a method called getLength which returns the length.
		// ... Add your code here ... //

		public double getLength(){return L;}

		// TODO: [2 points] Write a method called getHeight which returns the height.
		// ... Add your code here ... //

		public double getHeight(){return H;}

		// TODO: [2 points] Write a method called setLength which takes as input a double
		// called Ell and uses it to set the length of the rectangle.
		// ... Add your code here ... //

	    public void setLength(double Ell){
			L = Ell;
		}

		// TODO: [2 points] Write a method called setHeight which takes as input a double
		// called Eich and uses it to set the height of the rectangle.
		// ... Add your code here ... //

		public void setHeight(double Eich){
			H = Eich;
		}

		// TODO: [3 points] Write a method called perimeter which computes and returns
		// the perimeter of the rectangle.
		// ... Add your code here ... //

		public double perimeter(){return ((2*H) + (2*L));}

		// TODO: [3 points] Write a method called area which computes and returns the
		// area of the rectangle.
		// ... Add your code here ... //

		public double area(){return(L*H);}

}
