
public class MonsterGame {

	public static void main(String[] args) {
		
		Monster monster = new Monster(1000);
		System.out.println("몬스터 체력" + "=" + monster.getHp());
		
		Hunter hunter = new Hunter(100);
		hunter.attack(monster);
		System.out.println("현재 남아있는 몬스터의 체력" + "=" +monster.getHp());
		hunter.attack(monster);
		System.out.println("현재 남아있는 몬스터의 체력" + "=" +monster.getHp());
			
		}
	}


