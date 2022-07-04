package jUnitAs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Qus_13Test {

	@Test
	void testAdd() 
	{
		assertEquals(20, Qus_13.addition());
	}
	@Test
	void testSubstraction()
	{
		assertEquals(20, Qus_13.substraction());
	}
	@Test
	void testMultiplication()
	{
		assertEquals(25, Qus_13.multiplication());
	}
	

	
	@Test
	void testSquareRoot()
	{
		assertEquals(4, Qus_13.squareroot());
	}
	
	@Test
	void testCubeRoot()
	{
		assertEquals(4, Qus_13.cuberoot());
	}
	
	@Test
	void testModeulus()
	{
		assertEquals(4, Qus_13.modulus());
	}
	
	@Test
	public void testPower()
	{
		System.out.println("power ");
		assertEquals(4, Qus_13.power());
	}
	
	@Test
	void testDivision()
	{
		System.out.println("Divison");
		assertEquals(25, Qus_13.divison());	   
	}

}
