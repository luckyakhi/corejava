package in.javacomics.factory;

import in.javacomics.abstraction.EightFloorBldgFlat;
import in.javacomics.abstraction.Flat;
import in.javacomics.abstraction.SmallWindow;
import in.javacomics.abstraction.Window;

public class EightFloorFlatFactory implements FlatFactory{

	@Override
	public Flat createFlat() {
		return new EightFloorBldgFlat();
	}

	@Override
	public Window createWindow() {
		return new SmallWindow();
	}

}
