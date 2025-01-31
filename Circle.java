import java.util.*;
class Circle{
	double radius;
	Circle(double radius){
		this.radius = radius;
	}
	
	Double area(){
		return 3.14*radius*radius;
	}
	
	Double circumference(){
		return 2*3.14*radius;
	}
	
	void display(){
		System.out.println("Circle Details: ");
		System.out.println("Area: "+ area());
		System.out.println("Circumference: "+ circumference());
	}
	
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter radius of the circle: ");
    double radius = sc.nextDouble();

    Circle circle = new Circle(radius);
    circle.display();
	}
}