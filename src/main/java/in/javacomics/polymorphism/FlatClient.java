package in.javacomics.polymorphism;

import in.javacomics.abstraction.Flat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FlatClient {
	@Autowired
	@Qualifier("towerFlat")
	private Flat flat;
	
	public void setFlat(Flat flat) {
		this.flat = flat;
	}
	public void invokeGetPriceOfFlat(Flat flat){
		System.out.println(" Price of flat is : " + flat.getPrice());
	}
	public void invokeGetPriceOfFlat(){
		System.out.println(" Price of flat is : " + flat.getPrice());
	}
}
