package Polymorphism;
class Fruit
{
	String Name;
	String Taste;
	int size;
	void eat(String name,String taste)
	{
		this.Name=name;
		this.Taste=taste;
		System.out.println("Fruit name is "+Name);
		System.out.println("Taste is "+Taste);
	}
}
	class Apple extends Fruit
	{
		void eat(String name,String taste)
		{
			super.eat(name,taste);
		}
	}
	class Orange extends Fruit
	{
		void eat(String name,String taste)
		{
			super.eat(name,taste);
		}
	}
	public class Fruit_apple_orange 
	{
		public static void main(String[] args)
		{
			Fruit apple=new Apple();
			apple.eat("Apple","Sweet");
			Fruit orange= new Orange();
			orange.eat("Orange","Bitter");
		}
}