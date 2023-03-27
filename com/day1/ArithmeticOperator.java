package com.day1;

public class ArithmeticOperator {
	public static void main (String[]args) {
		int num1 = 15;
		int num2 = 20;
		float num3 = 15.5f;
		float num4 = 20.3f;
		int add =num1 + num2;
		int sub =num1 - num2;
		int mul =num1 * num2;
		int div =num1 / num2;
		int mod =num1 % num2;
		System.out.println(add);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);
		System.out.println(mod);
		System.out.println("End of line 1");
		
		float add2 =num3 + num4;
		float sub2 =num3 - num4;
		float mul2=num3 * num4;
		float div2=num3 / num4;
		float mod2 =num3 % num4;
		System.out.println(add2);
		System.out.println(sub2);
		System.out.println(mul2);
		System.out.println(div2);
		System.out.println(mod2);
		System.out.println("End of line 2");
		
		boolean numberA = num1 < num2;
		boolean numberB = num1 > num2;
		boolean numberC = num1 <= num2;
		boolean numberD = num1 >= num2;
		boolean numberE = num1 != num2;
		boolean numberF = num1 == num2;
		System.out.println(numberA);
		System.out.println(numberB);
		System.out.println(numberC);
		System.out.println(numberD);
		System.out.println(numberE);
		System.out.println(numberF);
		System.out.println("End of line 3");
		
		boolean number4 = num3 < num4;
		boolean number5 = num3 > num4;
		boolean number6 = num3 == num4;
		System.out.println(number4);
		System.out.println(number5);
		System.out.println(number6);
		System.out.println("End of line 4");
	}

}
