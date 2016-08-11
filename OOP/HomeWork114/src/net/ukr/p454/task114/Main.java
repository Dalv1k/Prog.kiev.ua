package net.ukr.p454.task114;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		BaseStation baseStation = new BaseStation(16);
		baseStation.setNumberPlan();
		
		//assign number 
		ExtNumber extNumber1 = new ExtNumber(baseStation.getNextNumber(), "Ivanov Ivan", true);
		ExtNumber extNumber2 = new ExtNumber(baseStation.getNextNumber(), "Petrov Petro", true);
		ExtNumber extNumber3 = new ExtNumber(baseStation.getNextNumber(), "Bogdanov Bogdan", true);
		ExtNumber extNumber4 = new ExtNumber(baseStation.getNextNumber(), "Tarasov Taras", true);
		
		Phone phone1 = new Phone("Cisco A000", extNumber1);
		Phone phone2 = new Phone("Cisco A000", extNumber2);
		Phone phone3 = new Phone("Cisco A100v2", extNumber3);
		Phone phone4 = new Phone("Cisco A100v2", extNumber4);
		
		
		//register phone in our network
		baseStation.registerNumber(phone1);
		baseStation.registerNumber(phone2);
		baseStation.registerNumber(phone3);

		phone1.makeCall(baseStation);
		
	}

}
