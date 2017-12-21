package in.javacomics.polymorphism;

import java.util.function.BinaryOperator;

public class Additon implements Operator<Integer, BinaryOperator<Integer>> {

	@Override
	public Integer operate(Integer operand1, Integer operand2,BinaryOperator<Integer> operation) {
		return operation.apply(operand1, operand2);
	}


}
