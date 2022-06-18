public class Player {

	private String name;
	private int numPlayer;
	
 	public String getName() {
 		return name;
 	}

 	public int getNumPlayer() {
 		return numPlayer;
 	}

 	public void setNumPlayer(int numPlayer) {
 		this.numPlayer = numPlayer;
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

