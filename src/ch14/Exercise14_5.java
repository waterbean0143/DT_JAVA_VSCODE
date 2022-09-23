package ch14;

import java.util.*;
import java.util.stream.*;

class Exercise14_5 {
    public static void main(String[] args) {
        String[] strArr = { "aaa", "bb", "c", "dddd" };
        Stream<String> strStream = Stream.of(strArr);
        strStream.map(String::length) // strStream.map(s-> s.length())
                .sorted(Comparator.reverseOrder()) // 문자열 길이로 역순 정렬
                .limit(1).forEach(System.out::println); // 제일 긴 문자열의 길이 출력
    }
}