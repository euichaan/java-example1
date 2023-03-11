package objectoriented.enumex;

public enum Color {
	RED(3), YELLOW(21), GREEN(5), BLUE(1);

	private final int value;

	Color(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}
