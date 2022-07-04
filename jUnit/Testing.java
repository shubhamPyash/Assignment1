package jUnitAs;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class Testing {
//
////	@Test
////	void test7() 
////	{
////		assertEquals("palindrome",Qus_7.checkPrimeorNot());
////	}
	
//	@Test
//	void test3()
//	{
//		assertTrue(true);
//	}
	
//	@Test
//	void test2()
//	{
//		assertEquals(true,Qus_2.pali_drom());
//	}

//	@Test
//	void test8()
//	{
//		assertEquals(4, Qus_8.even());
//		assertEquals(1,Qus_8.odd());
//	}
	
//	@Test
//	void test1() {
//		assertEquals(4,Qus_1.hicF(16,12));
//	}

//	@Test
//	void test4()
//	{
//		assertEquals("armstrong no", Qus_4.arms());
//	}
	
//	@Test
//	void test6()
//	{
//		assertEquals(3,Qus_6.vowels() );
//	}
	
//	@Test
//	void test5()
//	{
//		assertEquals(35,Qus_5.payth());
//	}
	
//	@Test
//	void test10()
//	{
//		assertEquals("apple-orange-banana-lemon",Qus_10.concat());
//	}
	
		@Test
	void test12() throws CloneNotSupportedException
	{

		Qus_12 s1=new  Qus_12(5151, "shuabham");
		Qus_12 s2=(Qus_12)s1.clone();
		assertEquals(true,Qus_12.method(s1, s2));
	}
	
	
}
