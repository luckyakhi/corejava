package in.javacomics.abstraction;

import org.springframework.stereotype.Component;

@Component
public class EightFloorBldgFlat  implements Flat{

	@Override
	public double getCarpetArea() {
		return 786f;
	}

	@Override
	public double getBuiltUpArea() {
		return 909f;
	}

	@Override
	public double getPrice() {
		return 5100000;
	}

}
