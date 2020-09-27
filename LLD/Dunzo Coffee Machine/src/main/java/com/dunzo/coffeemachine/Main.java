package com.dunzo.coffeemachine;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Main extends Thread {
	static int orderInProgress;
	static int orderCount;

	public static void main(String[] args) {
		InputStream is = Main.class.getResourceAsStream("/coffee-machine.json");
		JSONParser parser = new JSONParser();
		try {
			Reader targetReader = new InputStreamReader(is);
			Object obj = parser.parse(targetReader);

			// Given Input
			JSONObject coffeeMachine = (JSONObject) ((JSONObject) obj).get("machine");
			JSONObject outlet = (JSONObject) coffeeMachine.get("outlets");
			JSONObject ingredientAvailable = (JSONObject) coffeeMachine.get("total_items_quantity");
			JSONObject beverages = (JSONObject) coffeeMachine.get("beverages");

			long numberOfOutlets = (long) outlet.get("count_n");
			long totalOrders = beverages.size();
			
			orderInProgress = 0;
			orderCount = 0;

			while (orderCount < totalOrders) {
				if (orderInProgress < numberOfOutlets) {
					orderCount++;
					orderInProgress++;
					new Main().start();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void run() {
		// service make beverage
		System.out.println(orderInProgress);
		orderInProgress--;
	}
}
