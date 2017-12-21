package in.javacomics.factory;

import in.javacomics.abstraction.Flat;
import in.javacomics.abstraction.LargeWindow;
import in.javacomics.abstraction.Window;
import in.javacomics.encapsulation.TowerFlat;

public class TowerFlatFactory implements FlatFactory {

	@Override
	public Flat createFlat() {
		return new TowerFlat(13f, 14f);
	}

	@Override
	public Window createWindow() {
		return new LargeWindow();
	}

}
