import java.util.*;
class Person{
	private String name;
	private int age;
	
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public Person(Person copy){
	this.name = copy.name;
	this.age = copy.age;
	}
	
	public void display(){
	System.out.println("Name: "+ name);
	System.out.println("Age: "+ age);
	}
	
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Name: ");
	String name = sc.nextLine();
	
	System.out.println("Enter the Age: ");
	int age = sc.nextInt();
	
	Person p1 = new Person(name, age);
	Person p2 = new Person(p1);
	
	System.out.println("\nOriginal Person:");
    p1.display();

    System.out.println("Cloned/Copied Person:");
    p2.display();

	}
}