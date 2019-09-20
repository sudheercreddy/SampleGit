
public class TwoDomensionalArray {

	public static void main(String[] args) {
		String[][] x= new String[3][4];
		x[0][0]="Sudheer";
		x[0][1]="kumar";
		x[0][2]="reddy";
		x[0][3]="pullama";
		x[1][0]="yellama";
		x[1][1]="america";
		x[1][2]="london";
		x[1][3]="astralia";
		x[2][0]="sydney";
		x[2][1]="reddy";
		x[2][2]="yeddy";
		x[2][3]="rkumar";
		
		// no of rows 
		System.out.println("no of rows : "+x.length);
		//no of columns are 
		System.out.println("no of columns are   "+x[0].length);
		
		for(int i=0;i<x.length;i++){
			for(int j=0;j<x[0].length;j++)
				System.out.print("["+ x[i][j]+"]"+"---");
			System.out.println();
		}
		
		}
}
