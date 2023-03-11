package objectoriented.enumex;

import java.util.Arrays;

public class Order {

	private OrderStatus orderStatus;

	public static void main(String[] args) {
		Arrays.stream(OrderStatus.values()).forEach(System.out::println);
	}
}
