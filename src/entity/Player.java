package entity;

import java.util.Comparator;

public class Player implements Comparator<Player>, Comparable<Player> {

	private String name;

	private int Rate;

	private Jwin win;

	private long kode;

	public Player() {}

	public Player(String name, int rate, Jwin win, long kode) {
		super();
		this.name = name;
		Rate = rate;
		this.win = win;
		this.kode = kode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRate() {
		return Rate;
	}

	public void setRate(int rate) {
		Rate = rate;
	}

	public Jwin getWin() {
		return win;
	}

	public void setWin(Jwin win) {
		this.win = win;
	}

	public long getKode() {
		return kode;
	}

	public void setKode(int kode) {
		this.kode = kode;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Rate;
		result = prime * result + (int) (kode ^ (kode >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((win == null) ? 0 : win.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		if (Rate != other.Rate)
			return false;
		if (kode != other.kode)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (win != other.win)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", Rate=" + Rate + ", win=" + win
				+ ", kode=" + kode + "]";
	}

	@Override
	public int compareTo(Player o) {
	
		return win.compareTo(win.One);
	}

	@Override
	public int compare(Player o1, Player o2) {
		return o1.getRate() - o2.getRate();
	}
}
