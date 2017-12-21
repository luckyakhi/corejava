package in.javacomics.datastructures.map;

import java.util.EnumMap;

import in.javacomics.enumerations.Instrument;

public class EnumMapDemo {

	public static void main(String[] args) {
		EnumMap<Instrument,String> enumMap = new EnumMap<>(Instrument.class);
		enumMap.put(Instrument.SoveriegnBond, "SoveriegnBond");
		enumMap.put(Instrument.FixedIncome, "FixedIncome");
		enumMap.put(Instrument.Equity, "Equity");
		System.out.println(enumMap);
	}

}
