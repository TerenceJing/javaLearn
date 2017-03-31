package com.hdu.terence.util;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculateTest {
	@Test
	public void testAdd()
	{
		assertEquals(5,new Calculate().add(2, 3));
	}
	@Test
	public void testSubstract()
	{
		assertEquals(6,new Calculate().substract(2, 3));
	}
	@Test
	public void testMultiply()
	{
		assertEquals(6,new Calculate().multiply(2, 3));
	}
	@Test
	public void testDivide()
	{
		assertEquals(2,new Calculate().divide(8, 4));
	}
}

