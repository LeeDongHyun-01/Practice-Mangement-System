
public class Hunter {
	private int power;
	Hunter(int power){
		this.power = power;
	}
	public void attack(Monster a) {
		int b = a.getHp() - power;
		this.power = 100;
		a.setHp(b);
		System.out.println(a.getHp());
	}


}
