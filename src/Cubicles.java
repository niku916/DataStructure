public class Cubicles {

	int seatNumber;
	Cubicles nextCubicles;

	public Cubicles(int seatNumber) {

		this.seatNumber = seatNumber;
		this.nextCubicles = null;
	}

	public static void main(String[] args) {
		Cubicles firstCubicles = new Cubicles(366);
		firstCubicles.addCubicles(367);
		firstCubicles.addCubicles(368);
		firstCubicles.addCubicles(369);
		System.out.println(firstCubicles);
		System.out.println(firstCubicles.size());
	}

	private void addCubicles(int seatNumber) {
		Cubicles newCubicles = new Cubicles(seatNumber);
		Cubicles lastCubicles = this.traverse();
		lastCubicles.setNextCubicles(newCubicles);
	}

	public Cubicles traverse() {
		Cubicles lastCubicles = this;
		if (this.nextCubicles != null) {
			lastCubicles = this.nextCubicles.traverse();
		}
		return lastCubicles;
	}

	public int size() {
		if (this.nextCubicles == null) {
			return 1;
		}
		return 1 + this.nextCubicles.size();
	}

	public String toString() {
		if (this.nextCubicles != null) {
			return "[" + this.seatNumber + "]" + this.nextCubicles.toString();
		}
		return "[" + this.seatNumber + "]";
	}

	public int getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}

	public Cubicles getNextCubicles() {
		return nextCubicles;
	}

	public void setNextCubicles(Cubicles nextCubicles) {
		this.nextCubicles = nextCubicles;
	}

}
