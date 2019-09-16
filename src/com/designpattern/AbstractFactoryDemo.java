package com.designpattern;

import java.util.Set;
import org.reflections.Reflections;

interface IHotDrink {

	void consume();
}

class Tea implements IHotDrink{

	public void consume() {
		System.out.println("Tea is very Tasty");
	}
}

class Coffee implements IHotDrink{
	
	public void consume() {
		System.out.println("Coffee is very Tasty");
	}
}

interface IHotDrinkFactory{

	IHotDrink prepare(int amount);
}

class TeaFactory implements IHotDrinkFactory{

	public IHotDrink prepare(int amount) {
		System.out.println(
			      "Put in tea bag, boil water, pour "
			      + amount + "ml, add lemon, enjoy!"
			    );
		return new Tea();
	}
}

class CoffeeFactory implements IHotDrinkFactory{

	public IHotDrink prepare(int amount) {
		 System.out.println(
			      "Grind some beans, boil water, pour "
			      + amount + " ml, add cream and sugar, enjoy!"
			    );
	    return new Coffee();
	}
}

class AbstractFactoryDemo{
	
	public static void main(String[] args) throws Exception {
		
		Set<Class<? extends IHotDrinkFactory>> types = new Reflections("com.designpattern").getSubTypesOf(IHotDrinkFactory.class);
		
		for(Class<? extends IHotDrinkFactory> type: types) {
			System.out.println(type.getSimpleName());
			System.out.println(((IHotDrinkFactory)type.getDeclaredConstructor().newInstance()).prepare(10));
		}
	}
}