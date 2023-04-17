package java8features;

import java.util.Arrays;
import java.util.List;

public class foreach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> strings = Arrays.asList("foo", "bar", "baz");
		strings.forEach(str -> System.out.println(str.toUpperCase()));


	}

}
