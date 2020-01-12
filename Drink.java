
public class Drink {

	public String drinkID;
	private double drinkCostPrice;
	private double drinkSellPrice;
	private int drinkQuantitySold;
	public double totalProfit;
	
	public Drink() {
		drinkID = "latte";
		drinkCostPrice = 2.50;
		drinkSellPrice = 3.50;
		drinkQuantitySold = 30;
	}
	
	public Drink(String drinkID, double cp, double sp, int qty) {
		this.drinkID = drinkID;
		drinkCostPrice = cp;
		drinkSellPrice = sp;
		drinkQuantitySold = qty;
	}
	
	public double getDrinkCostPrice() {
		return drinkCostPrice;
	}
	
	public void setDrinkCostPrice(double cp) {
		drinkCostPrice = cp;
	}
	
	public double getDrinkSellPrice() {
		return drinkSellPrice;
	}
	
	public void setDrinkSellPrice(double sp) {
		drinkSellPrice = sp;
	}
	
	public int getDrinkQuantitySold() {
		return drinkQuantitySold;
	}
	
	public void setDrinkQuantitySold(int qty) {
		drinkQuantitySold = qty;
	}
	
	public void updateQuantitySold(int qty) {
		drinkQuantitySold+=qty;
	}
	
	public double computeProfit() { 
		return (drinkSellPrice - drinkCostPrice)*drinkQuantitySold;
	}
	
	public double totalProfit() {
		return totalProfit+=computeProfit();
	}
	
	public String toString() {
		return drinkID+"\tCost Price: $"+getDrinkCostPrice()+"\t\tSelling Price: $"+getDrinkSellPrice()+"  Quantity Sold: "+getDrinkQuantitySold()+
			"\t\tProfit earned for "+drinkID+": $"+computeProfit();
	}
}
