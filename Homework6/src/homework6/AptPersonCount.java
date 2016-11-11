package homework6;

import java.util.*;

public class AptPersonCount {

	public void question4() {
		
		System.out.println("5층 아파트의 거주자 인원 파악하기");
		System.out.println("=====================================");
		
		Scanner su = new Scanner(System.in);
		String apt [][] = new String [5][3];
		
		String input = null;
		int total = 0;
		
		while (true) 
		{
			for(int i=0; i<apt.length; i++)
			{
				int j=0;
				while(j<apt[i].length)
				{				
					System.out.print((i+1)+"0"+(j+1)+"호에 살고 있는 인원 수 :  ");
					input = su.next();
					apt[i][j] = input;
					
					if(!input.matches("^[0-9]*$"))		
					{
						System.out.println("양수만 입력가능합니다. 다시 입력하십시오");						
						continue;
					}					
					j++;			
				}			
			}
			
			int [][] apt2 = new int[5][3];
			int [] floor = new int [5];
			int [] ho = new int [3];
			for(int i=0; i<apt.length; i++)
			{
				for(int j=0; j<apt[i].length; j++)
				{
					apt2[i][j] = Integer.parseInt(apt[i][j]);
					total += apt2[i][j];		
				}
			}		
			System.out.println("===================================");
			System.out.println("이 아파트의 거주자는 모두 " + total + "명입니다." );
			
			for(int i=0; i<apt2.length; i++)
			{
				for(int j=0; j<apt2[i].length; j++)
				{
					floor[i] += apt2[i][j];
					ho[j] += apt2[i][j];
				}
			}
			
			System.out.println("===================================");			
			for(int i=0; i<floor.length; i++)
			{
				System.out.println((i+1)+"층에 사는 거주자는 모두 " +floor[i]+"명 입니다." );
			}
			
			System.out.println("===================================");			
			for(int j=0; j<ho.length; j++)
			{
				System.out.println((j+1)+"호 라인에 사는 거주자는 모두 " +ho[j]+"명 입니다." );
			}
		
			
		su.close();
		System.exit(0);
		}
		
		
	}
}
