package java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
		List<String> filteredNames = names.stream().filter(name -> name.startsWith("A")).collect(Collectors.toList());

	}

}
