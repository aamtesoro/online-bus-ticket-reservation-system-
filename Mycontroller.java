package application;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Orientation;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Mycontroller extends Main {

	@FXML
	private TextField tf1;
	@FXML
	private TextField tf2;
	@FXML
	private Label lb4;
	@FXML
	private TextField firstName;
	@FXML
	private TextField lastName;
	@FXML
	private TextField UserName;
	@FXML
	private TextField email;
	@FXML
	private TextField confirmEmail;
	@FXML
	private TextField confirmPassword;
	@FXML
	private TextField password;
	@FXML
	private TextField creditcard;
	@FXML
	private RadioButton radbtn0;
	@FXML
	private RadioButton radbtn1;

	ToggleGroup x = new ToggleGroup();

	@FXML
	private Button btn0;
	@FXML
	private Button btn1;
	@FXML
	private Label lb1;
	@FXML
	private Label lb2;
	@FXML
	private Label lb3;
	@FXML
	private Button btnBack1;
	@FXML
	private Button btnBack2;
	@FXML
	private Label label01;
	@FXML
	private Label label02;
	@FXML
	private Button signupBtn;
	@FXML
	private TextField fromText;
	@FXML
	private TextField destText;
	@FXML
	private TextField numberOfTickets;
	@FXML
	private Button estimateTicketPrice;
	@FXML
	private Button buyTicket;
	@FXML
	private Label estimatefare;
	@FXML
	private Button seat1;
	@FXML
	private Button seat2;
	@FXML
	private Button seat3;
	@FXML
	private Button seat4;
	@FXML
	private Button seat5;
	@FXML
	private Button seat6;
	@FXML
	private Button seat7;
	@FXML
	private Button seat8;
	@FXML
	private Button seat9;
	@FXML
	private Button seat10;
	@FXML
	private Button seat11;
	@FXML
	private Button seat12;
	@FXML
	private Button seat13;
	@FXML
	private Button seat14;
	@FXML
	private Button seat15;
	@FXML
	private Button seat16;
	@FXML
	private Button seat17;
	@FXML
	private Button seat18;
	@FXML
	private Button seat19;
	@FXML
	private Button seat20;
	@FXML
	private Button seat21;
	@FXML
	private Button seat22;
	@FXML
	private Button seat23;
	@FXML
	private Button seat24;
	@FXML
	private Button seat25;
	@FXML
	private Button seat26;
	@FXML
	private Button seat27;
	@FXML
	private Button seat28;
	@FXML
	private Button seat29;
	@FXML
	private Button seat30;
	@FXML
	private ScrollBar verticalScrollbar;
	@FXML
	private ScrollBar horizontalSCrollbar;
	@FXML
	private Button yesReceipt;
	@FXML
	private Button noReceipt;
	@FXML
	private Button exitNoReceipt;
	@FXML
	private Button exitWithoutReceipt;
	@FXML
	private Button rateButton;
	@FXML
	private Button submitRating;
	@FXML
	private Button submitComment;
	@FXML
	private Button exitOnRating;
	@FXML
	private Button exitOnCommenting;
	@FXML
	private Button settings;
	@FXML
	private Button exitApp;
	@FXML
	private Button addNewAcoount;
	@FXML
	private Button loginFromDifferentAccount;
	@FXML
	private Button enter;
	@FXML
	private Label lll;
	@FXML
	private Button jdbc;

	ArrayList<String> cityChecker = new ArrayList<>();

	ArrayList<String> destCityChecker = new ArrayList<>();

	int r = (int) (Math.random() * (100 - 65) + 65);

	Connection myConn;

	Stage primaryStage;
	Stage primaryStage1;
	Stage primaryStage2;
	Stage primaryStage3;
	Stage primaryStage4;
	Stage primaryStage5;
	Stage primaryStage6;
	Stage primaryStage7;
	Stage primaryStage8;
	Stage primaryStageSettings;

	public void ExitWithoutReceipt(ActionEvent event) {
		if (exitWithoutReceipt.isArmed()) {
			System.exit(-1);
		}
	}

	// public void JDBC(ActionEvent event) {
	// if (jdbc.isArmed()) {
	//
	// PreparedStatement mystmt2 = null;
	// String insert = "INSERT INTO
	// `eyadnawar`.`users`(`first_name`,`last_name`,`Username`,`e-mail`,`password`,`creditcard`,`userscol`)Values"
	// + "('" + firstName.getText() + "','" + lastName.getText() + "','" +
	// UserName.getText() + "','"
	// + email.getText() + "','" + password.getText() + "','1','1');";
	// System.out.println(insert);
	// try {
	// myConn =
	// DriverManager.getConnection("jdbc:mysql://localhost:3306/eyadnawar",
	// "root", "select33");
	// // Statement mystmt = (Statement) myConn.createStatement();
	// // PreparedStatement ps = myConn.prepareStatement(insert);
	// // ps.setString(1, firstName.getText());
	// // ps.setString(2, lastName.getText());
	// // ps.setString(3, UserName.getText());
	// // ps.setString(4, email.getText());
	// // ps.setString(5, password.getText());
	// // ps.setInt(6, Integer.parseInt(creditcard.getText()));
	// // ps.setLong(1, Integer.parseInt(creditcard.getText()));
	// // ps.executeUpdate(insert);
	//
	// mystmt2 = myConn.prepareStatement(insert);
	// mystmt2.execute();
	//
	//
	// } catch (SQLException e) {
	// e.printStackTrace();
	// }
	// }
	// }

	public void AddNewAccount(ActionEvent event) throws IOException {
		if (addNewAcoount.isArmed()) {
			primaryStage2 = new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("main2.fxml"));
			Scene scene = new Scene(root, 1000, 900);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage2.setScene(scene);
			primaryStage2.show();
		}
	}

	public void LoginFromDifferentAccount(ActionEvent event) throws IOException {
		primaryStage1 = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("main1.fxml"));
		Scene scene = new Scene(root, 900, 900);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage1.setScene(scene);
		primaryStage1.show();
	}

	public void ExitApp(ActionEvent event) {
		if (exitApp.isArmed()) {
			System.exit(-1);
		}
	}

	/*
	 * public void enter(ActionEvent event) { if (enter.isArmed())
	 * lll.setTextFill(Color.BLUE); lll.setText("you booked " +
	 * Integer.parseInt(numberOfTickets.getText())); }
	 */

	public void Settings(ActionEvent event) throws IOException {
		if (settings.isArmed()) {
			primaryStageSettings = new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("mainSettings.fxml"));
			Scene scene = new Scene(root, 400, 700);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStageSettings.setScene(scene);
			primaryStageSettings.show();

		}
	}

	public void ExitOnRating(ActionEvent event) {
		if (exitOnRating.isArmed()) {
			System.exit(-1);
		}
	}

	public void ExitOnCommenting(ActionEvent event) {
		if (exitOnCommenting.isArmed()) {
			System.exit(-1);
		}
	}

	public void Rate(ActionEvent event) throws IOException {
		if (rateButton.isArmed()) {
			primaryStage8 = new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("main8.fxml"));
			Scene scene = new Scene(root, 1000, 1000);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage8.setScene(scene);
			primaryStage8.show();
		}
	}

	public void wantReceipt(ActionEvent event) throws IOException {
		if (yesReceipt.isArmed()) {
			String userHomeFolder = System.getProperty("user.home/Desktop");
			File textFile = new File(userHomeFolder, "AzureBusesReceipt.txt");
			try {
				PrintWriter writer = new PrintWriter("AzureBusesReceipt.txt", "UTF-8");
				writer.println("First Name : ");
				writer.println("Last  Name : ");
				writer.println("Mobile Number : ");
				writer.println("Trip From : ");
				writer.println("Trip To : ");
				writer.println("Trip Date : ");
				writer.println("Trip Time : ");
				writer.println("Ticket Price : ");
				writer.println("Number of Tickets : ");
				writer.println("Total price : ");
				writer.println("Number of seats : ");
				writer.println("Seat(s) number : ");
			} catch (IOException e) {
				primaryStage6 = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("main6.fxml"));
				Scene scene = new Scene(root, 800, 200);
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				primaryStage6.setScene(scene);
				primaryStage6.show();

			}
		} else {
			primaryStage7 = new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("main7.fxml"));
			Scene scene = new Scene(root, 800, 200);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage7.setScene(scene);
			primaryStage7.show();
		}

	}

	public void Countseats() {

	}

	public static int counter = 0;

	public void pickSeats() {

		int numberSeats = (Integer.parseInt(numberOfTickets.getText()));
		Button[] myButtons = new Button[] { seat1, seat2, seat3, seat4, seat5, seat6, seat7, seat8, seat9, seat10,
				seat11, seat12, seat13, seat14, seat15, seat16, seat17, seat18, seat19, seat20, seat21, seat22, seat23,
				seat24, seat25, seat26, seat27, seat28, seat29, seat30 };

		for (int i = 0; i < myButtons.length && counter < numberSeats; i++) {
			if (myButtons[i].isArmed()) {
				myButtons[i].setDisable(true);
				++counter;
			}
		}
	}

	public void ExitReceipt(ActionEvent event) {
		if (exitNoReceipt.isArmed()) {
			System.exit(-1);
		}
	}

	public void EstimateTicket(ActionEvent event) {
		if (estimateTicketPrice.isArmed() && fromDestValidity()) {
			estimatefare.setTextFill(Color.BLUE);
			estimatefare.setText("Your ticket is estimated to be : " + " $" + r);
		} else {
			estimatefare.setTextFill(Color.RED);
			estimatefare.setText("Please choose a valid city");
		}
	}

	public void BuyTicket(ActionEvent event) throws IOException {

		if (buyTicket.isArmed() && (Integer.parseInt(numberOfTickets.getText()) != 0)) {
			primaryStage5 = new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("main5.fxml"));
			Scene scene = new Scene(root, 1150, 200);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage5.setScene(scene);
			primaryStage5.show();

		}
	}

	public void intialize() {
		verticalScrollbar.setOrientation(Orientation.VERTICAL);
		verticalScrollbar.valueProperty().addListener(new ChangeListener<Number>() {

			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {

			}

		});
	}

	public boolean checkFromTripValidity() {
		if (cityChecker.contains(fromText.getText()))
			return true;
		else
			return false;

	}

	public boolean checkDestTripValidity() {
		if (destCityChecker.contains(destText.getText()))
			return true;
		else
			return false;
	}

	public boolean fromDestValidity() {
		if (checkFromTripValidity() && checkDestTripValidity() && (fromText.getText() != destText.getText()))
			return true;
		else
			return false;
	}

	public boolean newUser() {
		radbtn0.setToggleGroup(x);
		radbtn1.setToggleGroup(x);

		if (radbtn0.isSelected() && !radbtn1.isSelected()) {
			if (radbtn1.isSelected())
				radbtn0.disarm();
			label01.setTextFill(Color.BLUE);
			label01.setText("We are excited to have you on board!");
			return true;
		} else
			return false;
	}

	public boolean returningUser() {
		radbtn0.setToggleGroup(x);
		radbtn1.setToggleGroup(x);

		if (radbtn1.isSelected() && !radbtn0.isSelected()) {
			if (radbtn0.isSelected())
				radbtn1.disarm();
			label02.setTextFill(Color.BLUE);
			label02.setText("Welcome back!");
			return true;
		} else
			return false;
	}

	public void advance(ActionEvent event) throws IOException {
		if (returningUser() && !newUser()) {
			primaryStage1 = new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("main1.fxml"));
			Scene scene = new Scene(root, 900, 900);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage1.setScene(scene);
			primaryStage1.show();

		} else if (newUser() && !returningUser()) {
			primaryStage2 = new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("main2.fxml"));
			Scene scene = new Scene(root, 1000, 900);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage2.setScene(scene);
			primaryStage2.show();

		}

	}

	public void exit(ActionEvent event) {
		System.exit(-1);
	}

	public void login() throws IOException, SQLException {
		String insert = "insert into users" + "(first_name, last_name, Username, e-mail, password, creditcard)"
				+ "vlaues(firstName.getText(), lastName.getText(), UserName.getText(), email.getText(), password.getText(), Integer.parseInt(creditcard.getText()))";

		myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/eyadnawar", "root", "select33");
		Statement mystmt = (Statement) myConn.createStatement();
		ResultSet myRs = ((java.sql.Statement) mystmt).executeQuery("select * from table1");

		if (tf1.getText().equals("muhammed") && tf2.getText().equals("essa")) {
			lb4.setTextFill(Color.BLUE);
			lb4.setText("You have Successfully logged in");

			primaryStage4 = new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("main4.fxml"));
			Scene scene = new Scene(root, 1075, 1000);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage4.setScene(scene);
			primaryStage4.show();

		} else {
			lb4.setTextFill(Color.RED);
			lb4.setText("Failed... Please try again");
		}
	}

	public void Back() throws IOException {
		if (btnBack1.isArmed()) {
			primaryStage = new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("main0.fxml"));
			Scene scene = new Scene(root, 900, 900);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		}

	}

	public void Back2() throws IOException {
		if (btnBack2.isArmed()) {
			primaryStage = new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("main0.fxml"));
			Scene scene = new Scene(root, 900, 900);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		}
	}

	public void signUp() throws IOException {
		if (signupBtn.isArmed()) {
			// if (!email.getText().isEmpty() &&
			// !confirmEmail.getText().isEmpty()
			// && email.getText().equals(confirmEmail.getText()) &&
			// !password.getText().isEmpty()
			// && !confirmPassword.getText().isEmpty() &&
			// password.getText().equals(confirmPassword.getText())
			// && !UserName.getText().isEmpty() &&
			// !creditcard.getText().isEmpty()) {

			PreparedStatement mystmt2 = null;
			// String insert = "INSERT INTO
			// `eyadnawar`.`users`(`first_name`,`last_name`,`Username`,`e-mail`,`password`,`creditcard`,`userscol`)Values"
			// + "('" + firstName.getText() + "','" + lastName.getText() + "','"
			// + UserName.getText() + "','"
			// + email.getText() + "','" + password.getText() + "','" +
			// Integer.parseInt(creditcard.getText())
			// + "','1');";

			String insert = "INSERT INTO`eyadnawar`.`usersquiz`(`email`,`password`,`Username`) Values" + "('" + "fady"
					+ "','" + "fady" + "','" + "fady" + "');";

			// System.out.println(insert);
			try {
				myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/eyadnawar", "root", "select33");
				mystmt2 = myConn.prepareStatement(insert);
				mystmt2.execute();

			} catch (SQLException e) {
				e.printStackTrace();
			}
			// }
		}
		primaryStage4 = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("main4.fxml"));
		Scene scene = new Scene(root, 1075, 1000);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage4.setScene(scene);
		primaryStage4.show();
	}
}
