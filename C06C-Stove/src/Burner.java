
public class Burner {
	private enum Temperature {BLAZING, HOT, WARM, COLD};
	private Temperature myTemperature;
	private Setting mySetting;
	private int timer;
	
	public static final int TIME_DURATION = 2;
	
	public Burner() {
		mySetting = Setting.OFF;
		myTemperature = Temperature.COLD;
	}
	
	
	public Temperature getMyTemperature() {
		return myTemperature;
	}


	public void plusButton() {
		switch (mySetting.toString()) {
			case "---":
				mySetting = Setting.LOW;
				break;
			case "--+":
				mySetting = Setting.MEDIUM;
				break;
			case "-++":
				mySetting = Setting.HIGH;
				break;
		}
		
	}


	public void minusButton() {
		switch (mySetting.toString()) {
			case "+++":
				mySetting = Setting.MEDIUM;
				break;
			case "-++":
				mySetting = Setting.LOW;
				break;
			case "--+":
				mySetting = Setting.OFF;
				break;
		}
		
	}


	public void updateTemperature() {
		// TODO Auto-generated method stub
		
	}
	
	public void display() {
		
	}
	
	
}
