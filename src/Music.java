
public class Music {
	String name;
	String song;
	
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
}
	public String getSong() {
		return this.song;
	}
	public void setSong(String song) {
		this.song = song;
	}
	public void printPlaydata() {
		
		System.out.println(getName()+"의" + " " + getSong());
	}


}
