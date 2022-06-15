public class Player {

	private String name;
	private int numPlayer1;
	private int numPlayer2;
	
 	public String getName() {
 		return name;
 	}

 	public int getNumPlayer1() {
 		return numPlayer1;
 	}

 	public void setNumPlayer1(int numPlayer1) {
 		this.numPlayer1 = numPlayer1;
 	}

	public int getNumPlayer2() {
 		return numPlayer2;
 	}

 	public void setNumPlayer2(int numPlayer2) {
 		this.numPlayer2 = numPlayer2;
 	} 
 
    public Player() {}

	public Player(String name) {
		this.name = name; 
	}

	@Override
	public String toString() {
        return String.format(name);
    }
}

