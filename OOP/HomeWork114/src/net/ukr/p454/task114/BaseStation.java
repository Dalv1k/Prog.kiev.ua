package net.ukr.p454.task114;

import java.util.Arrays;
import java.util.Scanner;

class BaseStation {

	// Inner numbers. One board has 24 numbers
	private int[] numberPlan = new int[24];
	// fixed number of subscribers
	private int[] fixedNumbers = new int[numberPlan.length];
	// Amount internal connects which PBX can do on the same time
	private int amountInternalConnect;
	// transcript of a busy line. Example 101 with 102
	private String[] currentConnects;
	// registered numbers
	private int[] registeredNumbers = new int[numberPlan.length];

	Scanner scanner = new Scanner(System.in);

	BaseStation(int amountInternalConnect) {
		super();
		this.amountInternalConnect = amountInternalConnect;
		this.currentConnects = new String[amountInternalConnect];
	}

	BaseStation() {
		super();
	}

	public int getAmountInternalConnect() {
		return amountInternalConnect;
	}

	public void setAmountInternalConnect(int amountInternalConnect) {
		this.amountInternalConnect = amountInternalConnect;
	}

	@Override
	public String toString() {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append(
				"Number plan PBX is range between " + numberPlan[0] + " and " + numberPlan[numberPlan.length - 1]);
		stringBuffer.append(System.lineSeparator());
		stringBuffer.append("Amount internal connects:" + amountInternalConnect);
		return stringBuffer.toString();
	}

	String getStats() {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append(
				"Amount busy lines:" + calcBusyLines() + "; free lines:" + (amountInternalConnect - calcBusyLines()));
		return stringBuffer.toString();
	}

	private int calcBusyLines() {
		int busyLines = 0;
		for (String s : currentConnects) {
			if (!s.isEmpty()) {
				busyLines++;
			}
		}
		return busyLines;
	}

	public void setNumberPlan() {
		System.out.println("You have to configure your PBX. Input number plan");
		System.out.print("Input start number:");
		numberPlan[0] = scanner.nextInt();

		for (int i = 1; i < numberPlan.length; i++) {
			;
			numberPlan[i] = numberPlan[0] + i;
		}
		System.out.println(
				"Number plan PBX is range between " + numberPlan[0] + " and " + numberPlan[numberPlan.length - 1]);

	}

	public int getNextNumber() {

		Arrays.sort(fixedNumbers);

		int minPosition = Arrays.binarySearch(fixedNumbers, 0);

		int nextNumber = -1;

		if (minPosition > 0) {
			for (int i = 0; i < numberPlan.length; i++) {
				// If element of array wasn't found than metod returns negative
				// number: length of array - 1
				if (Arrays.binarySearch(fixedNumbers, numberPlan[i]) == (0 - numberPlan.length - 1)) {
					nextNumber = numberPlan[i];
					fixedNumbers[minPosition] = numberPlan[i];
					break;
				}
			}
		} else {
			System.err.println("You have not free number!");
		}
		return nextNumber;
	}

	public void registerNumber(Phone phone) {
		int extNumber = phone.getExtNumber().getExtNumber();
		if (!checkRegisterNumber(extNumber)) {
			for (int i = 0; i < registeredNumbers.length; i++) {
				if (registeredNumbers[i] == 0) {
					registeredNumbers[i] = extNumber;
					System.out.println("Numer " + extNumber + " was registered in system");
					break;
				}
			}
		} else {
			System.err.println("The number " + phone.getExtNumber().getExtNumber() + " was registered earlier");
		}
	}

	public void commutation(int callerNumber, int dialNumber) {

	/*	if (checkNumber(dialNumber)&&(checkBusyNumber(dialNumber))) {
			System.out.println("din");
		}*/
		checkBusyNumber(dialNumber);
	}

	private boolean checkRegisterNumber(int number) {
		boolean check = false;
		for (int i = 0; i < registeredNumbers.length; i++) {
			if (registeredNumbers[i] == number) {
				check = true;
				break;
			} 
		}
		return check;
	}

	private boolean checkExistsNumber(int number) {
		boolean check = false;
		for (int i = 0; i < numberPlan.length; i++) {
			if (numberPlan[i] == number) {
				check = true;
				break;
			}
		}
		return check;
	}

	private boolean checkNumber(int number) {
		boolean check = false;

		if (checkExistsNumber(number) && checkRegisterNumber(number)) {
			check = true;
		} else if (checkExistsNumber(number) && !checkRegisterNumber(number)) {
			System.err.println("This number is not registered in our network");
		} else {
			System.err.println("This number is not our network");
		}

		return check;
	}
	
	private boolean checkBusyNumber(int number){
		currentConnects[0]= "100:102";
		String string;
		boolean check = false; 
		for (int i = 0; i <1; i++){
			string = currentConnects[i];
			System.out.println(i);
			System.out.println(string.indexOf(string,0));


		}

		return check;
	}
}
