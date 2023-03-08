package firstclasscollection;

import static org.assertj.core.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Final 은 ")
public class FinalTest {

	@DisplayName("재할당이 불가능하다.")
	@Test
	void final_cannot_reallocation() {
		final Map<String, Boolean> collection = new HashMap<>();

		// collection = new HashMap<>(); Compile error

		assertThat(collection.size()).isEqualTo(4);
	}

	@DisplayName("값 변경이 가능하다.")
	@Test
	void can_change_value() {
		final Map<String, Boolean> collection = new HashMap<>();

		collection.put("1", true);
		collection.put("2", true);
		collection.put("3", true);
		collection.put("4", true);

		assertThat(collection.size()).isEqualTo(4);
	}
}
