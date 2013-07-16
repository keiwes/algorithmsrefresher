package com.wesleyreisz.samples.linkedlist.doubly;

import static org.junit.Assert.*;

import org.junit.Test;

public class DemoLinkedListTest {

	@Test
	public void testLinkedlist() {
		DemoLinkedList list = new DemoLinkedList();
		list.add("honey");
		list.add("ruby");
		list.add("echo");
		list.add("cosmo");
		assertEquals("honey ruby echo cosmo ", list.print());
		assertEquals("honey ruby echo cosmo ", list.print(SortOrder.FORWARD));
		assertEquals("cosmo echo ruby honey ", list.print(SortOrder.BACKWARD));
	}

}
