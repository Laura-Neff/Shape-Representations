package ShapeRepresentations;/*
THIS CODE WAS MY OWN WORK, IT WAS WRITTEN WITHOUT CONSULTING
CODE WRITTEN BY OTHER STUDENTS OR COPIED FROM ONLINE RESOURCES. LAURA NEFF
*/


// This class represents a circle shape
public class Circle {

    // Instance variables (data members) of class ShapeRepresentations.Circle
    protected double radius; // the radius of the circle
    protected double x; // the x coordinate of the circle's center
    protected double y; // the y coordinate fo the circle's center

    // The default constructor with no argument
    public Circle(){
      // Initializing the values of the instance variables
      radius = 1.0;
      x = 0.0;
      y = 0.0;
    }

    // Second constructor with given radius, but origin default
    public Circle(double r) {
      radius = r;
      x = 0.0;
      y = 0.0;
    }


    public Circle(double r, double ex, double why) {


        radius = r;
        x = ex;
        y = why;
    }

    // A public getter method for retrieving the radius
    public double getRadius() {
     return radius;
    }

    // A public getter method for retrieving the center coordinates
    public double[] getCenter() {
     double[] c = {this.x, this.y};
     return c;
    }

    // A public getter method for computing and returning
    // the area of the circle
    public double getArea() {
      return radius * radius * Math.PI;
    }


    public double getCircumference() {


        return(2*Math.PI*radius);
    }



    public boolean isBiggerThan(Circle b) {


        double thisArea = this.radius*this.radius*Math.PI;
        double areaB = b.radius*b.radius*Math.PI;

        return(thisArea > areaB);



    }


    public boolean containsPoint(double x, double y) {


        double distance = Math.pow((x - this.x),2) + Math.pow((y - this.y),2);
        return(distance <= this.radius*this.radius);

    }



    public void setRadius(double radius){
        this.radius = radius;
    }


    public void setCenter(double ex, double why){
        x = ex;
        y = why;
    }


    @Override
    public String toString() {
        return "This circle is centered at point (" + x + ", " + y + ")";
    }
}
