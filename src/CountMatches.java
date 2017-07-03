import java.util.*;

public class CountMatches {

	public static void main(String[] args) {
		List<String> matchingList = Arrays.asList("elephant", "tiger");
		List<String> emptyList = Collections.emptyList();

		System.out.println(numberMatches(matchingList));
		System.out.println(numberMatches(emptyList));
	}

	private static long numberMatches(List<String> list) {
		long count = 0;
		for (String string : list) {
			if (string.contains("g"))
				count++;
		}
		return count;
	}

}
