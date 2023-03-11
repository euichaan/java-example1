package objectoriented.enumex;

public class ColorTest {

	public static void main(String[] args) {
		Color[] values = Color.values();
		for (Color value : values) {
			System.out.println(value);
		}

		Color red = Color.valueOf("RED");
		System.out.println(red);
	}
}
