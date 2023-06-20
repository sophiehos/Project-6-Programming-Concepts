//Sophia Hostetler
//U27264415
//Regular Polygon Driver Program

import java.text.DecimalFormat;
import java.util.Scanner;
   public class PolygonDriverSH
{
  public static void main(String[] args) 
   {
  
//creation of two objects (polygons)
   Scanner scan = new Scanner(System.in);
   DecimalFormat soph = new DecimalFormat(".####");
   RegularPolygonSH poly1 = new RegularPolygonSH();
   RegularPolygonSH poly2 = new RegularPolygonSH();

//Variable for polygon update
 int side1;
 double length1;
//Prompt the user to enter values for the number of sides and the length of each  
  System.out.print("Enter number of sides (>= 3): ");
   side1 = scan.nextInt();
  while(side1 < 3)
 {
   System.out.print("Invalid entry. Re-enter number of sides (>= 3): ");
      side1 = scan.nextInt();
 }
 
 System.out.print("Enter length of each side (>= 1.0): ");
   length1 = scan.nextDouble();
 while(length1 < 1.0)
 {
   System.out.print("Invalid entry. Enter length of each side (>= 1.0): ");
    length1 = scan.nextDouble();
    }  
 //Use the class mutator methods to update the 2nd polygon.
 poly2.setNumberOfSides(side1);
 poly2.setSideLength(length1);



//Prompt the users for updated values of number of sides and length 
 System.out.print("Enter updated number of sides (>= 3): ");
 side1 = scan.nextInt();
  while(side1 < 3)
 {
    System.out.print("Invalid entry. Re-enter number of sides (>= 3): ");
      side1 = scan.nextInt();
 }
System.out.print("Enter updated length of each side (>= 1.0): ");
length1 = scan.nextDouble();
 while(length1 < 1.0)
 {
   System.out.print("Invalid entry. Enter length of each side (>= 1.0): ");
    length1 = scan.nextDouble();
    }  
// Create third polygon
 RegularPolygonSH poly3 = new RegularPolygonSH();

poly3.setNumberOfSides(side1);
poly3.setSideLength(length1);

//Ouput statement
System.out.println("Here is the info for the three polygons: ");
System.out.println(" Polygon 1 (which uses default values from its constructor) has " + poly1.getNumberOfSides() + " sides where each side is " + poly1.getSideLength() + " units of length.");
System.out.println("Polygon 1's perimeter is " + poly1.Perimeter() + " units and its area is " + soph.format(poly1.Area()) + " square units."); 
System.out.println("Polygon 2 (which uses updated values from its mutators) has " + poly2.getNumberOfSides() + " sides where each side is " + poly2.getSideLength() + " units of length.");
System.out.println("Polygon 2's perimeter is " + poly2.Perimeter() + " units and its area is " + soph.format(poly2.Area()) + " square units.");
System.out.println("Polygon 3 (which uses its 2-parameter constructor as well as updated values) has " + poly3.getNumberOfSides() + " sides where each side is " + poly3.getSideLength() + " units of length.");
System.out.println("Polygon 3's perimeter is " + poly3.Perimeter() + " units and its area is " + soph.format(poly3.Area()) + " square units.");  
   
   
   
   
   
   
   
   
   
   
   }
}
