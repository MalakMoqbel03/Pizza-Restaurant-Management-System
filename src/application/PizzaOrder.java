package application;

//Malak_Haroon_Moqbel
//1210608
//lab sec_5
import java.util.*;

public abstract class PizzaOrder implements Comparable<PizzaOrder>  {// class PizzaOrder which implements the Comparable
																// interface
	// attributes:
	
	
	final static int SMALL = 1, MEDIUM = 2, LARGE = 3;

	public String customerName;
	public Date dateOrdered;
	public int numberOfToppings;
	public double toppingPrice;
	protected int pizzaSize;

	public double getToppingPrice() {
		return toppingPrice;
	}

	public void setToppingPrice(double toppingPrice) {
		this.toppingPrice = toppingPrice;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Date getDateOrdered() {
		Date date = new Date();
		return date;
	}

	public void setDateOrdered(Date dateOrdered) {
		this.dateOrdered = dateOrdered;
	}

	public int getNumberOfToppings() {
		return numberOfToppings;
	}

	public void setNumberOfToppings(int numberOfToppings) {
		this.numberOfToppings = numberOfToppings;
	}

	public String getPizzaSize() {
		if (pizzaSize == SMALL)
			return "Small";
		else if (pizzaSize == MEDIUM)
			return "MEDIUM";
		else if (pizzaSize == LARGE)
			return "LARGE";
		else
			return "try again";

	}

	public void setPizzaSize(int pizzaSize) {
		this.pizzaSize = pizzaSize;
	}

	public PizzaOrder() {

	}

	public PizzaOrder(String customerName, int pizzaSize, int numberOfToppings, double toppingPrice) {
		super();
		this.customerName = customerName;
		this.numberOfToppings = numberOfToppings;
		this.toppingPrice = toppingPrice;
		this.pizzaSize = pizzaSize;

	}

	@Override
	public String toString() {
		return "Customer Name = " + customerName + "\n" + "Pizza Size = " + getPizzaSize()+ '\n' + "Date Ordered = "
				+getDateOrdered() + '\n' + "Number of Toppings = " + numberOfToppings + '\n' + "Topping Price = "
				+ toppingPrice + '\n' + "order Price = " + calculateOrderPrice();

	}

	public int calculateOrderPrice() {// calculates the price of the pizza order
		return (int) (numberOfToppings * toppingPrice * pizzaSize);

	}

	public void printOrderInfo() {// prints only the customer’s name and the calculated order price on one line to
									// the screen.
		System.out.println("customer’s name is : " + customerName + " ,Order price = " + calculateOrderPrice());
	}

	@Override
	public int compareTo(PizzaOrder order) {
		if (calculateOrderPrice() > order.calculateOrderPrice())
			return 1;
		else if (calculateOrderPrice() < order.calculateOrderPrice())
			return -1;
		else
			return 0;
	}

}
