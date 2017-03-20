package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

//import java.beans.Statement;

import java.sql.Statement;
import java.util.ArrayList;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {

		ArrayList<String> cityChecker = new ArrayList<String>();
		cityChecker.add("New York, New York");
		cityChecker.add("Florida, Miami");
		cityChecker.add("Los Angeles, California");
		cityChecker.add("San Fransisco, California");
		cityChecker.add("Palo Alto, California");
		cityChecker.add("San Jose, California");
		cityChecker.add("Brooklyn, New York");
		cityChecker.add("Boston, Massachusetts");
		cityChecker.add("Louisvelle, Kentucky");
		cityChecker.add("Philadelphia, Pennsylvania");
		cityChecker.add("Providence, Rhode Island");
		cityChecker.add("New York City, New Jersey");
		cityChecker.add("Chicago, Illinois");
		cityChecker.add("Washington D.C, Maryland");
		cityChecker.add("Pittsburgh, Pennsylvania");
		cityChecker.add("Dallas, Texas");
		cityChecker.add("San Antonio, Texas");
		cityChecker.add("Buffalo, New York");
		cityChecker.add("Portland, Oregon");
		cityChecker.add("Detroit, Michigan");
		cityChecker.add("Cleveland, Ohio");
		cityChecker.add("Honolulu, Hawaii");

		ArrayList<String> destCityChecker = new ArrayList<>();
		destCityChecker.add("New York, New York");
		destCityChecker.add("Florida, Miami");
		destCityChecker.add("Los Angeles, California");
		destCityChecker.add("San Fransisco, California");
		destCityChecker.add("Palo Alto, California");
		destCityChecker.add("San Jose, California");
		destCityChecker.add("Brooklyn, New York");
		destCityChecker.add("Boston, Massachusetts");
		destCityChecker.add("Louisvelle, Kentucky");
		destCityChecker.add("Philadelphia, Pennsylvania");
		destCityChecker.add("Providence, Rhode Island");
		destCityChecker.add("New York City, New Jersey");
		destCityChecker.add("Chicago, Illinois");
		destCityChecker.add("Washington D.C, Maryland");
		destCityChecker.add("Pittsburgh, Pennsylvania");
		destCityChecker.add("Dallas, Texas");
		destCityChecker.add("San Antonio, Texas");
		destCityChecker.add("Buffalo, New York");
		destCityChecker.add("Portland, Oregon");
		destCityChecker.add("Detroit, Michigan");
		destCityChecker.add("Cleveland, Ohio");
		destCityChecker.add("Honolulu, Hawaii");
		destCityChecker.add("New York, New York");

		try {
			Parent root = FXMLLoader.load(getClass().getResource("main0.fxml"));
			Scene scene = new Scene(root, 900, 900);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		// ArrayList<String> cityChecker = new ArrayList<String>();
		// cityChecker.add("New York, New York");
		// cityChecker.add("Florida, Miami");
		// cityChecker.add("Los Angeles, California");
		// cityChecker.add("San Fransisco, California");
		// cityChecker.add("Palo Alto, California");
		// cityChecker.add("San Jose, California");
		// cityChecker.add("Brooklyn, New York");
		// cityChecker.add("Boston, Massachusetts");
		// cityChecker.add("Louisvelle, Kentucky");
		// cityChecker.add("Philadelphia, Pennsylvania");
		// cityChecker.add("Providence, Rhode Island");
		// cityChecker.add("New York City, New Jersey");
		// cityChecker.add("Chicago, Illinois");
		// cityChecker.add("Washington D.C, Maryland");
		// cityChecker.add("Pittsburgh, Pennsylvania");
		// cityChecker.add("Dallas, Texas");
		// cityChecker.add("San Antonio, Texas");
		// cityChecker.add("Buffalo, New York");
		// cityChecker.add("Portland, Oregon");
		// cityChecker.add("Detroit, Michigan");
		// cityChecker.add("Cleveland, Ohio");
		// cityChecker.add("Honolulu, Hawaii");

		// ArrayList<String> destCityChecker = new ArrayList<>();
		// destCityChecker.add("New York, New York");
		// destCityChecker.add("Florida, Miami");
		// destCityChecker.add("Los Angeles, California");
		// destCityChecker.add("San Fransisco, California");
		// destCityChecker.add("Palo Alto, California");
		// destCityChecker.add("San Jose, California");
		// destCityChecker.add("Brooklyn, New York");
		// destCityChecker.add("Boston, Massachusetts");
		// destCityChecker.add("Louisvelle, Kentucky");
		// destCityChecker.add("Philadelphia, Pennsylvania");
		// destCityChecker.add("Providence, Rhode Island");
		// destCityChecker.add("New York City, New Jersey");
		// destCityChecker.add("Chicago, Illinois");
		// destCityChecker.add("Washington D.C, Maryland");
		// destCityChecker.add("Pittsburgh, Pennsylvania");
		// destCityChecker.add("Dallas, Texas");
		// destCityChecker.add("San Antonio, Texas");
		// destCityChecker.add("Buffalo, New York");
		// destCityChecker.add("Portland, Oregon");
		// destCityChecker.add("Detroit, Michigan");
		// destCityChecker.add("Cleveland, Ohio");
		// destCityChecker.add("Honolulu, Hawaii");
		// destCityChecker.add("New York, New York");

		int quacom;
		String[] array = new String[2];
		Connection myConn;
		try {

			myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/eyadnawar", "root", "select33");
			Statement mystmt = (Statement) myConn.createStatement();
			ResultSet myRs = ((java.sql.Statement) mystmt).executeQuery("select * from users");
			while (myRs.next()) {
				// array[0] = myRs.getString("FirstName");
				// array[1] = myRs.getString("LastName");
				// System.out.println(myRs.getString("FirstName") + "," +
				// myRs.getString("LastName"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		launch(args);
	}

	public void Bring() {

	}
}
