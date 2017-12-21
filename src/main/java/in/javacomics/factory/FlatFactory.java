package in.javacomics.factory;

import in.javacomics.abstraction.Flat;
import in.javacomics.abstraction.Window;

public interface FlatFactory {
	public Flat createFlat();
	public Window createWindow();
}
