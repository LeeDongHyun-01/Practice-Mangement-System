
public class Triangle extends Shape {

	int l;
	int h;
	
	public Triangle(int l, int h) {
		this.l = l;
		this.h = h;
	}


	@Override
	public void getArea() {
		System.out.println(this.l*this.h/2);

		
	}

}
