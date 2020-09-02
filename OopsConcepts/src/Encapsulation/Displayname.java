package Encapsulation;

public class Displayname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author ar = new Author();
		Bookdetails bk = new Bookdetails();
		bk.setName("Revolution 2020");
		bk.setPrice(1000);
		bk.setQtyinstack(250);
		ar.setName("Chetan Bhagat");
		ar.setEmail("chetanbhagat77@gmail.com");
		ar.setGender('m');
		System.out.println(bk.getName()+" "+bk.getPrice()+" "+bk.getQtyinstack());
		System.out.println(ar.getName()+" "+ar.getEmail()+" "+ar.getGender()); 
}
	public static class Author{
		private String name,email;
		private char gender;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public char getGender() {
			return gender;
		}
		public void setGender(char gender) {
			this.gender = gender;
		}
	}
public static class Bookdetails{
	private String name;
	private double price;
	private int qtyinstack;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQtyinstack() {
		return qtyinstack;
	}
	public void setQtyinstack(int qtyinstack) {
		this.qtyinstack = qtyinstack;
	}
	
	}
}

