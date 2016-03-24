package stringCalculatorJava8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StringCalc {

	public int calc(String numbers) {
		Stream<String> numberStream = createStreamOfStringNumbers(numbers);
		//numberStream.forEach(System.out::println);
		return sumStreamOfStringNumbers(numberStream);
	}

	private Stream<String> createStreamOfStringNumbers(String numbers) {
		String delimitter = String.valueOf(numbers.charAt(2));
		List<String> numberArray = (List<String>) Arrays
				.asList(numbers.split(delimitter));
		numberArray.removeIf(item -> item == null || "".equals(item));

		return Arrays.stream(
				convertStreamToArrayForCharacterProcessing(numberArray)).map(
				removeSpecialCharacters()).filter(removeZeros());
	}

	private String[] convertStreamToArrayForCharacterProcessing(List<String> numberArray) {
		return numberArray.toArray(new String[numberArray.size()]);
	}

	private Predicate<? super String> removeZeros() {
		return n -> Integer.valueOf(n) > 0;
	}

	private Function<String, String> removeSpecialCharacters() {
		return n -> n.replace("//", "0").replace("\n", "0");
	}

	private int sumStreamOfStringNumbers(Stream<String> numberStream) {
		return numberStream.map(n -> n).mapToInt(n -> Integer.parseInt(n))
				.sum();
	}

}
