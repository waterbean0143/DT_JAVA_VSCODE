package ch11;

import java.util.HashSet;

class SutdaCard {
	int num;
	boolean isKwang;

	SutdaCard() {
		this(1, true);
	}

	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

	public boolean equals(Object obj) {
		if (obj instanceof SutdaCard) {
			SutdaCard c = (SutdaCard) obj;
			return num == c.num && isKwang == c.isKwang;
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return ("" + num + isKwang).hashCode();
	}

	public String toString() {
		return num + (isKwang ? "K" : "");
	}
}

class Exercise11_11 {

	public static void main(String[] args) {
		SutdaCard c1 = new SutdaCard(3, true);
		SutdaCard c2 = new SutdaCard(3, true);
		SutdaCard c3 = new SutdaCard(1, true);

		HashSet<Object> set = new HashSet<Object>();
		set.add(c1);
		set.add(c2);
		set.add(c3);

		System.out.println(c1 == c2);
		System.out.println(c1.equals(c2));
		System.out.println(c1.hashCode() + ", " + c2.hashCode());

		System.out.println(set);
	}

}
