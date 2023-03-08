package objectoriented.firstclasscollection;

import java.util.List;

public class Orders {
	// List라는 컬렉션에 접근할 수 있는 방법이 없기 때문에 값을 변경/추가 할 수 없다

	private final List<Order> orders;

	public Orders(List<Order> orders) {
		this.orders = orders;
	}

	public long getAmountSum() {
		return orders.stream()
			.mapToLong(Order::getAmount)
			.sum();
	}
}
