
import java.util.*;
import java.util.function.*;

public class TryYourIde {

	static class Job {
		String name;
		boolean disabled;

		Job(String name, boolean disabled) {
			this.name = name;
			this.disabled = disabled;
		}
	}

	public static void main(String[] args) {
		List<Job> list = Arrays.asList(
				new Job("Do stuff", false),
				new Job("Uh oh", true),
				new Job("Do more stuff", false));

		// Java 7
		for (Job job : list) {
			if (!job.disabled) {
				System.out.println(job.name);
			}
		}

		System.out.println();

		// Java 8
		list.stream().filter(j -> !j.disabled)
				.map(j -> j.name)
				.forEach(System.out::println);
	}
}
