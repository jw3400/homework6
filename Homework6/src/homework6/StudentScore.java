package homework6;

import java.util.*;

public class StudentScore {

	public void question3() {
		
		System.out.println("5명의 국어, 영어, 수학 점수의 과목별 총점 및 평균구하기");
		System.out.println("=====================================");
		
		Scanner su = new Scanner(System.in);
		String [] grade =  new String[3];
		double [][] subject = new double [7][3];
		String num = null;
		
		int i=1;
		while(true){
			
			System.out.print(i+"번  학생 국어, 영어, 수학 점수 입력 : ");
		    num = su.nextLine();
		    
		    grade = num.split(" ");
		       
		    if(Double.parseDouble(grade[0])<0 || Double.parseDouble(grade[0])>100)
		    {
		    	System.out.println("국어 점수를 다시 입력하십시오(0~100점까지 가능)");
		    	continue;
		    }
		    
		    if(Double.parseDouble(grade[1])<0 || Double.parseDouble(grade[1])>100)
		    {
		    	System.out.println("영어 점수를 다시 입력하십시오(0~100점까지 가능)");
		    	continue;
		    }
		    
		    if(Double.parseDouble(grade[2])<0 || Double.parseDouble(grade[2])>100)
		    {
		    	System.out.println("수학 점수를 다시 입력하십시오(0~100점까지 가능)");
		    	continue;
		    }
		    		    
					subject[i-1][0] = Double.parseDouble(grade[0]); 
					subject[i-1][1] = Double.parseDouble(grade[1]);
					subject[i-1][2] = Double.parseDouble(grade[2]);

					i++;
		    
		    if(i>5)
		    {
		    	for(int j=0; j<subject.length-2; j++)
		    	{    			
		    		for(int k=0; k<subject[j].length; k++)
		    		{
		    		   subject[5][k] += subject[j][k];
		    		   subject[6][k] = subject[5][k] / 5;		    		   
		    		}
		    	}	    	
		    	break;
		    }
		}
		System.out.println("국어 총점은 " + String.format("%.0f" ,subject[5][0]) + "점이고, 평균은" + String.format("%.1f" ,subject[6][0]) + "점 입니다.");
		System.out.println("영어 총점은 " + String.format("%.0f" ,subject[5][1]) + "점이고, 평균은" + String.format("%.1f" ,subject[6][1]) + "점 입니다.");
		System.out.println("수학 총점은 " + String.format("%.0f" ,subject[5][2]) + "점이고, 평균은" + String.format("%.1f" ,subject[6][2]) + "점 입니다.");
		
    	
    	 for(int j=0; j<subject.length-2; j++)
    	{
    		int per_sum = 0;
    		double per_avg = 0;
    		for(int k=0; k<subject[j].length; k++)
    		{
    			per_sum += subject[j][k];
    			per_avg = per_sum / 3;
    		}
    		System.out.println((j+1)+"번 학생의 총점은 " + String.format("%.0f",per_sum) + "점, 평균은 " +  String.format("%.1f" ,per_avg) +"점 입니다." );
    	} 

		su.close();
		System.exit(0);

	}
	
}
