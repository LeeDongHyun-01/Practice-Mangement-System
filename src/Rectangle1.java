
public class Rectangle1 implements Shape1 {
	int l;
	int h;
	public Rectangle1(int l, int h) {
		this.l = l;
		this.h = h;
		
	}
	
	public void getArea() {
		System.out.println(this.l*this.h);
		
	}
	
}
