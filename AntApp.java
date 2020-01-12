
public class AntApp {

	public static void main(String[] args) {
		Ant ant1 = new Ant(15,2);
		Ant ant2 = ant1.copyme();
		Ant ant3 = ant2.copyme(ant2);
		System.out.println(ant1 == ant2);
		System.out.println(ant2 == ant3);
		System.out.println(ant1 == ant3);
		System.out.println(ant1.equals(ant2));
		System.out.println(ant2.equals(ant3));
		System.out.println(ant1.equals(ant3));
	}
	
	public static void increaseHeight1(Ant a) {
		int height = a.getHeight();
		a.setHeight(height + 5);
	}
	
	
	public static void increaseHeight2(int h) {
		h = h + 1;
	}
}
