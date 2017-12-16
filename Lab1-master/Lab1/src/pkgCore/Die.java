package pkgCore;

public class Die {

	private int DieValue;

	public Die() {
		this.DieValue =  Math.round((float)Math.random() * 5) + 1;

	}

	public int getDieValue() {
		return DieValue;
	}
}
