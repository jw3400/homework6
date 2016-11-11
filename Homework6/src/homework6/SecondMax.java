package homework6;

import java.util.*;

public class SecondMax {

	public void question1() {
		
		System.out.println("10개의 숫자를 입력받아 배열에 저장하고");
		System.out.println("두 번째로 큰 수를 출력하기");
		System.out.println("=========================");
		
		Scanner su = new Scanner(System.in);
		String [] num = new String[10];
		int  index;

		int i = 0;
			while ( i<num.length) 
			{
				System.out.print((i+1)+"번째 수를 입력하시오 : ");
				num[i] = su.nextLine();
	
				if(!num[i].matches("^[0-9]*$"))		
				{
					System.out.println("양수만 입력가능합니다. 다시 입력하십시오");
					continue;
				}
				i = i+1;
			}
			
			int [] num2 = new int[num.length];
			for(int j=0; j<num.length; j++)
			{
				num2[j] = Integer.parseInt(num[j]);
			}
			
			int one_max, two_max;

			if(num2[0] <= num2[1]) 
			{
				one_max = num2[1];
				two_max = num2[0];
				index = 0;
			}
			else 
			{
				one_max = num2[0];
				two_max = num2[1];
				index = 1;
			}
			for(int j=2; j<num.length; j++ )
			{
				if(one_max < num2[j])
				{
					two_max = one_max;
					one_max = num2[j];
					index = j;
				}
				else if(one_max > num2[j] && two_max < num2[j] )
				{
					two_max  = num2[j];
					index= j;
				}
			}
		System.out.println("두번째로 큰 수는 " + index + "번째 수 " + two_max + "입니다.");
		
		su.close();
		System.exit(0);
		
	}
}
