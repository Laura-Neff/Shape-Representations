package ShapeRepresentations;/*
THIS CODE WAS MY OWN WORK, IT WAS WRITTEN WITHOUT CONSULTING
CODE WRITTEN BY OTHER STUDENTS OR COPIED FROM ONLINE RESOURCES. LAURA NEFF
*/


public class ShapeTester {



    public boolean isLarger(Circle a, Rectangle b){

        double areaCircle = a.getArea();
        double areaRectangle = b.area();

        return(areaCircle > areaRectangle);

    }


    public double longerPerim(Circle a, Rectangle b){
        double circumference = a.getCircumference();
        double perimeter = b.perimeter();
        return(Math.max(circumference, perimeter));
    }


    public double longerPerim(Rectangle a, Circle b){
        double perimeter = a.perimeter();
        double circumference = b.getCircumference();
        return(Math.max(perimeter, circumference));
    }


    public double largerArea(Circle a, Rectangle b){
        double areaCircle = a.getArea();
        double areaRectangle = b.area();
        return(Math.max(areaCircle, areaRectangle));
    }


    public double largerArea (Rectangle b, Circle a){
        double areaCircle = a.getArea();
        double areaRectangle = b.area();
        return(Math.max(areaCircle, areaRectangle));

    }


    public boolean containsCenter(Circle a, Circle b){

        return(a.containsPoint(b.x,b.y));

    }

}
