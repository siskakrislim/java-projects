
public class DrinkApp {

	public static void main(String[] args) {
		Drink latte = new Drink();
		//latte.drinkID = "latte";
		//latte.setDrinkCostPrice(2.00);
		//latte.setDrinkSellPrice(3.50);
		//latte.setDrinkQuantitySold(30);
		Drink mocca = new Drink("mocca", 2.00, 4.00, 20);
		Drink espresso = new Drink("espresso", 1.00, 3.00, 20);// TODO Auto-generated method stub
		//System.out.println(latte.toString());
		//System.out.println(mocca.toString());
		//System.out.println(espresso.toString());
		mocca.updateQuantitySold(10);
		System.out.println(latte.toString());
		System.out.println(mocca.toString());
		System.out.println(espresso.toString());
		double a = latte.totalProfit();
		double b = mocca.totalProfit();
		double c = espresso.totalProfit();
		System.out.println("\nTotal profit: $"+(a+b+c));

	}

}
