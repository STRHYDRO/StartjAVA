public class WolfTest {

	public static void main(String[] args) {
		System.out.println("WolfTest\n");
		Wolf wolfPet = new Wolf();
		wolfPet.setSex("male");
		System.out.println("Пол волка = " + wolfPet.getSex());
		wolfPet.setName("archie");
		System.out.println("Кличка волка = " + wolfPet.getName());
		wolfPet.setColor("black");
		System.out.println("Цвет волка = " + wolfPet.getColor());
		wolfPet.setWeight(67.8f);
		System.out.println("Вес волка = " + wolfPet.getWeight() +" кг");
		wolfPet.setAge(9);
		System.out.println("Возраст волка = " + wolfPet.getAge() + " лет");
		wolfPet.go(); 
		wolfPet.sit();
		wolfPet.run();
		wolfPet.howl();
		wolfPet.hunt();
	}	
}