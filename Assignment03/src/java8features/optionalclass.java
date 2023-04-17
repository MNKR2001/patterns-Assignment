package java8features;

import java.util.Optional;

public class optionalclass {
	public static void main(String[] args) {
		String str = "foo";
		Optional<String> optionalStr = Optional.ofNullable(str);
		optionalStr.map(String::toUpperCase).ifPresent(System.out::println);

	}

}
