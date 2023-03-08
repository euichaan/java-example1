package collection;

import static org.assertj.core.api.Assertions.*;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SortingTest {

	@DisplayName("List.of는 불변 리스트를 반환한다.")
	@Test
	void failure_sort_test() {
		List<String> strings = List.of("abc", "ab", "a");

		assertThatThrownBy(() -> Collections.sort(
			strings, Comparator.comparingInt(String::length)))
			.isInstanceOf(UnsupportedOperationException.class);
	}
}
