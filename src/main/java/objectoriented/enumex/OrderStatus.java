package objectoriented.enumex;

public enum OrderStatus {

	// 인스턴스가 하나만 만들어짐
	PREPARING(0), SHIPPED(1), DELIVERING(2), DELIVERED(3);

	private final int number;

	OrderStatus(int number) {
		this.number = number;
	}
}
