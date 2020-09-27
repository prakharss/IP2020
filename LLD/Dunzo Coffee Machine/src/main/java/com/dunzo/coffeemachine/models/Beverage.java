package com.dunzo.coffeemachine.models;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Beverage {
	//List<Ingredient> ingredients;
	ConcurrentHashMap<String, Integer>  ingredient;
}
