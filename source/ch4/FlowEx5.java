import java.util.*;

class FlowEx5 {
	public static void main(String[] args) { 
		int  score = 0;
		char grade = ' ';
		char opt   = '0';

		System.out.print("점수를 입력해주세요.>");

		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine(); // 화면을 통해 입력받은 내용을 tmp에 저장
		score = Integer.parseInt(tmp);   // 입력받은 문자열(tmp)을 숫자로 변환
		
		System.out.printf("당신의 점수는 %d입니다.", score);

		if (score >= 90) {		      // score가 90점 보다 같거나 크면 A학점(grade)
			grade = 'A';
			if (score >= 98) { 	      // 90점 이상 중에서도 98점 이상은 A+
				opt = '+';	
			} else if (score < 94) {  // 90점 이상 94점 미만은 A-
				opt = '-';
			}
		} else if (score >= 80){	  // score가 80점 보다 같거나 크면 B학점(grade)
			grade = 'B';
			if (score >= 88) {
				opt = '+';
			} else if (score < 84)	{
				opt = '-';
			}
		} else {				      // 나머지는 C학점(grade)
			grade = 'C';
		}
			
		System.out.printf("당신의 학점은 %c%c입니다.%n", grade, opt);
	}
}
