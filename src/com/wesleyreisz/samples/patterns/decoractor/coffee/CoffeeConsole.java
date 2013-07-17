package com.wesleyreisz.samples.patterns.decoractor.coffee;

import com.wesleyreisz.samples.patterns.decorator.coffee.beverages.Beverage;
import com.wesleyreisz.samples.patterns.decorator.coffee.beverages.GroovingGoat;
import com.wesleyreisz.samples.patterns.decorator.coffee.beverages.HotChocolate;
import com.wesleyreisz.samples.patterns.decorator.coffee.beverages.HouseBlend;
import com.wesleyreisz.samples.patterns.decorator.coffee.condiments.Caramel;
import com.wesleyreisz.samples.patterns.decorator.coffee.condiments.Expresso;
import com.wesleyreisz.samples.patterns.decorator.coffee.condiments.Milk;
import com.wesleyreisz.samples.patterns.decorator.coffee.condiments.Mocha;
import com.wesleyreisz.samples.patterns.decorator.coffee.condiments.Soy;

public class CoffeeConsole {
	public static void main(String[] args){
		System.out.println("Welcome to KFB Coffee");
		Beverage kimSpecial = new HouseBlend(Size.GRANDE);
		kimSpecial = new Soy(kimSpecial);
		kimSpecial = new Expresso(kimSpecial);
		kimSpecial = new Caramel(kimSpecial);
		
		Beverage wesSpecial = new Mocha(new Expresso(new Expresso(new Expresso(new HotChocolate(Size.VENTI)))));
		Beverage jimSpecial = new Milk(new Expresso(new GroovingGoat(Size.VENTI)));
		Beverage geoffSpecial = new Expresso(new Expresso(new GroovingGoat(Size.VENTI)));
		
		System.out.println("Kim's Special\nDescription: " + kimSpecial.getDescription() + " \nCost: " + kimSpecial.cost());
		
		System.out.println("Wes' Special\nDescription: " + wesSpecial.getDescription() + " \nCost: " + wesSpecial.cost());
		System.out.println("Jim's Special\nDescription: " + jimSpecial.getDescription() + " \nCost: " + jimSpecial.cost());
		System.out.println("Geoff's Special\nDescription: " + geoffSpecial.getDescription() + " \nCost: " + geoffSpecial.cost());
	}
}
