package in.javacomics.generics;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class GenericsDemo {

	public static void main(String[] args) {
		Pair p = new Pair("Name", 12);
		Integer intValue =(Integer) p.getSecondElement();
		TypedPair<String, Integer> typedPair = new TypedPair<String, Integer>("FirstElement", 3);
		intValue = typedPair.getSecondElement();//No cast required
		List<Number> numberList = new ArrayList<>();
		List<? extends Number> boundedNumberList = new ArrayList<>();
		numberList.add(new BigDecimal("123"));
		//boundedNumberList.add(new BigDecimal("123")); does not work why
	}

}
