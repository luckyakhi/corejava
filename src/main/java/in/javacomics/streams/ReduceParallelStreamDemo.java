package in.javacomics.streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ReduceParallelStreamDemo {

	public static void main(String[] args) {
		List<Integer> ratings = Arrays.asList(5,4,8,9,10,5);
		int result=ratings.parallelStream().reduce(1, (t,v) -> t+v,(t,v)->t*v);
		System.out.println(result);
		//Collect example
		Set<Integer> uniqueRatings=ratings.parallelStream().collect(HashSet::new,HashSet::add,HashSet::addAll);
		System.out.println(uniqueRatings);
		
	}

}
