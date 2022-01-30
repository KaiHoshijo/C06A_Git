
public class Burner {
	public enum Temperature {BLAZING, HOT, WARM, COLD};
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
		// Increase temperature unless temperature is max
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
		// Decreasing temperature unless setting is off
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
		// Increasing timer to ensure burner changes after time duration
		timer++;
		// Increasing temperature only if time duration has passed
		
	}
	
	public void display() {
		// Displaying the current setting of the burner
		System.out.print(mySetting);
		// Providing the reaction to that temperature
			switch (myTemperature) {
			case BLAZING:
				System.out.println(".....VERY HOT! DON'T TOUCH");
				break;
			case HOT:
				System.out.println(".....CAREFUL");
				break;
			case WARM:
				System.out.println(".....warm");
				break;
			case COLD:
				System.out.println(".....cooool");
				break;
		}
	}
	
	
}
