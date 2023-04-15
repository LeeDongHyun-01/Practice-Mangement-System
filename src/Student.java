public class Student {
	String name;
	int id;
	String email;
	String phone;
	String exercise;
	
	public Student() {
		
	}
public Student(String name, int id) {
		
		this.name=name;
		this.id=id;
		
}
	
	public Student(String name, int id,String email, String phone, String exercise) {
		
		this.name=name;
		this.id=id;
		this.email=email;
		this.phone=phone;
		this.exercise=exercise;
		
	}
	public void printInfo() {
		System.out.println("name: "+ name +" "+ "id: "+id+" "+ "email: " +email +" "+ "phone:" +phone +" "+"exercise: "+ exercise);
	}

}