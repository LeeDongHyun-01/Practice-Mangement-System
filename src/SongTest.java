
public class SongTest {

	public static void main(String[] args) {
		GenreMusic a[] = new GenreMusic[3];
		GenreMusic b = new GenreMusic();
		GenreMusic c = new GenreMusic();
		GenreMusic d = new GenreMusic();
		
		b.setName("베토벤");
		b.setSong("운명");
		b.setGenre("(교향곡)");
		c.setName("헨델");
		c.setSong("메시아");
		c.setGenre("(오라토리오)");
		d.setName("비발디");
		d.setSong("사계");
		d.setGenre("(협주곡)");
		
		a[0] = b;
		a[1] = c;
		a[2] = d;
		
		for (int i=0; i <a.length; i++) {
			a[i].printPlaydata();
			a[i].printGenre();
		}
		
		

	}

}
