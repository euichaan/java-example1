package listinterface;

import static org.assertj.core.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class ListClientExampleTest {

	@Test
	void testListClientExample() {
		ListClientExample lce = new ListClientExample();
		List list = lce.getList();
		assertThat(list).isInstanceOf(ArrayList.class);
	}
}