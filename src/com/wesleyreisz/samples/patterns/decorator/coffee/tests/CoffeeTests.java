package com.wesleyreisz.samples.patterns.decorator.coffee.tests;

import junit.framework.Assert;
import junit.framework.TestCase;

import com.wesleyreisz.samples.patterns.decoractor.coffee.Size;
import com.wesleyreisz.samples.patterns.decorator.coffee.beverages.Beverage;
import com.wesleyreisz.samples.patterns.decorator.coffee.beverages.GroovingGoat;
import com.wesleyreisz.samples.patterns.decorator.coffee.beverages.HotChocolate;
import com.wesleyreisz.samples.patterns.decorator.coffee.condiments.Expresso;
import com.wesleyreisz.samples.patterns.decorator.coffee.condiments.Milk;
import com.wesleyreisz.samples.patterns.decorator.coffee.condiments.Mocha;

public class CoffeeTests extends TestCase {
	public void testWes(){
		Beverage wesSpecial = new Mocha(new Expresso(new Expresso(new Expresso(new HotChocolate(Size.VENTI)))));
		Assert.assertEquals(wesSpecial.cost(), 3.95);
	}
	public void testJims(){
		Beverage jimSpecial = new Milk(new Expresso(new Expresso(new GroovingGoat(Size.VENTI))));
		Assert.assertEquals(jimSpecial.cost(), 3.85);
	}
	public void testGeoff(){
		Beverage jimSpecial =new Expresso(new Expresso(new GroovingGoat(Size.VENTI)));
		Assert.assertEquals(jimSpecial.cost(), 3.75);
	}
}
