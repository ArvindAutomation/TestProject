package Lesson1;

/*
 * Access modifier		Class 	Package		Subclass	World
 * Public					y	y			y				y	
 * Protected				y	y			y				n
 * no modifier				y	y			n				n	
 * Private					y	n			n				n
 */
public class Student {

	int id;
	String name;
	double age;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAge() {
		return age;
	}
	public void setAge(double age) {
		this.age = age;
	}
	
	public static void print() {
		System.out.println("Hello Student...");
	}
	
	Student(){
		id = 0;
		name ="";
		age=0;
		System.out.println("We are in Student constructor");
	}
	
	Student(int id1, String name1, int age1){
		id = id1;
		name =name1;
		age=age1;
		System.out.println("ID " + id);
		System.out.println("Name " + name);
		System.out.println("Age " + age);
	}
}
