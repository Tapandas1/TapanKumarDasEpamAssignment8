package tapan;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class removeATest {

	
	SampleClass sampleClass;
	@BeforeEach
	void setUp()
	{
		sampleClass = new SampleClass();
	}
	@org.junit.jupiter.api.Test
	void test2CharsAA() {
		assertEquals("",sampleClass.checker("AA"));
	}
	@org.junit.jupiter.api.Test
	void test2CharsA() {
		assertEquals("B",sampleClass.checker("AB"));
	}
	@Test
	void test2CharsNull() {
		assertEquals("",sampleClass.checker(""));
	}
	@Test
	void test3Chars2A() {
		assertEquals("B",sampleClass.checker("AAB"));
	}
	@Test
	void test2Chars1A() {
		assertEquals("BA",sampleClass.checker("ABA"));
	}
	@Test
	void testnChars2A() {
		assertEquals("CD",sampleClass.checker("AACD"));
	}
	@Test
	void testnChars2A1() {
		assertEquals("BCD",sampleClass.checker("ABCD"));
	}
	@Test
	void testnChars2A2() {
		assertEquals("BCD",sampleClass.checker("BACD"));
	}
	@Test
	void testnChars2A3() {
		assertEquals("BAA",sampleClass.checker("AABAA"));
	}
	@Test
	void test1CharsAA() {
		assertEquals("",sampleClass.checker("A"));
	}
	@Test
	void test1Chars() {
		assertEquals("B",sampleClass.checker("B"));
	}
	@Test
	void testnChars() {
		assertEquals("BCDE",sampleClass.checker("BCDE"));
	}
	@Test
	void testnChars1() {
		assertEquals("BACDE",sampleClass.checker("BAACDE"));
	}
	

}
