# Project-6-Programming-Concepts
Java Exercise 6
N-sided Regular Polygon Class and Driver Program
This exercise will help you get familiar with creating classes and objects of your own.
A regular polygon is an n-sided polygon whose sides are of the same length and whose angles
all have the same degree. The formula for computing the area and perimeter of a regular
polygon is
𝐴𝑟𝑒𝑎 = 𝑛 × 𝑠2
4 × tan (𝜋
𝑛)
𝑃𝑒𝑟𝑖𝑚𝑒𝑡𝑒𝑟 = 𝑛 × 𝑠
where n is the number of sides and s is the length of each side.
You will create a class file and a driver program that references information about the regular
polygon.
For the class file:
 Create a class that contains data and methods for a regular polygon.
o Name the class RegularPolygon followed by your initials for your first and last
name. (for example: if your name is Schinnel Small, the name of your class
should be RegularPolygonSS.)
 Create two variables as private members of the class
o The first variable should store the number of sides (as an int)
o The second variable should store the length of each side (as a double)
 Create two constructors for this class
o Remember, the name of your constructor should match the name of your class!
o The first constructor should not accept any parameters. It should set the private
members to 3 and 1.0 respectively
o The second constructor should accept two parameters (for the number of sides
and the length of each side.) These parameters should be used to initialize the
private members of the class.
 Create accessor and mutator methods for each of the private members
 Create a method that accepts no parameters but returns the perimeter of the polygon
o It should use the private members of the class to calculate the perimeter
 Create a method that accepts no parameters but returns the area of the polygon
o It should use the private members of the class to calculate the area
o Use Math.tan and Math.PI (from the Math class) in your formula
For the driver program:
 Create a program to test the class that you created
o The class should be called PolygonDriver following by the initials of your first and
last name. (e.g. if your name is John Smith, your driver program should be called
PolygonDriverJS.)
o Remember: This program should contain your main method
 Create 2 regular polygon objects using your class file
o Both polygons should use the constructor that has no parameters
 Update the values of the 2nd polygon using the class mutators
o Create local variables in main to store the number of sides and the length of
each side
o Prompt the user to enter values for the number of sides and the length of each
side. Use input validation to ensure that the number of sides is >=3 and the
length of each side is >= 1.0.
o Use the class mutator methods to update the 2nd polygon. (You will use the local
variables as arguments for the mutators).
 Prompt the users for updated values of number of sides and length (and validate the
input)
o You should be able to use the same local variables you created in the previous
step
 Create a 3rd polygon using the constructor that has two parameters.
o Use the updated values from the local variables to create this object
 Display information for the 3 polygon objects, using the accessor methods and the
perimeter and area methods
o Accessor methods should be called from a println statement in your driver
program to get the number of sides and length of sides from each polygon
o The perimeter and area methods should also be called from a println statement
to display the perimeter and area for each polygon. Use the DecimalFormat
class to format the area to 4 decimal places.
Here is a sample of the output
Enter number of sides (>= 3): 2
Invalid entry. Re-enter number of sides (>= 3): 4
Enter length of each side (>= 1.0): 0.5
Invalid entry. Enter length of each side (>= 1.0): 6.0
Enter updated number of sides (>= 3): 7
Enter updated length of each side (>= 1.0): 3.5
Here is the info for the three polygons:
Polygon 1 (which uses default values from its constructor) has 3
sides where each side is 1.0 units of length.
Polygon 1's perimeter is 3.0 units and its area is 0.433 square
units.
Polygon 2 (which uses updated values from its mutators) has 4
sides where each side is 6.0 units of length.
Polygon 2's perimeter is 24.0 units and its area is 36 square
units.
Polygon 3 (which uses its 2-parameter constructor as well as
updated values) has 7 sides where each side is 3.5 units of
length.
Polygon 3's perimeter is 24.5 units and its area is 44.5154
square units.
Notes:
 Do not create a toString method for this program.
 Recall: if a value is exact to less than 4 decimal places, the decimal format may not show
the trailing zeros (as in polygons 1 and 2). You do not have to show trailing zeros for the
area.
Extra Credit: TV Series List
In this exercise, you will create an ArrayList and use some of its methods. Slide 16 in lecture 9B
will be helpful for this question.
Write a program that does the following:
 Creates an ArrayList of Strings to store the shows. The ArrayList will initially be empty.
 Prompts the user for the number of shows they plan to watch this week. Store this
value in an int variable.
 Uses a for loop to update the ArrayList
o Use the int variable that stores the number of shows as the limit for the loop.
(i.e. if the user indicates that they’d like to watch 5 shows the loop should run 5
times.)
o The loop should prompt the user for the show names and store that in a local
String variable.
o The loop should use the add method from the ArrayList class(with the local
variable as an argument) to update the ArrayList.
o Remember, you should accommodate spaces in your show names, and use the
appropriate string methods to read them. Look out for any instances where the
TV show cannot be inputted (due to the use of next() vs. nextLine() methods).
 Let’s presume some time has passed. In your program, ask the user if they’ve caught
up to any shows.
o Create a String variable to store the response. It should not be the same
variable as the one that stores the shows!
 Create a while loop that does the following:
o while the response is yes, prompt the user to enter the show that they’ve
caught up on.
o Use the contains method from the ArrayList class to see if the show is on the
list
 if the contains method is equal to true, use the remove method from
the ArrayList class to remove the show
 else display a message that the show entered is not on the list
o Prompt the user for any more caught up shows (to get an update for the
response
 The loop should only repeat if the response is yes.
 Display the content of the updated ArrayList without using a for loop
Samples of the output are shown below:
Sample 1: Assumes you haven’t caught up to any shows
How many TV shows do you hope to watch this week? 3
Enter show 1: RWBY
Enter show 2: Kengan Ashura
Enter show 3: The Good Place
Have you caught up to any shows (answer yes or no): no
Here's what you still have to watch this week:
[RWBY, Kengan Ashura, The Good Place]
Sample 2: Assumes you’ve caught up to one show and will update the list
How many TV shows do you hope to watch this week? 3
Enter show 1: Father Brown
Enter show 2: Death in Paradise
Enter show 3: Watchmen
Have you caught up to any shows (answer yes or no): yes
Which show? Death in Paradise
Any other shows you're caught up with? (yes/no) no
Here's what you still have to watch this week:
[Father Brown, Watchmen]
Sample 3: Assumes you’ve caught up to one show but it’s not on the list. (It does not update
the list, as it doesn’t make sense to add a new show you’re caught up with to the list, just to
remove it.)
How many TV shows do you hope to watch this week? 2
Enter show 1: Watchmen
Enter show 2: RWBY
Have you caught up to any shows (answer yes or no): yes
Which show? Monday Night Football
That show is not on original list!
Any other shows you're caught up with? (yes/no) no
Here's what you still have to watch this week:
[Watchmen, RWBY]
