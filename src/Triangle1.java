
public class Triangle1 implements Shape1{
	int l;
	int h;
	
	public Triangle1(int l, int h) {
		this.l = l;
		this.h = h;
	}


	public void getArea() {
		System.out.println(this.l*this.h/2);

		
	}

}
