package application;

import java.util.ArrayList;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.awt.MultipleGradientPaint.CycleMethod;
import java.awt.event.ItemEvent;
import java.util.*;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.RadialGradient;
import javafx.scene.text.Font;
import javafx.scene.layout.*;
import javafx.scene.control.*;

public class Driver extends Application {

	@Override
	public void start(Stage primaryStage) {
		BorderPane big = new BorderPane();// the biggest stage

		GridPane root = new GridPane();// to put all the components in the order
		// making spaces between columns
		ColumnConstraints column1 = new ColumnConstraints();
		column1.setPercentWidth(30);
		ColumnConstraints column2 = new ColumnConstraints();
		column2.setPercentWidth(30);
		ColumnConstraints column3 = new ColumnConstraints();
		column3.setPercentWidth(30);
		ColumnConstraints column4 = new ColumnConstraints();
		column4.setPercentWidth(30);
		root.getColumnConstraints().addAll(column1, column2, column3, column4);// adding the columns to the grid pane
		root.setAlignment(Pos.CENTER);
		// gaping in horizontal and vertical
		root.setHgap(10);
		root.setVgap(12);
		root.setPadding(new Insets(10, 10, 10, 10));

		// Pizza images
		Image img = new Image("Pizza.png");
		ImageView imgv = new ImageView(img);
		imgv.setImage(img);

		imgv.setFitHeight(90);
		imgv.setFitWidth(90);
		root.add(imgv, 3, 9);

		Image img1 = new Image("Pizza.png");
		ImageView imgv1 = new ImageView(img1);
		imgv.setImage(img1);

		imgv1.setFitHeight(90);
		imgv1.setFitWidth(90);
		root.add(imgv1, 2, 9);
		Image img2 = new Image("Pizza.png");
		ImageView imgv2 = new ImageView(img2);
		imgv.setImage(img2);

		imgv2.setFitHeight(90);
		imgv2.setFitWidth(90);
		root.add(imgv2, 1, 9);

		Image img3 = new Image("Pizza.png");
		ImageView imgv3 = new ImageView(img3);
		imgv.setImage(img3);

		imgv3.setFitHeight(90);
		imgv3.setFitWidth(90);
		root.add(imgv3, 0, 9);

		// H box and label for welcome
		HBox welcome = new HBox();
		Label welcomelb = new Label("WELCOME, ORDER YOUR PIZZA NOW!");
		welcomelb.setTextFill(Color.RED);
		welcomelb.setFont(new Font("Arial", 25));
		welcome.getChildren().add(welcomelb);
		welcome.setAlignment(Pos.CENTER);
		// label and text fields for the customer name

		Label name = new Label("Customer Name: ");
		TextField txtName = new TextField();
		root.add(name, 0, 0);
		root.add(txtName, 1, 0);
		// combo box and label for pizza size
		ComboBox<String> pizzaSize = new ComboBox<>();

		Label pizzaSizelb = new Label("pizza size: ");
		pizzaSize.getItems().addAll("Small", "Medium", "Large");
		pizzaSize.getSelectionModel().selectFirst();
		root.add(pizzaSizelb, 0, 1);
		root.add(pizzaSize, 1, 1);
		// label and check box for toppings_list

		Label topping_listlb = new Label("List of toppings: ");
		topping_listlb.setPrefWidth(100);
		CheckBox GreenPeppersbtn = new CheckBox("Green Peppers");
		CheckBox Olivesbtn = new CheckBox("Olives");
		CheckBox Onionsbtn = new CheckBox("Onions");
		root.add(topping_listlb, 0, 3);
		root.add(Onionsbtn, 1, 3);
		root.add(Olivesbtn, 2, 3);
		root.add(GreenPeppersbtn, 3, 3);

		// label and text fields for topping_price
		TextField priceResultlb = new TextField("10");
		Label ToppingPricelb = new Label("Topping Price: ");
		root.add(ToppingPricelb, 0, 4);
		root.add(priceResultlb, 1, 4);

		// label and text fields for the order price
		TextField orderResultlb = new TextField("0.0");
		Label orderPricelb = new Label("Order Price: ");
		root.add(orderPricelb, 0, 10);
		root.add(orderResultlb, 1, 10);
		// label and text fields for trip rate

		Label TripRatelb = new Label("Trip Rate: ");
		TextField TripRatetxt = new TextField();
		root.add(TripRatelb, 0, 8);
		root.add(TripRatetxt, 1, 8);
		// label and text fields for zone

		Label zonelb = new Label("Zone:");
		TextField zonetxt = new TextField();
		root.add(zonelb, 0, 7);
		root.add(zonetxt, 1, 7);
		// label and text fields for Service Charge

		TextField ServiceChargetxt = new TextField();
		Label ServiceChargelb = new Label("Service Charge: ");
		root.add(ServiceChargelb, 0, 5);
		root.add(ServiceChargetxt, 1, 5);
		// label and text fields for number of people

		Label numOfPeoplelb = new Label("Number Of People: ");
		TextField numOfPeopletxt = new TextField();
		root.add(numOfPeoplelb, 0, 6);
		root.add(numOfPeopletxt, 1, 6);
		// label and radio buttons for Service Charge

		Label orderTypelb = new Label("Order Type: ");
		orderTypelb.setPrefWidth(85);

		RadioButton Togobtn = new RadioButton("ToGo");
		RadioButton Deliverybtn = new RadioButton("Delivery");
		RadioButton Seatedbtn = new RadioButton("Seated");
		ToggleGroup grouptype = new ToggleGroup();
		Togobtn.setToggleGroup(grouptype);// to allow the user to choose one of the choices only
		Deliverybtn.setToggleGroup(grouptype);
		Seatedbtn.setToggleGroup(grouptype);
		grouptype.selectToggle(Togobtn);
		root.add(orderTypelb, 0, 2);
		root.add(Togobtn, 1, 2);
		root.add(Deliverybtn, 2, 2);
		root.add(Seatedbtn, 3, 2);
		// Buttons at the end of the scene to make the actions
		Button processbtn = new Button("Process Order");
		Button PrintOrdersbtn = new Button("Print Orders");
		Button Reset = new Button("Reset");
		HBox btns = new HBox();
		btns.setSpacing(70);
		btns.getChildren().addAll(processbtn, PrintOrdersbtn, Reset);
		btns.setAlignment(Pos.CENTER);

		// hiding all the text fields and labels because the default value is to go
		big.setTop(welcome);
		big.setBottom(btns);
		big.setCenter(root);
		TripRatelb.setVisible(false);
		TripRatetxt.setVisible(false);
		zonelb.setVisible(false);
		zonetxt.setVisible(false);
		ServiceChargelb.setVisible(false);
		ServiceChargetxt.setVisible(false);
		numOfPeoplelb.setVisible(false);
		numOfPeopletxt.setVisible(false);

//Events 
		// when Deliverybtn_is clicked apply the actions
		Deliverybtn.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {

				TripRatelb.setVisible(true);
				TripRatetxt.setVisible(true);
				zonelb.setVisible(true);
				zonetxt.setVisible(true);
				ServiceChargelb.setVisible(false);
				ServiceChargetxt.setVisible(false);
				numOfPeoplelb.setVisible(false);
				numOfPeopletxt.setVisible(false);
			}
		});
		// when Seatedbtn_is clicked apply the actions
		Seatedbtn.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {

				TripRatelb.setVisible(false);
				TripRatetxt.setVisible(false);
				zonelb.setVisible(false);
				zonetxt.setVisible(false);
				ServiceChargelb.setVisible(true);
				ServiceChargetxt.setVisible(true);
				numOfPeoplelb.setVisible(true);
				numOfPeopletxt.setVisible(true);
			}
		});
		// when Togobtn_is clicked apply the actions
		Togobtn.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				Togobtn.setSelected(true);
				if (Togobtn.isSelected()) {
					TripRatelb.setVisible(false);
					TripRatetxt.setVisible(false);
					zonelb.setVisible(false);
					zonetxt.setVisible(false);
					ServiceChargelb.setVisible(false);
					ServiceChargetxt.setVisible(false);
					numOfPeoplelb.setVisible(false);
					numOfPeopletxt.setVisible(false);
				}
			}
		});
		// creating an array list of type pizza order
		ArrayList<PizzaOrder> orders = new ArrayList<>();

		processbtn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				// getting the name from the text field
				String CustomerName = txtName.getText();

				// getting integer value when i chose element from combo box
				int PizzaSize = 0;
				if (pizzaSize.getValue().equals("Small")) {
					PizzaSize = 1;
				} else if (pizzaSize.getValue().equals("Medium")) {
					PizzaSize = 2;
				} else if (pizzaSize.getValue().equals("Large")) {
					PizzaSize = 3;
				}
				// list of toppings_1 increasing when i choose more toppings_
				int numberOfToppings = 0;
				if (Onionsbtn.isSelected())
					numberOfToppings++;
				else if (Olivesbtn.isSelected())
					numberOfToppings++;
				else if (GreenPeppersbtn.isSelected())
					numberOfToppings++;
				// getting the choosed_radio button

				Toggle OrderType = grouptype.getSelectedToggle();
				{
					if (OrderType == Togobtn) {
						ToGo togo = new ToGo();// creating an object
						// parsing the string value to an integer
						double toppingPrice = Double.parseDouble(priceResultlb.getText());
						// adding to the array list
						orders.add(new ToGo(CustomerName, PizzaSize, numberOfToppings, toppingPrice));
						// Calculating the final order price
						double orderpricefinal = numberOfToppings * toppingPrice * PizzaSize;
						// adding the result to the oder price label
						orderResultlb.setText(String.valueOf(orderpricefinal));
					}

					if (OrderType == Deliverybtn) {
						Delivery delivery = new Delivery();// creating an object
						// parsing the string value to an integer
						double tripRate = Double.parseDouble(TripRatetxt.getText());
						int Zone = Integer.parseInt(zonetxt.getText());
						double toppingPrice = Double.parseDouble(priceResultlb.getText());
						// Calculating the final order price
						double orderpricefinal = (numberOfToppings * toppingPrice * PizzaSize)
								+ (tripRate / 100 * (numberOfToppings * toppingPrice * PizzaSize) * Zone);
						// adding the result to the oder price label

						orderResultlb.setText(String.valueOf(orderpricefinal));
						// adding to the array list
						orders.add(
								new Delivery(CustomerName, PizzaSize, numberOfToppings, toppingPrice, tripRate, Zone));
					}

					if (OrderType == Seatedbtn) {
						Seated seated = new Seated();// creating an object
						// parsing the string value to an integer
						double serviceCharge2 = Double.parseDouble(ServiceChargetxt.getText());
						int numberOfPeople = Integer.parseInt(numOfPeopletxt.getText());
						double toppingPrice = Double.parseDouble(priceResultlb.getText());
						// Calculating the final order price
						double orderpricefinal = ((numberOfToppings * toppingPrice * PizzaSize)
								+ (serviceCharge2 * numberOfPeople));
						// adding the result to the oder price label
						orderResultlb.setText(String.valueOf(orderpricefinal));
						// adding to the array list
						orders.add(new Seated(CustomerName, PizzaSize, numberOfToppings, toppingPrice, serviceCharge2,
								numberOfPeople));

					}

				}
			}
		});

		PrintOrdersbtn.setOnAction(new EventHandler<ActionEvent>() {
			//print the sorted orders 
			@Override
			public void handle(ActionEvent arg0) {
				Collections.sort(orders);
				TextArea textArea = new TextArea();
				textArea.setText(orders.toString());

				sortOrders(orders);

				StackPane secondaryLayout = new StackPane();
				secondaryLayout.getChildren().add(textArea);
				Scene secondScene = new Scene(secondaryLayout, 300, 200);

				// New window (Stage)
				Stage newWindow = new Stage();
				newWindow.setTitle("Sorted orders ");
				newWindow.setScene(secondScene);

				// Set position of second window, related to primary window.
				newWindow.setX(primaryStage.getX());
				newWindow.setY(primaryStage.getY());
				newWindow.show();

			}
		});
		Reset.setOnAction(new EventHandler<ActionEvent>() {
			//deleting all the saved orders 

			@Override
			public void handle(ActionEvent arg0) {
				txtName.setText(String.valueOf(""));
				ServiceChargetxt.setText(String.valueOf(""));
				numOfPeopletxt.setText(String.valueOf(""));
				zonetxt.setText(String.valueOf(""));
				TripRatetxt.setText(String.valueOf(""));
				orderResultlb.setText(String.valueOf(0.0));
				priceResultlb.setText(String.valueOf(10));
				Togobtn.setSelected(true);
				Onionsbtn.setSelected(false);
				Olivesbtn.setSelected(false);
				GreenPeppersbtn.setSelected(false);
				txtName.setVisible(true);
				name.setVisible(true);
				pizzaSize.setValue("Small");
				ServiceChargetxt.setVisible(false);
				ServiceChargelb.setVisible(false);
				numOfPeopletxt.setVisible(false);
				numOfPeoplelb.setVisible(false);
				zonetxt.setVisible(false);
				zonelb.setVisible(false);
				TripRatetxt.setVisible(false);
				TripRatelb.setVisible(false);
				orders.clear();

			}
		});

		Scene scene = new Scene(big, 610, 600);
		primaryStage.setTitle("Pizza Order");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
		ArrayList<PizzaOrder> order = new ArrayList<>();// ArrayList called order of type PizzaOrder and adds five
		// different orders to it

		order.add(new Delivery("Ahmad", PizzaOrder.LARGE, 3, 10, 10, 3));
		order.add(new Delivery("Suha", PizzaOrder.MEDIUM, 2, 5, 20, 2));
		order.add(new ToGo("Ribhi", PizzaOrder.MEDIUM, 4, 5));
		order.add(new Seated("Rana", PizzaOrder.SMALL, 3, 1, 2, 3));
		order.add(new Seated("Jamal", PizzaOrder.LARGE, 4, 2, 4, 5));
		sortOrders(order);

		calculateTotalOrdersPrice(order);
		System.out.println("Total sum of all order prices: " + calculateTotalOrdersPrice(order));
// Prints a report ( all properties and order price ) for the second Delivery
// order
		System.out.println(order.get(1).toString());

	}

	public static void sortOrders(ArrayList<PizzaOrder> order) {// Method sortOrders which takes an ArrayList of type
																// PizzaOrder as an argument and sorts it
		Collections.sort(order);
		for (PizzaOrder order1 : order) {
			order1.printOrderInfo();// Prints the sorted orders customer names and prices
		}

	}

	public static double calculateTotalOrdersPrice(ArrayList<PizzaOrder> PizzaOrder) {// the total sum of all order
																						// prices
		double totalPrice = 0;
		for (PizzaOrder order : PizzaOrder) {
			totalPrice = totalPrice + order.calculateOrderPrice();
		}

		return totalPrice;
	}

}
