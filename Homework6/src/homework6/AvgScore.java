package homework6;

import java.util.*;

public class AvgScore {

	public void question2() {
		
		System.out.println("심사 점수 계산하기");
		System.out.println("=========================");
		
		Scanner su = new Scanner(System.in);
		String [] num = new String[10];
		
		int i = 0;
			while( i<num.length) 
			{
				System.out.print((i+1)+"번 심사 점수 입력 : ");
				num[i] = su.nextLine();
				
				if(!num[i].matches("^[0-9]+(.[0-9]{1,2})*$"))		
				{
					System.out.println("양수를 입력하셔야 합니다. 다시 입력하십시오");
					continue;
				}
				i = i +1;
			}
			
			double [] num2 = new double[num.length];
			for(int j=0; j<num.length; j++)
			{
				num2[j] = Double.valueOf(num[j]);
			}
			
			double tmp;
			for(int l=0; l<num.length; l++)
			{
				for(int j=0; j<num.length-1; j++)
				{
					if(num2[j] > num2[j+1]) 
					{
							tmp = num2[j];
							num2[j] = num2[j+1];
							num2[j+1] = tmp;
					}
				}
			}
			double max_num = num2[num2.length-1];		//가장 큰 수(max_num)는 num배열의 맨 처음에 존재(num[0])
			double min_num = num2[0];										//가장 작은 수(max_num)는 num배열의 맨 마지막 에 존재
																												//(배열의 길이가 10이면  num[9]에 존재)
			System.out.println("가장 큰 점수는 " + max_num + "이고, 가장 작은 점수는 " + min_num + "입니다.");
			System.out.println("=========================");

			
			double etc_num=0;
			double avg = 0; 
			for(int j=1; j<num2.length-1; j++)		//가장 큰 수(max_num)과 가장 작은 수(min_num)을 제외한 나머지 수들을 조사
			{
				etc_num += num2[j];
				avg = Double.parseDouble(String.format("%.1f", etc_num / 8)) ;
			}
			System.out.println("가장 큰 점수와 가장 작은 점수를 제외한");
			System.out.println("8개의 점수 평균은 " + avg +" 입니다.");
			
			su.close();
			System.exit(0);
	}
	
}
