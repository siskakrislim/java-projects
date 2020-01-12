
public class SeabirdColony {

	public static void main(String[] args) {
		Character var;
		var = new Dale();
		var.greet("hello");
		var = new Yale();
		var.greet("Hi");
		Character aYale = new Yale();
		aYale.greet("Greetings!");
		aYale.greet((Object) "My greetings to you!");
		// TODO Auto-generated method stub

	}

}
