package com.company;

public class Main {

	public Main(String species) {
		this.species = species;
	}

	public static void main(String[] args) {
		Animal dog = new Animal("dog");
		dog.name = "Szarik";
		dog.feed();
		dog.feed();
		dog.takeForAWalk();
		dog.takeForAWalk();
		dog.takeForAWalk();
		dog.takeForAWalk();
		dog.takeForAWalk();


	}

	String species;
	private Double weight;
	String name;
	Boolean furry;

	public void Animal(String species) {
		this.species = species;
		switch (this.species) {
			case "dog":
				this.weight = 10.2;
				break;
			case "cat":
				this.weight = 3.0;
				break;
			case "horse":
				this.weight = 50.0;
				break;
			default:
				this.weight = 1.0;
		}
	}

	void feed() {
		if (this.weight > 0) {
			this.weight = +1.0;
			System.out.println("Mniam! Przytyłem: " + this.weight);
		} else {
			System.out.println("Zwierzę już nie żyje!");
		}
	}

	void takeForAWalk() {
		if (this.weight > 0) {
			this.weight = -1.0;
			System.out.println("Hurra! Schudłem: " + this.weight);
		} else {
			System.out.println("Zwierzę już nie żyje!");
		}
	}

}