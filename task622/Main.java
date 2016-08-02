package net.ukr.p454.task622;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.print("Input first number:");
		int number1 = scanner.nextInt();

		System.out.print("Input second number:");
		int number2 = scanner.nextInt();

		getDistByHaming(getBinaryNumber(number1), getBinaryNumber(number2));

	}

	static String getBinaryNumber(int number) {
		StringBuilder sBuilder = new StringBuilder();
		String str = "";
		int resultDivision = number;

		while (resultDivision != 0) {
			if (resultDivision % 2 == 1) {
				sBuilder.insert(0, 1);
			} else {
				sBuilder.insert(0, 0);
			}

			resultDivision = resultDivision / 2;
		}
		str = str.format("%8s", sBuilder.toString());
		str = str.replace(' ', '0');
		return str;

	}

	static void getDistByHaming(String number1, String number2) {
		char[] arrayNum1 = number1.toCharArray();
		char[] arrayNum2 = number2.toCharArray();

		int distance = 0;
		for (int i = 0; i < arrayNum1.length; i++) {
			if (arrayNum1[i] != arrayNum2[i]) {
				distance++;
			}
		}

		System.out.println("Distance of Haming is: " + distance);
	}

}
