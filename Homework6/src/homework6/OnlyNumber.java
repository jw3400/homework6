package homework6;

import java.util.*;

public class OnlyNumber {

	public void question5() {
		
		System.out.println("중복된 숫자 허용하지 않기");
		System.out.println("=====================================");
		System.out.println("1~100사이의 숫자를 입력하세요.");
		
		Scanner su = new Scanner(System.in);
		int [] num = new int [10];
		String input = null;
		boolean check=false;
		
		int i = 1;
		while(true)
		{
			if(i<10)
			{
				System.out.print(i+"번째 숫자 입력 : ");
				input = su.nextLine();
				i++;
								
				if(!input.matches("^[0-9]*$"))		
				{
					System.out.println("양수만 입력가능합니다. 다시 입력하십시오");						
					continue;
				}					
			
				if(Integer.parseInt(input)<1 || Integer.parseInt(input)>100)
				{
					System.out.println("1~100까지의 숫자만 입력할 수 있습니다. 다시 입력하십시오.");
					continue;
				}		
			
				num[i-1] = Integer.parseInt(input);
			
				for(int j=0; j<i-1; j++)
				{
					if(num[i-1] == num[j])
					{
						System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
						check = true;
						break;
					}	
				}
				
				if(check==false)
					continue;
				
				
			}
		
		
		System.out.println("===================================");			
			for(int j=9; j>=0; j--)
			{
				System.out.println((j+1)+" 번째 숫자는  " +num[j]+"입니다." );
			}
		su.close();	
		System.exit(0);	
		}		
		
	}
}
