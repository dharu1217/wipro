package Inheritance;

public class Bird extends Animal {
	void fly()
	{
		System.out.println("Fly");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal = new Animal();
		animal.eat();
		animal.sleep();
		Bird bird = new Bird();
		bird.eat();
		bird.sleep();
		bird.fly();

	}

}
