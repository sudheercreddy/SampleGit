
public class arrayDoubleEx {

	public static void main(String[]args){
		Object student[][]= new Object[4][4];
		student[0][0]="sudheer";
	    student[0][1]="Reddy";
	    student[0][2]="Kumar";
	    student[0][3]="Chittireddy";
	    
	    student[2][0]="Bindu";
	    student[2][1]="Reddy";
	    student[2][2]="Kumari";
	    student[2][3]="Chittireddy";
	    
	    student[3][0]="Kewl";
	    student[3][1]="Reddy";
	    student[3][2]="Kumar";
	    student[3][3]="Chittireddy";
	    
	    student[1][0]="Stella";
	    student[1][1]="Reddy";
	    student[1][2]="Kumari";
	    student[1][3]="Chittireddy";
				
	    for (int i=0 ;i<student.length;i++)
	    {
	    	for (int j=0 ;j<student.length;j++){
	    		
	    		if (student[i][j]=="Chittireddy")
	    		System.out.println("He is fail");
	    		
	    	}
	    	
	    }
	}
}
