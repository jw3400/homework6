package homework6;

import java.util.*;

public class AptPersonCount {

	public void question4() {
		
		System.out.println("5층 아파트의 거주자 인원 파악하기");
		System.out.println("=====================================");
		
		Scanner su = new Scanner(System.in);
		String apt [][] = new String [5][3];
		
		String input = null;
		
		while (true) 
		{
			for(int i=0; i<apt.length; i++)
			{
				for(int j=0; j<apt[i].length; j++)
				{
					System.out.print((i+1)+0+(j+1) +"호에 살고 있는 사람의 숫자 :  ");
					input = su.nextLine();
					
					if(!input.matches("^[0-9]*$"))		
					{
						System.out.println("양수만 입력가능합니다. 다시 입력하십시오");
						continue;
					}
					
				}
			}
			
			int apt2 [][]= new int [apt.length][apt.length];
			for(int i=0; i<apt.length; i++)
			{
				for(int j=0; j<apt[i].length; j++)
				{
					apt2[i][j] = Integer.parseInt(apt[i][j]);
				}
			}

		su.close();
		System.exit(0);
		}
		
	}
}
