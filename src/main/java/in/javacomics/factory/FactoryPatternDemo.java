package in.javacomics.factory;

public class FactoryPatternDemo {
	public static void main(String[] args) {
		//Will be injected mostly so client may not need to have compile time
		//dependencies on actual factory chosen
		
		FlatFactory towerFactory = new TowerFlatFactory();
		FlatFactory eightFloorFactory = new EightFloorFlatFactory();
		System.out.println("Create window in tower: "+towerFactory.createWindow());
		System.out.println("Create window in eight floor bldg: "+eightFloorFactory.createWindow());
	}
}
