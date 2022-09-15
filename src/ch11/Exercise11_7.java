package ch11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

//class BanNoAscending implements Comparator<Object> {
//	@Override
//	public int compare(Object o1, Object o2) {
//
//		if (!(o1 instanceof Student && o2 instanceof Student)) {
//			return -1;
//		}
//
//		Student s1 = (Student) o1;
//		Student s2 = (Student) o2;
//
//		return s1.ban != s2.ban ? s1.ban - s2.ban : s1.no - s2.no;
//	}
//
//}

class Exercise11_7 {

	public static void main(String[] args) {
		ArrayList<Object> list = new ArrayList<Object>();
		list.add(new StudentV3("이자바", 2, 1, 70, 90, 70));
		list.add(new StudentV3("안자바", 2, 2, 60, 100, 80));
		list.add(new StudentV3("홍길동", 1, 3, 100, 100, 100));
		list.add(new StudentV3("남궁성", 1, 1, 90, 70, 80));
		list.add(new StudentV3("김자바", 1, 2, 80, 80, 90));

		// Collections.sort(list, new BanNoAscending());
		Collections.sort(list, new Comparator<Object>() {
			@Override
			public int compare(Object o1, Object o2) {
				if (!(o1 instanceof StudentV3 && o2 instanceof StudentV3)) {
					return -1;
				}

				StudentV3 s1 = (StudentV3) o1;
				StudentV3 s2 = (StudentV3) o2;
				return s1.ban == s2.ban ? s1.no - s2.no : s1.ban - s2.ban;
			}
		});

		Iterator<Object> it = list.iterator();
		while (it.hasNext())
			System.out.println(it.next());
	}

}
