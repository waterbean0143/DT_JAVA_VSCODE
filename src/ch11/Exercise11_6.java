package ch11;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

@SuppressWarnings("rawtypes")
class Exercise11_6 {

	@SuppressWarnings("unchecked")
	static int getGroupCount(TreeSet tset, int from, int to) {
		StudentV3 start = new StudentV3("", 0, 0, from, from, from);
		StudentV3 end = new StudentV3("", 0, 0, to, to, to);

		return tset.subSet(start, end).size();
	}

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		TreeSet set = new TreeSet(new Comparator() {

			public int compare(Object o1, Object o2) {
				if (o1 instanceof StudentV3 && o2 instanceof StudentV3) {
					float avgStudent1 = ((StudentV3) o1).getAverage();
					float avgStudent2 = ((StudentV3) o2).getAverage();

					if (avgStudent1 < avgStudent2) {
						return -1;
					} else if (avgStudent1 > avgStudent2) {
						return 1;
					} else {
						return ((StudentV3) o1).compareTo((StudentV3) o2);
					}

				} else {
					return -1;
				}
			}
		});

		set.add(new StudentV3("홍길동", 1, 1, 100, 100, 100));
		set.add(new StudentV3("남궁성", 1, 2, 90, 70, 80));
		set.add(new StudentV3("김자바", 1, 3, 80, 80, 90));
		set.add(new StudentV3("이자바", 1, 4, 70, 90, 70));
		set.add(new StudentV3("안자바", 1, 5, 70, 100, 80));
		Iterator it = set.iterator();

		System.out.println(set);

		while (it.hasNext())
			System.out.println(it.next());

		System.out.println("[60~69] :" + getGroupCount(set, 60, 70));
		System.out.println("[70~79] :" + getGroupCount(set, 70, 80));
		System.out.println("[80~89] :" + getGroupCount(set, 80, 90));
		System.out.println("[90~100] :" + getGroupCount(set, 90, 101));
	}
}
