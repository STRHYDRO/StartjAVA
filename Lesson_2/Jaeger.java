public class Jaeger {

	private String modelName;
	private int mark;
	private String origin;
	private double height;
	private double weight;
	private int speed;
	private int strength;
	private int armor;
	private int murder;

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

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
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

	public void liveStatus() {
		System.out.println("\nСтатус робота: Destroyed");
	}

	public void lauching() {
		System.out.println("\nДата спуска на воду: 2 ноября 2019 года");
	}

	public void murders() {
		System.out.printf("Убил %d кайдзю", getMurder());
	}
}