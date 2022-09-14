package ch11;

import java.util.*;

@SuppressWarnings({ "rawtypes", "unchecked" })
class Exercise11_1 {

    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        ArrayList list2 = new ArrayList();
        ArrayList kyo = new ArrayList(); // 교집합
        ArrayList cha = new ArrayList(); // 차집합
        ArrayList hap = new ArrayList(); // 합집합
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);

        kyo.addAll(list1); // 교집합에서 list 1 전부 삽입
        kyo.retainAll(list2); // list1 다 삽입된 교집합에서 list2와 공통된거 만 남긴다
        // ->list1과 list2의 공통만 남은 교집합 완성

        cha.addAll(list1); // 차집합에 list 1 전부 삽입
        cha.removeAll(list2); // list1 다 삽입된 차집합에서 list2와 공통된거 전부 제거
        // ->list에서 list2가 빠진 차집합 완성

        hap.addAll(list1); // 합집합에서 list 1 전부 삽입
        hap.remove(kyo); // 합집합에서 교집합과 공통된 요소 삭제 -> list1- 교집합
        hap.addAll(list2); // 합집합에 list2 전부 추가
        // ->list1+ list2 - 중복된 교집합 한번 제거 됨
        // 합집합 ==a+b -교집합(a,b)

        System.out.println("list1=" + list1);
        System.out.println("list2=" + list2);
        System.out.println("kyo=" + kyo);
        System.out.println("cha=" + cha);
        System.out.println("hap=" + hap);
    }
}