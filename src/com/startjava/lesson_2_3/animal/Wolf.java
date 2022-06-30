package com.startjava.lesson_2_3.animal;

public class Wolf {

	private String sex;
	private String name; 
	private String color;
	private float weight;
	private int age;
	
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;	
	}

	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
			
	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age > 8) {
			System.out.println("Некорректный возраст");	
		} else {
			this.age =age;
		}
	}

	public void go() {
		System.out.println("Идти");
	}

	public void sit() {
		System.out.println("Сидеть");
	}
	public void run() {
		System.out.println("Бежать");
	}

	public void howl() {
		System.out.println("Выть");
	}		
			
	public void hunt() {
		System.out.println("Охотиться");
	}
}		