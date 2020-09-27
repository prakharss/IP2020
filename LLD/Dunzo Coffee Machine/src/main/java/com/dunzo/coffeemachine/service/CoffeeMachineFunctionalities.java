package com.dunzo.coffeemachine.service;

import com.dunzo.coffeemachine.models.Beverage;
import com.dunzo.coffeemachine.models.CoffeeMachine;

public interface CoffeeMachineFunctionalities {
	public void makeBeverage(Beverage beverage,CoffeeMachine machine);
}
