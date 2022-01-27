
public class Burner {
	private enum Temperature {BLAZING, HOT, WARM, COLD};
	private Temperature myTemperature;
	private Setting mySetting;
	private int timer;
	private static final int TIME_DURATION = 2;
	
	
	public Temperature getMyTemperature() {
		return myTemperature;
	}
	
	
}
