package application;

//Malak_Haroon_Moqbel
//1210608
//lab sec_5
public class Delivery extends PizzaOrder {// class Delivery which extends PizzaOrder
	protected double tripRate;
	protected int Zone;

	public Delivery(String customerName, int pizzaSize, int numberOfToppings, double toppingPrice, double tripRate,
			int Zone) {
		super(customerName, pizzaSize, numberOfToppings, toppingPrice);
		this.tripRate = tripRate;
		this.Zone = Zone;
	}

	public Delivery() {

	}

	public double getTripRate() {
		return tripRate;
	}

	public void setTripRate(double tripRate) {
		this.tripRate = tripRate;
	}

	public int getZone() {
		return Zone;
	}

	public void setZone(int zone) {
		Zone = zone;
	}

	@Override
	public String toString() {
		return "Customer Name = " + customerName + "\n" + "Pizza Size = " +getPizzaSize() + '\n' + "Date Ordered = "
				+ getDateOrdered() + '\n' + "Number of Toppings = " + numberOfToppings + '\n' + "Topping Price = "
				+ toppingPrice + '\n' +"Zone = "+getZone()+"\n"+"Trip Rate ="+getTripRate()+"\n"+"order Price = " + calculateOrderPrice() ;

	}

	@Override
	public int calculateOrderPrice() {// method which overrides the method in PizzaOrder and adds the ( tripRate/100 *
										// total price * zone ) to the price

		return (int) (super.calculateOrderPrice() + tripRate / 100 * super.calculateOrderPrice() * Zone);
	}

}
