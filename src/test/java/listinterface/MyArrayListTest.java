package listinterface;

import static org.assertj.core.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyArrayListTest {

	private List<Integer> mylist;
	private List<Integer> list;

	@BeforeEach
	void setUp() throws Exception {
		list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);

		mylist = new MyArrayList<Integer>();
		mylist.addAll(list);
	}

	@Test
	void testMyList() {
		assertThat(mylist.size()).isEqualTo(3);
	}

	@Test
	void testAddIntT() {
		try {
			mylist.set(-1, 0);
			fail("fail");
		} catch (IndexOutOfBoundsException e) {}
	}

	@Test
	void testClear() {
		mylist.clear();
		assertThat(mylist.size()).isEqualTo(0);
	}
}