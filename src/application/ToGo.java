package application;

//Malak_Haroon_Moqbel
//1210608
//lab sec_5
public class ToGo extends PizzaOrder {// a subclass
	public ToGo() {
	}

	public ToGo(String customerName, int pizzaSize, int numberOfToppings, double toppingPrice) {
		super(customerName, pizzaSize, numberOfToppings, toppingPrice);
	}

	@Override
	public String toString() {
		return "Customer Name = " + customerName + "\n" + "Pizza Size = " +getPizzaSize() + '\n' + "Date Ordered = "
				+ getDateOrdered() + '\n' + "Number of Toppings = " + numberOfToppings + '\n' + "Topping Price = "
				+ toppingPrice + '\n' + "order Price = " + calculateOrderPrice() ;

	}
}
