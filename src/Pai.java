public class Pai implements Comparable<Pai> {
	private char huaSe; // 4 kinds of huaSe
	private int num; // 1 to 9
	private int seq; // 0 to 3

	public Pai(char huaSe, int seq, int num) {
		this.huaSe = huaSe;
		this.seq = seq;
		this.num = num;
	}

	public char getHuaSe() {
		return huaSe;
	}

	public void setHuaSe(char huaSe) {
		this.huaSe = huaSe;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String toString() {
		return huaSe + ":" + seq + "," + num;
	}

	// public int compareTo(Object o) throws NullPointerException,
	// ClassCastException {
	// if (o == null) {
	// throw new NullPointerException("The Object to compare to is null");
	// } else if (o instanceof Pai) {
	// Pai pai = (Pai) o;
	// return compareTo(pai);
	// } else {
	// throw new ClassCastException("You cannot pass in a Class other than Pai");
	// }
	// }

	public int compareTo(Pai pai) {
		if (this.huaSe == pai.getHuaSe()) {
			if (this.seq == pai.getSeq()) {
				return Integer.valueOf(this.num).compareTo(pai.getNum());
			} else {
				return Integer.valueOf(this.seq).compareTo(pai.getSeq());
			}
		} else {
			return Character.valueOf(this.huaSe).compareTo(pai.getHuaSe());
		}
	}

	// public int compareTo(Pai pai) {
	// if (this.huaSe > pai.getHuaSe()) {
	// return 1;
	// } else if (this.huaSe == pai.getHuaSe()) {
	// return 0;
	// } else {
	// return -0;
	// }
	// }
}