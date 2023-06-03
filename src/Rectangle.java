
public class Rectangle extends Shape {
	int l;
	int h;
	
	public Rectangle(int l, int h) {
		this.l = l;
		this.h = h;
	}


	@Override
	public void getArea() {
		System.out.println(this.l*this.h);

		
	}

}
