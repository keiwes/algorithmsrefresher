package com.wesleyreisz.samples.linklist.test;

import java.util.*;

import org.junit.Assert;
import org.junit.Test;

public class MyNodeListTest {
	@Test public void checkAddMethodTest(){
		List<String> list = new LinkedList<String>();
		list.add("wes");
		list.add("steve");
		list.add("mike");
		Assert.assertEquals("wes steve mike ",StringUtils.printList(list));
		Collections.sort(list);
		Assert.assertEquals("mike steve wes ", StringUtils.printList(list));
		Collections.reverse(list);
		Assert.assertEquals("wes steve mike ", StringUtils.printList(list));
	}
}
