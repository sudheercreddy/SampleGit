
public class ObjectArray {

	public static void main(String[] args) {
		Object[][] ary1= new Object[3][3];
		
		//No of rows
		int row=ary1.length;
		int colmn=ary1[0].length;
		//System.out.println(ary1.length);
		//no of columns
        //System.out.println(ary1[0].length);
        ary1[0][0]="Sudheer";
        ary1[0][1]=300000;
        ary1[0][2]="usa";
        
        ary1[1][0]="suresh";
        ary1[1][1]=50000;
        ary1[1][2]="India";
        
        ary1[2][0]="Sunil";
        ary1[2][1]=300000;
        ary1[2][2]="Australia";
        
        		for(int i=0;i<row;i++){
        			for(int j=0;j<colmn;j++)
        				System.out.print(ary1[i][j]+ "  ");
        			System.out.println();
        		}
        
	}

}
