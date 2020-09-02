package ClassAndObjects;

public class ClassBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box bx = new Box(12.5,5.4,6.9);
		System.out.println(bx.volume());
	
	}
	static class Box{
		double width,height,depth;
		Box(double wid,double hei,double dep)
		{
			width=wid;
			height=hei;
			depth=dep;
		}
		double volume() {
			double vol=width*height*depth;
			return vol;
		}
	}

}
