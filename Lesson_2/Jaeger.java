public class Jaeger {

	private String modelName = "Striker Eureka";
	private int mark = 5;
	private double height = 76.2;
	private double weight = 1850;
	private int speed = 10;
	private int strength = 10;
	private int armor = 9;
	private int murder = 11;
	private String status = "Desabled";
	private String lauching = "November 2, 2019";

	public String getModelName() {
		return modelName;
	}

	public int getMark() {
		return mark;
	}

	public double getHeight() {
		return height;
	}

	public double getWeight() {
		return weight;
	}

	public int getSpeed() {
		return speed;
	}

	public int getStrength() {
		return strength;
	}

	public int getArmor() {
		return armor;
	}

	public int getMurder() {
		return murder;
	}

	public String getStatus() {
		return status;
	}

	public String getLauching() {
		return lauching;
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

	public Jaeger() {}

	public Jaeger(String modelName, int mark, double height, double weight, int speed, 
            int strength, int armor, int murder, String status, String lauching) {
        this.modelName = modelName;
        this.mark = mark;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        this.strength = strength;
        this.armor = armor;
        this.murder = murder;
        this.status = status;
        this.lauching = lauching;
    }    

	@Override
    public String toString() {
    	return String.format("\nМодель робота = %s \nНомер поколения: Mark-%d \nВысота робота = %.1f метров" +
    			"\nВес робота = %.0f тонн \nСкорость робота = %d \nСила робота = %d" +
    			"\nЗащита робота = %d \nДата спуска на воду: %s \nУбил %d кайдзю \nСтатус робота: %s ", modelName, mark, +
				height, weight, speed, strength, armor, lauching, murder, status);    
    }
}