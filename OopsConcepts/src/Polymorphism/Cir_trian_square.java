package Polymorphism;

class Shape{
	void draw()
	{
		System.out.println("Drawing shape");
	}
	void erase()
	{
		System.out.println("Erasing shape");
	}
}
class Circle extends Shape
{
	void draw()
	{
		System.out.println("Drawing circle");
	}
	void erase()
	{
		System.out.println("Erasing circle");
	}
}
class Triangle extends Shape
{
	void draw()
	{
		System.out.println("Drawing triangle");
	}
	void erase()
	{
		System.out.println("Erasing triangle");
	}
}
class Square extends Shape
{
	void draw()
	{
		System.out.println("Drawing Square");
	}
	void erase()
	{
		System.out.println("Erasing Square");
	}
}
public class Cir_trian_square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape c = new Circle();
		Shape t = new Triangle();
		Shape s = new Square();
		c.draw();
		c.erase();
		t.draw();
		t.erase();
		s.draw();
		s.erase();
		}

}
