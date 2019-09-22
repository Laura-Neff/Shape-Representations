//package ShapeRepresentations;

import ShapeRepresentations.*;

public class ShapeTester {

  // TODO: [2 points] Write the method isLarger which takes as input two shapes
  // (a ShapeRepresentations.Circle first, then a ShapeRepresentations.Rectangle) and returns true if the area of
  // the circle is bigger than (or equal to) the area of the rectangle,
  // false otherwise.
  // ... Add your code here ... //

    public boolean isLarger(Circle a, Rectangle b){

        double areaCircle = a.getArea();
        double areaRectangle = b.area();

        return(areaCircle > areaRectangle);

    }

  // TODO: [2 points] Write the method longerPerim which takes as input
  // a ShapeRepresentations.Circle object followed by a ShapeRepresentations.Rectangle object and returns
  // the length of the perimeter of the longer of the two objects.
  // ... Add your code here ... //

    public double longerPerim(Circle a, Rectangle b){
        double circumference = a.getCircumference();
        double perimeter = b.perimeter();
        return(Math.max(circumference, perimeter));
    }

  // TODO: [2 points] Write another version of the method longerPerim which has the
  // same name and functionality but it takes as input a ShapeRepresentations.Rectangle object
  // followed by a ShapeRepresentations.Circle object. The method also returns the length of
  // the perimeter of the longer of the two objects.
  // ... Add your code here ... //

    public double longerPerim(Rectangle a, Circle b){
        double perimeter = a.perimeter();
        double circumference = b.getCircumference();
        return(Math.max(perimeter, circumference));
    }

  // TODO: [2 points] Write the method largerArea which takes as input
  // a ShapeRepresentations.Circle object followed by a ShapeRepresentations.Rectangle object and returns
  // the area of the larger of the two objects.
  // ... Add your code here ... //

    public double largerArea(Circle a, Rectangle b){
        double areaCircle = a.getArea();
        double areaRectangle = b.area();
        return(Math.max(areaCircle, areaRectangle));
    }

  // TODO: [2 points] Writer another version of the method largerArea which has the
  // same name and functionality but it takes as input a ShapeRepresentations.Rectangle object
  // followed by a ShapeRepresentations.Circle object.
  // ... Add your code here ... //

  // TODO: [10 points] Write the method containsCenter which takes as input two circles,
  // and returns true if the first circle contains the center of the second circle,
  // false otherwise.
  // ... Add your code here ... //

}
