package objectoriented.firstclasscollection;

public class Human {

	private final String name;
	private final int age;

	public Human(final String name, final int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}
