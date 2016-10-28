package homework6;

import java.util.*;

public class SecondMax {

	public void question1() {
		
		System.out.println("10개의 숫자를 입력받아 배열에 저장하고");
		System.out.println("두 번째로 큰 수를 출력하기");
		System.out.println("=========================");
		
		Scanner su = new Scanner(System.in);
		int [] num = new int[10];
			for(int i=1; i<=num.length; i++) 
			{
				System.out.print(i+"번째 수를 입력하시오 : ");
				num[i] = su.nextInt();
			}
		print(num);
		su.close();
		
	}
	
	
	void print(int num[]) {
		int one_max, two_max, temp;
		
	}
}
