package com.wesleyreisz.samples.linkedlist.forward;

import junit.framework.Assert;

import org.junit.Test;

public class MyLinkListTest {

	@Test
	public void test() {
		MyLinkList list = new MyLinkList();
		list.add("wes");
		list.add("justin");
		list.add("kim");
		list.add("tyler");
		list.add("leanne");
		
		//Assert.assertEquals("leanne tyler kim justin wes ", list.print());
		Assert.assertEquals("wes justin kim tyler leanne ", list.print());
	}
}
