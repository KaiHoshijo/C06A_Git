
public enum Setting {
	OFF("---"), LOW("--+"), MEDIUM("-++"), HIGH("+++");
	private String value;

	Setting(String burnerSetting) {
		value = burnerSetting;
	}
	
	public String toString() {
		return value;
	}
}
