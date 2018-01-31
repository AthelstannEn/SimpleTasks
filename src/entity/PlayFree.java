package entity;

public class PlayFree {

	
	private String name;
	
	private int rate;

	private int number;

	public PlayFree() {
	}

	public PlayFree(String name, int rate, int number) {
		super();
		this.name = name;
		this.rate = rate;
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "PlayFree [name=" + name + ", rate=" + rate + ", number="
				+ number + "]";
	}

}
