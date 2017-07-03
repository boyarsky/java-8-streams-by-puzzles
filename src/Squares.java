import java.util.*;
import java.util.stream.*;

public class Squares {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 4, 7, 10);
		System.out.println(convert(list));
	}

	private static List<String> convert(List<Integer> list) {
		List<String> result = new ArrayList<>();
		for (Integer number : list) {
			if (number % 2 == 0)
				result.add(number + "*" + number + "=" + (number * number));
		}
		return result;
	}
	
}
