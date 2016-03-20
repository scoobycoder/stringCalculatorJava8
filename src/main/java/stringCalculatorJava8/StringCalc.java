package stringCalculatorJava8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class StringCalc {

	public int calc(String numbers) {
		Stream<String> numberStream = createStreamOfStringNumbers(numbers);
		// numberStream.forEach(System.out::println);
		return sumStreamOfStringNumbers(numberStream);
	}

	private Stream<String> createStreamOfStringNumbers(String numbers) {
		String delimitter = String.valueOf(numbers.charAt(2));
		ArrayList<String> numberArray = (ArrayList<String>) Arrays
				.asList(numbers.split(delimitter));
		numberArray.removeIf(item -> item == null || "".equals(item));

		return Arrays.stream(
				numberArray.toArray(new String[numberArray.size()])).map(
				n -> n.replace("//", "").replace("\n", ""));
	}

	private int sumStreamOfStringNumbers(Stream<String> numberStream) {
		return numberStream.map(n -> n).mapToInt(n -> Integer.parseInt(n))
				.sum();
	}

}
