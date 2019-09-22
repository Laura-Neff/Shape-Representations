/*
THIS CODE WAS MY OWN WORK, IT WAS WRITTEN WITHOUT CONSULTING
CODE WRITTEN BY OTHER STUDENTS OR COPIED FROM ONLINE RESOURCES. LAURA NEFF
*/

package ShapeRepresentations;

public class Cylinder extends Circle {

//    The center of the cylinder should have an x coordinate, a y coordinate, and the z coordinate
////    should be 0. It should also have a height, which is how tall the cylinder is in the z direction.
////    All coordinates and dimensions should be of type double. Think carefully about which
////    variables you will inherit from class Circle and, therefore, which new ones will you need to
////    define in class Cylinder.

    double z;
    double height;


// There should be two constructors in class Cylinder. The first one takes no arguments and
//    sets the center of the base at (0.0,0.0,0.0), the radius of the base at 1, and the height at 1.
//    The second constructor takes as input the x and y coordinates, the radius of the cylinder,
//    and the height of the cylinder.

    public Cylinder(){
        x = 0;
        y = 0;
        radius = 1;
        height = 1;
    }

    public Cylinder(double x, double y, double radius, double height){
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.height = height;
    }

//    Your class should define the methods getHeight (which returns the cylinder height), and
//    setHeight (which updates the cylinder height).

    public double getHeight(){
        return(this.height);
    }

    public void setHeight(double height){
        this.height = height;

    }

//    Your class should override the getArea method from class Circle to make it return the area
//    of the Cylinder object instead. Your method implementation here must utilize the getArea
//    computation already defined in the super class Circle. (You may invoke other methods from
//    the super class Circle as well, if needed.)

    @Override
    public double getArea() {

        return(this.getCircumference()*radius + this.getCircumference()*height);
    }

//    Your class should define the method getVolume which returns the volume of the Cylinder
//            object (as a double value).

    public double getVolume(){
        return(this.getArea()*height);
    }



}
