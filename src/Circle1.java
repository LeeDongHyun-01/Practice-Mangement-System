
public class Circle1 implements Shape1{
	int r;
	public Circle1(int r) {
		this.r = r;
		
	}
	
	public void getArea() {
		System.out.println(this.r*this.r*Math.PI);
		
	}

}
