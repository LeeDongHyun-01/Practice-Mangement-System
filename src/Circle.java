
public class Circle extends Shape {
	int r;
	
	public Circle(int r) {
		this.r = r;
	}


	@Override
	public void getArea() {
		System.out.println(this.r*this.r*Math.PI);

		
	}

}
