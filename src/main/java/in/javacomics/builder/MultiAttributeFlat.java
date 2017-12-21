package in.javacomics.builder;

import in.javacomics.abstraction.Flat;

public class MultiAttributeFlat implements Flat{
	private double carpetArea;
	private double builtupArea;
	private double price;
	private String currentOwner;
	private int floor;
	private boolean balconyPresent;

	@Override
	public double getCarpetArea() {
		return carpetArea;
	}

	@Override
	public double getBuiltUpArea() {
		return builtupArea;
	}

	@Override
	public double getPrice() {
		return price;
	}
	
	public String getCurrentOwner() {
		return currentOwner;
	}

	public int getFloor() {
		return floor;
	}

	public boolean isBalconyPresent() {
		return balconyPresent;
	}
	
	
	@Override
	public String toString() {
		return "MultiAttributeFlat [carpetArea=" + carpetArea
				+ ", builtupArea=" + builtupArea + ", price=" + price
				+ ", currentOwner=" + currentOwner + ", floor=" + floor
				+ ", balconyPresent=" + balconyPresent + ", toString()="
				+ super.toString() + "]";
	}




	public static class Flatbuilder{
		private MultiAttributeFlat flat;
		public Flatbuilder() {
			flat= new MultiAttributeFlat();
		}
		public Flatbuilder carpetArea(float carpetArea){
			this.flat.carpetArea=carpetArea;
			return this;
		}
		public Flatbuilder builtupArea(float builtupArea){
			this.flat.builtupArea=builtupArea;
			return this;
		}
		public Flatbuilder price(float price){
			this.flat.price=price;
			return this;
		}
		public Flatbuilder floor(int floor){
			this.flat.floor=floor;
			return this;
		}
		public Flatbuilder owner(String owner){
			this.flat.currentOwner=owner;
			return this;
		}
		public Flatbuilder balcony(boolean balconyPresent){
			this.flat.balconyPresent=balconyPresent;
			return this;
		}
		public Flat build(){
			return this.flat;
		}
	}
}
