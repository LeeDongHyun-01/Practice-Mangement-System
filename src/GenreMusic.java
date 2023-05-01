
public class GenreMusic extends Music {
	String genre;
	
	public String getGenre() {
		return this.genre;	
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public void printGenre() {
		System.out.println(getName()+"의" + " " + getSong()+ " " +getGenre());
	}

}
