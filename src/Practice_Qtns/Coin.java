package Practice_Qtns;

public class Coin {
	private final int HEAD=0;
	private int face;
	
	public Coin() {
		flip();
	}
	
	public void flip() {
		face=(int)(Math.random()*2);
	}
	public boolean isHead() {
		return (face==HEAD);
	}
	public String toString() {
		return (face==HEAD)?"Head":"Tail";
	}
	

}
