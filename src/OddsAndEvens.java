import java.util.*;
import java.util.stream.*;

public class OddsAndEvens {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 4, 7, 10);
		System.out.println(split(list));
		System.out.println(split2(list));
	}
	
	private static Map<Boolean,List<Integer>> split2(List<Integer> list) {
		return list.stream().collect(Collectors.partitioningBy(x -> x % 2 == 0));
	}

	private static Map<Boolean,List<Integer>> split(List<Integer> list) {
		Map<Boolean,List<Integer>> result = new HashMap<>();
		result.put(Boolean.FALSE, new ArrayList<>());
		result.put(Boolean.TRUE, new ArrayList<>());
		for (Integer integer : list) {
			boolean key = integer %2 == 0;
			result.get(key).add(integer);
		}
		return result;
	}
	
}
