public class WolfTest {

	public static void main(String[] args) {
		System.out.println("WolfTest\n");
		Wolf wolfPet = new Wolf();
		wolfPet.sex = "male";
		System.out.println("Пол волка = " + wolfPet.sex);
		wolfPet.name = "archie";
		System.out.println("Кличка волка = " + wolfPet.name);
		wolfPet.color = "black";
		System.out.println("Цвет волка = " + wolfPet.color);
		wolfPet.weight = 56;
		System.out.println("Вес волка = " + wolfPet.weight + " кг");
		wolfPet.age = 8;
		System.out.println("Возраст волка = " + wolfPet.age + "лет ");
		wolfPet.go(); 
		wolfPet.sit();
		wolfPet.run();
		wolfPet.howl();
		wolfPet.hunt();
	}	
}