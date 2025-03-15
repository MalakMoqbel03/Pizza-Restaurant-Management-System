package application;

//Malak_Haroon_Moqbel
//1210608
//lab sec_5
public class Seated extends PizzaOrder {// subclass extends from the superclass PizzaOrder

	public Seated() {
	}// non default constructor `

	private double serviceCharge;// attribute
	private int numberOfPeople;// attribute

	public double getServiceCharge() {
		return serviceCharge;
	}

	public void setServiceCharge(double serviceCharge) {
		this.serviceCharge = serviceCharge;
	}

	public int getNumberOfPeople() {
		return numberOfPeople;
	}

	public void setNumberOfPeople(int numberOfPeople) {
		this.numberOfPeople = numberOfPeople;
	}
	

	public Seated(String customerName, int pizzaSize, int numberOfToppings, double toppingPrice, double serviceCharge,
			int numberOfPeople) {
		super(customerName, pizzaSize, numberOfToppings, toppingPrice);
		this.serviceCharge = serviceCharge;
		this.numberOfPeople = numberOfPeople;

		
	}
	@Override
	public String toString() {
		return "Customer Name = " + customerName + "\n" + "Pizza Size = " + getPizzaSize() + '\n' + "Date Ordered = "
				+ getDateOrdered() + '\n' + "Number of Toppings = " + numberOfToppings + '\n' + "Topping Price = "
				+ toppingPrice + '\n' + "order Price = " + calculateOrderPrice()+ "Zone = ";

	}
	

	@Override
	public int calculateOrderPrice() {// method which overrides the method in PizzaOrder

		return (int) (super.calculateOrderPrice() + (serviceCharge * numberOfPeople));
	}

}
