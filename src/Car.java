
public class Car {
	int year;
	String maker;
	double speed;
	
	public Car(){
		year = 0;
		maker = "";
		speed = 0;    // 값을 초기화 해주는 생성자
		}
	
	void getYear() { //연도 생성자
		System.out.println("year" +  "=" + 2015);
	}
	void getMake() {//제작업체 생성자
		System.out.println("Make" + "=" + "Honda");
		
	}
	void getSpeed() {//속도 생성자
		speed += 5;
		System.out.println("car's maximum speed" + "=" + 85.0);
		
		
	}
	
	

	public static void main(String[] args) {
		Car car = new Car();
		car.getYear();
		car.getMake();
		car.getSpeed();
		car.getSpeed();
		car.getSpeed();
		System.out.println("현재 자동차 속도" + "=" + car.speed);

	}

}
