package com.wesleyreisz.samples.linklist;

import junit.framework.Assert;

import org.junit.Test;

public class NodeListTest {

	@Test
	public void test() {
		NodeList list = new NodeList();
		list.add("honey");
		list.add("ruby");
		list.add("echo");
		list.add("cosmo");
		
		Assert.assertEquals("honey ruby echo cosmo ", list.print());
		Assert.assertEquals("cosmo echo ruby honey ", list.print(SortOrder.REVERSE));
	}

}
