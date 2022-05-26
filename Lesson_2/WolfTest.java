public class WolfTest {

	public static void main(String[] args) {
		System.out.println("WolfTest\n");
		Wolf wolfPet = new Wolf();
		System.out.println("Пол волка = " + (wolfPet.sex = "male"));
		System.out.println("Кличка волка = " + (wolfPet.name = "archie"));
		System.out.println("Цвет волка = " + (wolfPet.color = "black"));;
		System.out.println("Вес волка = " + (wolfPet.weight = 56) + " кг");
		System.out.println("Возраст волка = " + (wolfPet.age = 8) + "лет ");
		wolfPet.go(); 
		wolfPet.sit();
		wolfPet.run();
		wolfPet.howl();
		wolfPet.hunt();
	}	
}