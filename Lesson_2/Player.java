public class Player {

	private String namePlayer;
	private int numPlayer;
	
 	public String getNamePlayer() {
 		return namePlayer;
 	}

 	public int getNumPlayer() {
 		return numPlayer;
 	}

 	public void setNumPlayer(int numPlayer) {
 		this.numPlayer = numPlayer;
 	}
    
    public Player() {}

	public Player(String namePlayer) {
		this.namePlayer = namePlayer;
		//this.numPlayer = numPlayer; 
	}

	@Override
	public String toString() {
        return String.format("Имя игрока : %s", namePlayer);
    }
}

