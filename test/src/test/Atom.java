package test;

public class Atom {
	// attributes
	int protonNumber;
	String name;
	String symbol;
	int group;
	int period;
	int oxState;

	// methods
	public void setAttributes(int protonNumber, String name, String symbol, int group, int period, int oxState) {

		this.protonNumber = protonNumber;
		this.name = name;
		this.symbol = symbol;
		this.group = group;
		this.period = period;
		this.oxState = oxState;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "OZ" + protonNumber + " " + name;
	}

	public Atom() {
		// TODO Auto-generated constructor stub
	}

	public Atom(int protonNumber, String name, String symbol, int group, int period, int oxState) {
		this.protonNumber = protonNumber;
		this.name = name;
		this.symbol = symbol;
		this.group = group;
		this.period = period;
		this.oxState = oxState;
	}

}
