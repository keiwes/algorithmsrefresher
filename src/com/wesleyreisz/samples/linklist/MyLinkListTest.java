package com.wesleyreisz.samples.linklist;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyLinkListTest {

	@Test
	public void test() {
		MyLinkList list = new MyLinkList();
		list.add("honey");
		list.add("ruby");
		list.add("spenser");
		list.add("echo");
		list.add("cosmo");
		
		assertEquals("cosmo echo spenser ruby honey ", list.print());
		
		
	}

}
