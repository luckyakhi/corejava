package in.javacomics.enumerations;

public enum Instrument  {
	SoveriegnBond("SB"),Equity("EQ"),FixedIncome("FI");
	private String code;
	private Instrument(String code){
		System.out.println("Cons called");
		this.code=code;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code){
		this.code=code;
	}
	
}
