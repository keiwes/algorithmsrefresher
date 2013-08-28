package com.wesleyreisz.samples.kata.stringpermutation;

import java.util.ArrayList;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest {

	public void test() {
		String s = "ABC";
		ArrayList<String> value = StringUtil.permutationFinder(s);
		System.out.println("\nThe Permutations are : \n" + value);
	}
	
	@Test
	public void testSecond(){
		String s = "ABCDE";
		/*Assert.assertEquals(
			StringUtil.permutationFinder(s),
			StringUtil2.perm1(s)
		);*/
		StringUtil2.perm1(s);
	}
}
