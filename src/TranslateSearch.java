import java.math.*;
import java.util.*;

public class TranslateSearch {

	public static void main(String[] args) {
		List<BigDecimal> matchingList = Arrays.asList(BigDecimal.ZERO, BigDecimal.ONE);
		List<BigDecimal> nonMatchingList = Arrays.asList(BigDecimal.ONE, BigDecimal.TEN);
		List<BigDecimal> emptyList = Collections.emptyList();

		System.out.println(isZeroInList(matchingList));
		System.out.println(isZeroInList(nonMatchingList));
		System.out.println(isZeroInList(emptyList));
	}

	private static boolean isZeroInList(List<BigDecimal> list) {
		for (BigDecimal decimal : list) {
			if (decimal.equals(BigDecimal.ZERO))
				return true;
		}
		return false;
	}

}
