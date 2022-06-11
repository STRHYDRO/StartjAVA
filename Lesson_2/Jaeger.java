public class Jaeger {

	private String modelName;
	private int mark;
	private double height;
	private double weight;
	private int speed;
	private int strength;
	private int armor;
	private int murder;
	private String status;
	private String lauching;

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

	public int getMurder() {
		return murder;
	}

	public void setMurder(int murder) {
		this.murder = murder;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getLauching() {
		return lauching;
	}

	public void setLauching(String lauching) {
		this.lauching = lauching;
	}

	public void liveStatus() {
		System.out.println("\nСтатус робота: " + status);
	}

	public void lauching() {
		System.out.println("\nДата спуска на воду: " + lauching);
	}

	public void murders() {
		System.out.printf("Убил %d кайдзю", getMurder());
	}

	public Jaeger(String modelName, int mark, double height, double weight, int speed, 
        int strenght, int armor, int murder, String status, String lauching) {
    modelName = "crimsonTyphoon";
    mark = 4;
    height = 76.2;
    weight = 1722;
    speed = 9;
    strenght = 8;
    armor = 6;
    murder = 7;
    status = "desabled";
    lauching = "22 августа 2018 года";
    } 
}