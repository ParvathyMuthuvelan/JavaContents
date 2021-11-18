package com.training.ooc;

class Car {
	private int modelId;
	private String modelName;
	private String color;

	Car() {
		//System.out.println(); error
		this(2019, "Maruti");
		System.out.println("def cons called");
	}

	Car(int modelId, String modelName) {
		this(modelId, modelName, "Grey");
		System.out.println("2-arg cons called");
	}

	Car(int modelId, String modelName, String color) {
		System.out.println("3-arg cons called");
		this.modelId = modelId;
		this.modelName = modelName;
		this.color = color;
	}

	void display() {
		System.out.println("Model Id:" + modelId);
		System.out.println("Model :" + modelName);
		System.out.println("Color:" + color);
	}
}

public class ConsChainingDemo {

	public static void main(String[] args) {
		Car c = new Car();
		c.display();
	//	Car c1 = new Car(2020,"Toyota","Red");
		//c1.display();

	}

}
