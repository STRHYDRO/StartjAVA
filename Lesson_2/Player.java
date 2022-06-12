public class Player {

	private String namePlayer = " ";
	private int numPlayer = 0;

	
 	public String getNamePlayer() {
 		return namePlayer;
 	}

 	public void setNamePlayer(String namePlayer) {
 		this.numPlayer = numPlayer;
 	}

 	public int getNumPlayer() {
 		return numPlayer;
 	}

 	public void setNumPlayer(int numPlayer) {
 		this.numPlayer = numPlayer;
 	}
    
    //public Player() {}

	public Player(String namePlayer/*, int numPlayer*/) {
		this.namePlayer = namePlayer;
		//this.numPlayer = numPlayer; 
	}

	@Override
	public String toString() {
        return String.format("Имя первого игрока : ", namePlayer);
    }
}

