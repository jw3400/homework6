package homework6;

import java.util.*;

public class ExamVariousArray {

	public static void main(String[] args) {
		
		System.out.println("****************************************");
		System.out.println("****************배열 사용하기****************");
		System.out.println("****************************************");
		System.out.println("  1.두 번째로 큰 수 찾기");
		System.out.println("  2.심사 점수 계산");
		System.out.println("  3.학생 총점, 평균값 구하기");
		System.out.println("  4.5층 아파트의 거주자 숫자 구하기");
		System.out.println("  5.겹치지 않는 숫자 10개 입력받기");
		System.out.println("  6.종료하기");
		
		new ExamVariousArray().input();
	}
	
	public void input() {
	while(true) {
		Scanner su = new Scanner(System.in);
		String select = su.nextLine();
		
		if(!select.matches("^[0-9]*$"))		//숫자가 아닌 다른 것을 입력하였을 때의 정규표현식 사용
		{
			System.out.println("숫자를 입력하셔야 합니다. 다시 입력하십시오.");
			continue;
		}
		
		int num = Integer.parseInt(select);
		
		switch(num) {
		case 1:			
			new SecondMax().question1();			
			break;
			
		case 2:
			new AvgScore().question2();
			break;
			
		case 3:
			new StudentScore().question3();
			break;
			
		case 4:
			new AptPersonCount().question4();
			break;
			
		case 5:
			new OnlyNumber().question5();
			break;
			
		case 6:
			System.exit(0);
			
		default:
			System.out.println("0~6 사이에 입력하셔야 합니다. 다시 입력하십시오.");
			
		}
		
		su.close();	
		}
				
	}

}
