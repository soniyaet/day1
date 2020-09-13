package day4;
/*Create an abstract class named Shape with the following protected attributes / member variables.
String name
Include a 1-argument constructor.
Include getters and setters.
Include an abstract method named calculateArea() . This method returns a Float value.*/
 abstract class Shape{
	protected String name;
	abstract Float calculateArea();  
	Shape(String name)
	{
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
}
/*
 * Create a class named Circle . The class Circle is a derived class of Shape.
 * Include the following private attributes / member variables. Integer radius
 * Include a 2-argument constructor. The order of the arguments is name, radius.
 * Include getters and setters. Override the abstract method calculateArea()
 * defined in the Shape class. This method returns the area of the circle. [Take
 * the value of pi as 3.14]
 */

class Circle extends Shape
{
	final float PI=3.14f;
	private int radius;
	Circle(String name,int radius)
	{
		super(name);
		this.radius=radius;
	}
	Float calculateArea()
	{
		float area=PI*radius;
		return area;
	}
}
/*
 * Create a class named Square. The class Square is a derived class of Shape.
 * Include the following private attributes / member variables. Integer side
 * Include a 2-argument constructor. The order of the arguments is name, side.
 * Include getters and setters. Override the abstract method calculateArea()
 * defined in the Shape class. This method returns the area of the square.
 */
 class Square extends Shape
{
	private int side;
	Square(String name,int side)
	{
		super(name);
		this.side=side;
	}
	Float calculateArea() {
		float area=side*side;
		return area;
	}
}
/*
 * Create a class named Rectangle . The class Rectangle is a derived class of
 * Shape. Include the following private attributes / member variables. Integer
 * length Integer breadth Include a 3-argument constructor. The order of the
 * arguments is name, length, breadth Include getters and setters. Override the
 * abstract method calculateArea() defined in the Shape class. This method
 * returns the area of the rectangle.
 */
 class Rectangle extends Shape
 {
 	private int breadth,length;
 	Rectangle(String name,int length,int breadth)
 	{
 		super(name);
 		this.length=length;
 		this.breadth=breadth;
 	}
 	Float calculateArea() {
 		float area=length*breadth;
 		return area;
 	}
 }
public class ShapeMain{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle=new Circle("Circle",5);
		Square square=new Square("Square",10);
		Rectangle rectangle=new Rectangle("rectangle",5,6);
		System.out.println("Area of circle: ");
		System.out.println(circle.calculateArea());
		System.out.println("Area of square: ");
		System.out.println(square.calculateArea());
		System.out.println("Area of rectangle: ");
		System.out.println(rectangle.calculateArea());
	}

}
