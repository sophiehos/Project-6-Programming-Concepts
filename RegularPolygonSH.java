//Sophia Hostetler
//U27264415
//Regular Polygon Class 
import java.util.Scanner;
   public class RegularPolygonSH 
{
//two variables as private members of the class
private int numberOfSides;
private double sideLength;

//constructor #1 no parameter
public RegularPolygonSH ()
{
   numberOfSides = 3;
   sideLength = 1.0;
}
//constructor #2 initialize the private members of the class
public RegularPolygonSH (int sides, double length)
{
   numberOfSides = sides;
   sideLength = length;
}
//Accessor for numberOfSides
public int getNumberOfSides()
{
   return numberOfSides;
}
//Mutator for numberOfSides
public void setNumberOfSides (int sides)
{
    numberOfSides = sides;
   
}
//Accessor for sideLength
public double getSideLength()
{
   return sideLength;
}
//Mutator for sideLength
public void setSideLength (double length)
{
   sideLength = length;
}   
//method that accepts no parameters but returns the perimeter of the polygon
public double Perimeter()
{
   double perimeter;
   perimeter = sideLength * numberOfSides;
   return perimeter;
}
//area of the polygon
public double Area()
{
   double area;
   area = (numberOfSides * sideLength * sideLength)/(4 * Math.tan(Math.PI / numberOfSides));
   return area;
}
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
  
}