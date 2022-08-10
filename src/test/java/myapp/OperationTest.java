package myapp;

import static org.junit.Assert.*;

import org.junit.Test;

import com.itc.main.Operation;

public class OperationTest {

	@Test
	public void testAddForNegativeValues() {
		Operation op=new Operation();
		int res = op.add(-10, -10);
		assertEquals(-1, res);
		System.out.println("##SUCCESS## 100 MARKS");
	}
	
	@Test
	public void testAddForZeroValue() {
		Operation op=new Operation();
		int res = op.add(0, 0);
		assertEquals(-2, res);
		System.out.println("##SUCCESS## 100 MARKS");
	}
	
	@Test
	public void testAdd() {
		Operation op= new Operation();
		int res = op.add(10, 20);
		assertEquals(30,res);
		System.out.println("##SUCCESS## 100 MARKS");
	}

}
