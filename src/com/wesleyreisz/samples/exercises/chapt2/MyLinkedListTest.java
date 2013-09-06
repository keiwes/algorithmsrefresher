package com.wesleyreisz.samples.exercises.chapt2;

import org.junit.Test;

import junit.framework.Assert;

public class MyLinkedListTest {
	@Test
	public void testLinkedList(){
		MyLinkedList list = new MyLinkedList();
		list.add("wes");
		list.add("kim");
		list.add("leanne");
		list.add("justin");
		list.add("tyler");
		Assert.assertEquals("wes kim leanne justin tyler ",list.print());
		
		list.remove("leanne");
		Assert.assertEquals("wes kim justin tyler ",list.print());
		
		list.remove("wes");
		Assert.assertEquals("kim justin tyler ",list.print());
		
		list.remove("tyler");
		Assert.assertEquals("kim justin ",list.print());
		
		list.add("leanne");
		Assert.assertEquals("kim justin leanne",list.print());
		
	}
}
