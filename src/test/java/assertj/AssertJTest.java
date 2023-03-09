package assertj;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import objectoriented.firstclasscollection.Human;
import objectoriented.firstclasscollection.Pay;
import objectoriented.firstclasscollection.PayType;

public class AssertJTest {

	@Test
	void a_few_simple_assertions() {
		assertThat("The Lord of the Rings").isNotNull()
			.startsWith("The")
			.contains("Lord")
			.endsWith("Rings");
	}

	@Test
	void assertion_description() {
		Pay pay = new Pay(PayType.NAVER_PAY, 1000);

		assertThat(pay.getAmount()).as("check %s's amoount", pay.getPayType())
			.isEqualTo(1000);
	}

	@Test
	void filter_test() {
		List<Human> list = new ArrayList<>();
		Human kim = new Human("Kim", 22);
		Human park = new Human("Park", 25);
		Human lee = new Human("Lee", 25);
		Human amy = new Human("Amy", 22);
		Human jack = new Human("Jack", 22);

		list.add(kim);
		list.add(park);
		list.add(lee);
		list.add(amy);
		list.add(jack);

		assertThat(list).filteredOn(human -> human.getName().contains("a"))
			.containsOnly(park, jack);
	}

	@Test
	void filter_test2() {
		List<Human> list = new ArrayList<>();
		Human kim = new Human("Kim", 22);
		Human park = new Human("Park", 25);
		Human lee = new Human("Lee", 25);
		Human amy = new Human("Amy", 22);
		Human jack = new Human("Jack", 22);

		list.add(kim);
		list.add(park);
		list.add(lee);
		list.add(amy);
		list.add(jack);

		assertAll(
			() -> assertThat(list).filteredOn("age", 25).containsOnly(park, lee),
			() -> assertThat(list).filteredOn("age", notIn(22)).containsOnly(park, lee),
			() -> assertThat(list).extracting("name").contains("Kim", "Park", "Lee", "Amy", "Jack"),
			() -> assertThat(list).extracting("name", String.class).contains("Kim", "Park", "Lee", "Amy", "Jack"),
			() -> assertThat(list).extracting("name", "age")
				.contains(tuple("Kim", 22),
					tuple("Park", 25),
					tuple("Lee", 25),
					tuple("Amy", 22),
					tuple("Jack", 22))
		);
	}

	@Test
	void 문자열_검증() {
		String expression = "This is a string";

		assertThat(expression).startsWith("This").endsWith("string").contains("a");
	}

	@Test
	void exception_assertion_example() {
		Throwable thrown = catchThrowable(() -> {
			throw new RuntimeException("boom!");});

		assertThat(thrown).isInstanceOf(RuntimeException.class)
			.hasMessageContaining("boom");
	}

	@Test
	void testException() {
		assertThatNullPointerException().isThrownBy(() -> {
			throw new NullPointerException("boom!");
		}).withMessage("%s!", "boom")
			.withNoCause();
	}

	@Test
	void not_throw_exception() {
		assertThatCode(() -> {

		}).doesNotThrowAnyException();
	}
}
