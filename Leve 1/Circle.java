import java.util.*;
class Circle{
	private double radius;
	
	public Circle(){
	this.radius = 1.0;
	}
	
	public Circle(double radius){
	this.radius = radius;
	}
	
	public double circleArea(){
	return Math.PI*radius*radius;
	}
	
	public void displayDetails() {
        System.out.println("Circle Radius: " + radius);
        System.out.println("Circle Area: " + circleArea());
    }
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the radius: ");
	double radius = sc.nextDouble();
	
	System.out.println("\nDefault constructor Circle");
	Circle c1 = new Circle();
	c1.displayDetails();
	
	System.out.println("\nParameterised/custom Circle");
	Circle c2 = new Circle(radius);
	c2.displayDetails();
	
	}
}