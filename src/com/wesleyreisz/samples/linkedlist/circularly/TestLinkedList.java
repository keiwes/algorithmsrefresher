package com.wesleyreisz.samples.linkedlist.circularly;

import java.util.LinkedList;
import java.util.List;

public class TestLinkedList {
	/* 
	 * Explanation: LinkedList implements the List interface. it, however, uses a doubly-linked
	 * list. This means that object insertions are O(1), but get's are O(N) at least in the worst
	 * case.
	 * 
	 * Detailed Explanation:
	 * LinkedList and ArrayList are two different implementations of the List interface. LinkedList implements it with a doubly-linked list. ArrayList implements it with a dynamically resizing array.

		As with standard linked list and array operations, the various methods will have different algorithmic runtimes.
		
		For LinkedList
		
		get is O(n)
		add is O(1)
		remove is O(n)
		Iterator.remove is O(1)
		For ArrayList
		
		get is O(1)
		add is O(1) amortized, but O(n) worst-case since the array must be resized and copied
		remove is O(n)
		LinkedList allows for constant-time insertions or removals, but only sequential access of elements. In other words, you can walk the list forwards or backwards, but grabbing an element in the middle takes time proportional to the size of the list.
		
		ArrayLists, on the other hand, allow random access, so you can grab any element in constant time. But adding or removing from anywhere but the end requires shifting all the latter elements over, either to make an opening or fill the gap. Also, if you add more elements than the capacity of the underlying array, a new array (twice the size) is allocated, and the old array is copied to the new one, so adding to an ArrayList is O(n) in the worst case but constant on average.
		
		So depending on the operations you intend to do, you should choose the implementations accordingly. Iterating over either kind of List is practically equally cheap. (Iterating over an ArrayList is technically faster, but unless you're doing something really performance-sensitive, you shouldn't worry about this -- they're both constants.)
		
		Also, if you have large lists, keep in mind that memory usage is also different. Each element of a LinkedList has more overhead since pointers to the next and previous elements are also stored. ArrayLists don't have this overhead. However, ArrayLists take up as much memory as is allocated for the capacity, regardless of whether elements have actually been added.
		
		The default initial capacity of an ArrayList is pretty small (10 from Java 1.4 - 6). But since the underlying implementation is an array, the array must be resized if you add a lot of elements. To avoid the high cost of resizing when you know you're going to add a lot of elements, construct the ArrayList with a higher initial capacity.
		
		It's worth noting that Vector also implements the List interface and is almost identical to ArrayList. The difference is that Vector is synchronized, so it is thread-safe. Because of this, it is also slightly slower than ArrayList. So as far as I understand, most Java programmers avoid Vector in favor of ArrayList since they will probably synchronize explicitly anyway if they care about that.
	*/

	public static void main(String[] args) {
		List<String> names = new LinkedList<String>();
		for (int i=0; i<1000; i++){
			String name = "Name" + Math.random() *1000;
			names.add(name);
		}
		
		for(String name : names){
			System.out.println("Value: " + name);
		}
	}
}
