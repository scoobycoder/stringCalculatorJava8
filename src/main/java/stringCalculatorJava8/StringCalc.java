package stringCalculatorJava8;

import java.util.Arrays;
import java.util.stream.Stream;

public class StringCalc {

	public int calc(String numbers) {
		return sumStreamOfStringNumbers(createStreamOfStringNumbers(numbers));
	}

	private Stream<String> createStreamOfStringNumbers(String numbers) {
		return Arrays.stream(numbers.split(",|\n"));
	}

	private int sumStreamOfStringNumbers(Stream<String> numberStream) {
		return numberStream.mapToInt(n -> Integer.valueOf(n)).sum();
	}

}
