package ch11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class StudentV2 extends StudentV3 {
	private int total;
	private int schoolRank;

	StudentV2(String name, int ban, int no, int kor, int eng, int math) {
		super(name, ban, no, kor, eng, math);
		total = kor + eng + math;
	}

	public int getSchoolRank() {
		return schoolRank;
	}

	public void setSchoolRank(int schoolRank) {
		this.schoolRank = schoolRank;
	}

	@Override
	int getTotal() {
		return total;
	}

	@Override
	public String toString() {
		return super.toString() + "," + schoolRank;
	}

	@Override
	public int compareTo(Object o) {
		if (!(o instanceof StudentV2)) {
			return -1;
		}

		return ((StudentV2) o).getTotal() - this.total;
	}
}

class Exercise11_8 {

	public static void calculateSchoolRank(List list) {
		Collections.sort(list); // list . 먼저 를 총점기준 내림차순으로 정렬한다

		int prevRank = -1; // 이전 전교등수
		int prevTotal = -1; // 이전 총점
		int length = list.size();

		for (int i = 0; i < length; i++) {
			StudentV2 student = (StudentV2) list.get(i);

			if (prevTotal == student.getTotal()) {
				student.setSchoolRank(prevRank);
			} else {
				prevRank = i + 1;
				student.setSchoolRank(prevRank);
				prevTotal = student.getTotal();
			}
		}
	}

	public static void main(String[] args) {
		ArrayList<Object> list = new ArrayList<Object>();
		list.add(new StudentV2("이자바", 2, 1, 70, 90, 70));
		list.add(new StudentV2("안자바", 2, 2, 60, 100, 80));
		list.add(new StudentV2("홍길동", 1, 3, 100, 100, 100));
		list.add(new StudentV2("남궁성", 1, 1, 90, 70, 80));
		list.add(new StudentV2("김자바", 1, 2, 80, 80, 90));

		calculateSchoolRank(list);

		Iterator<Object> it = list.iterator();
		while (it.hasNext())
			System.out.println(it.next());
	}

}
