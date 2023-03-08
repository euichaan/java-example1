package listinterface;

import java.util.Arrays;
import java.util.List;

public class ArrayList {

	public static void main(String[] args) {
		String[] str = {"a", "b", "c"};
		List<String> list = Arrays.asList(str);

		str[1] = "d";
		System.out.println(list);
		// Arrays.asList() 배열의 size가 변하면 안 되거나 변할 필요가 없을 때
	}
}
