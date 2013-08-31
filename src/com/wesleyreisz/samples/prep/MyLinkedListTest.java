package com.wesleyreisz.samples.prep;

import junit.framework.Assert;

import org.junit.Test;
 
public class MyLinkedListTest {
	@Test
	public void testList(){
		MyLinkedList list = new MyLinkedList();
		list.add("Wes");
		list.add("Kim");
		list.add("Justin");
		list.add("Leanne");
		list.add("Tyler");
		Assert.assertEquals("Wes Kim Justin Leanne Tyler ",list.print());
	}
	
	@Test
	public void testListRecursion(){
		MyLinkedList list = new MyLinkedList();
		list.add("Wes");
		list.add("Kim");
		list.add("Justin");
		list.add("Leanne");
		list.add("Tyler");
		Assert.assertEquals(list.print(),list.printRecursive());
	}
}
