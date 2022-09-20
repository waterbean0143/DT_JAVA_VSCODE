package ch13;

import java.util.*;

class Exercise13_8 {
    Vector words = new Vector();
    String[] data = { "태연", "유리", "윤아", "효연", "수영", "서현", "티파니", "써니", "제시카" };
    int interval = 2 * 1000; // 2초
    WordGenerator wg = new WordGenerator();

    public static void main(String args[]) {
        Exercise13_8 game = new Exercise13_8();
        game.wg.start(); // 단어를 생성하는 쓰레드를 실행시킨다.
        Vector words = game.words;
        while (true) {
            System.out.println(words);
            String prompt = ">>";
            System.out.print(prompt);
            // 화면으로부터 라인단위로 입력받는다.
            Scanner s = new Scanner(System.in);
            String input = s.nextLine().trim();
            int index = words.indexOf(input); // 입력받은 단어를 words에서 찾는다.
            if (index != -1) { // 찾으면
                words.remove(index); // words에서 해당 단어를 제거한다.
            }
        }
    } // main

    class WordGenerator extends Thread {
        public void run() {
            while (true) {

                int rand = (int) (Math.random() * data.length); // interval(2초)마다 배열 data의 값 중 하나를 임의로 선택한다.

                words.add(data[rand]); // words에 data에서 임의로 선택된 친구를 추가한다.
                try {
                    Thread.sleep(interval); // interval에 설정된 시간만큼(여기는 2초) 쉰다.
                } catch (Exception e) {
                }
            }
        } // end of run()
    } // class WordGenerator
} // Exercise13_8