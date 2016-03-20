package stringCalculatorJava8;

import java.util.Arrays;
import java.util.stream.Stream;

public class StringCalc {

	public int calc(String numbers) {
		Stream<String> numberStream = Arrays.stream(numbers.split(",")) ;
		
		return numberStream.mapToInt(n -> Integer.valueOf(n)).sum();
	}

}
