package ShapeRepresentations;/*
THIS CODE WAS MY OWN WORK, IT WAS WRITTEN WITHOUT CONSULTING
CODE WRITTEN BY OTHER STUDENTS OR COPIED FROM ONLINE RESOURCES. LAURA NEFF
*/


// This class represents a rectangle shape
public class Rectangle {

		private double L; // the length of the rectangle
		private double H; // the height of the rectangle
		private double x; // the x coordinate of the  bottom left corner of the rectangle
		private double y; // the y coordinate of the bottom left corner of the rectangle



		public Rectangle(){
			L = 1;
			x = 0;
			y = 0;
		}



		public Rectangle(double Ell, double Eich, double Ex, double Why){
			L = Ell;
			H = Eich;
			x = Ex;
			y = Why;
		}


		public double getLength(){return L;}


		public double getHeight(){return H;}


	    public void setLength(double Ell){
			L = Ell;
		}


		public void setHeight(double Eich){
			H = Eich;
		}

		public double perimeter(){return ((2*H) + (2*L));}


		public double area(){return(L*H);}

}
