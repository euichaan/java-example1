package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class StreamForEach {

	public static void main(String[] args) {
		List<String> strings = new ArrayList<>();
		strings.add("hello");
		strings.add("World");

		for (int i = 0; i < strings.size(); ++i) {
			System.out.println(strings.get(i));
		}

		for (String string : strings) {
			System.out.println(string);
		}
		// Side-effects : forEach 내부에 로직이 하나라도 더 추가된다면 동시성 보장이 어려워지고 가독성이 떨어질 위험이 있다.
		// 또한 Stream 의 의도를 벗어나게 된다. 본래 forEach는 스트림의 종료를 위한 연산.
		// 로직을 수행하는 역할은 Stream을 반환하는 중간연산이 해야하는 일이다.
		strings.stream().forEach(System.out::println);

		for (int i = 0; i < 100; ++i) {
			if (i > 50) {
				break;
			}
			System.out.println(i);
		}

		IntStream.rangeClosed(1, 100)
			.filter(i -> i <= 50)
			.forEach(System.out::println);
	}
}
