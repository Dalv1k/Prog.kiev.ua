package net.ukr.p454.task3alter;

public enum Sex {
	
	MALE("man"), FEMALE("woman");
	
	private String inRus;
	
	private Sex(String inRus){
		this.inRus = inRus;
	}

	public String getInRus() {
		return inRus;
	}

	public void setInRus(String inRus) {
		this.inRus = inRus;
	}
	
	
}
