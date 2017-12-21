package in.javacomics.encapsulation;

import in.javacomics.abstraction.Flat;

public class TowerFlat implements Flat{
	private double carpetArea;
	private double builtUpArea;
	private double price;
	
	
	public TowerFlat(double carpetArea, double builtUpArea) {
		super();
		this.carpetArea = carpetArea;
		this.builtUpArea = builtUpArea;
	}

	@Override
	public double getCarpetArea() {
		return carpetArea;
	}

	@Override
	public double getBuiltUpArea() {
		return builtUpArea;
	}

	@Override
	public double getPrice() {
		return price;
	}
	
	public void updatePriceAsPerMarket(double marketRate){
		//TODO validate marketRate price and other state is encapsulated and altered only through
		//controlled public interfaces
		//Great candidate of strategy pattern
		price  = marketRate*builtUpArea;
	}

}
