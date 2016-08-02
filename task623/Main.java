package net.ukr.p454.task623;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input number: ");
		String string = scanner.nextLine();
		scanner.close();
		System.out.println("Min repeat number:" + getRepeatNumber(string));
	}
	
	static String getRepeatNumber(String string) {
		
		String part1 = "";
		String part2 = "";
		String min = "";
		for (int i = string.length()/2; i > 0; i--) {
			part1 = string.substring(0,i);
			part2 = string.substring(i, i*2);
			
			if (part1.equals(part2)) {
				min = part1;
			}
		}
		return min;
	}
}
