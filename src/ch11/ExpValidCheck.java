package ch11;

import java.util.*;

public class ExpValidCheck {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage : java ExpValidCheck \"EXPRESSION\"");
            System.out.println("Example : java ExpValidCheck \"((2+3)*1)+3\"");
            System.exit(0);
        }

        Stack st = new Stack(); // 스택 생성
        String expression = args[0];

        System.out.println("expression:" + expression);

        try {
            for (int i = 0; i < expression.length(); i++) { // 문자열로 배열 생성해서 집어넣기
                char ch = expression.charAt(i);

                if (ch == '(') { // ( 괄호 캐치해서 카운트
                    st.push(ch + ""); // pop 전까지는 그다음 문자열들 전부 스택에 넣기
                } else if (ch == ')') {// ) 괄호 캐치해서 멈추고
                    st.pop(); // 스택에 모인 ( ) 안의 내용물 pop
                }
            }

            if (st.isEmpty()) {
                System.out.println("괄호가 일치합니다.");
            } else {
                System.out.println("괄호가 일치하지 않습니다.");
            }
        } catch (EmptyStackException e) {
            System.out.println("괄호가 일치하지 않습니다.");
        } // try
    }
}
