package method;

public class UseAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ford ford = new Ford("Ford Mustang");
		Chevy chevy = new Chevy("Chevy Camaro");
		
		ford.setprice(35000);
		chevy.setPrice(32000);
		
		System.out.println(ford.getMake() + "Price: $" + ford.getprice());
		System.out.println(chevy.getMake() + "Price: $" + chevy.getprice());
	}

}
