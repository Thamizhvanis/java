package java1;

import org.testng.annotations.Test;

public class sample1 {

	@Test
	public static void method1() {
		System.out.print("This is method1\n");

	}

	@Test
	public static void method2() {
		System.out.print("This is method2\n");

	}

	public static void main(String[] args) {

		System.out.print("This is sample java code\n");
		method1();
		method2();

	}

}
