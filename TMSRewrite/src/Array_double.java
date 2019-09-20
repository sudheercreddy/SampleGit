
public class Array_double {

	public static void main(String[] args) {
		
		int arraydouble[][]= new int[3][3];
		arraydouble[0][0]=11;
		arraydouble[0][1]=22;
		arraydouble[0][2]=33;
		arraydouble[1][0]=44;
		arraydouble[1][1]=55;
		arraydouble[1][2]=66;
		arraydouble[2][0]=77;
		arraydouble[2][1]=88;
		arraydouble[2][2]=99;
		//no of rows
		System.out.println("no of rows  -"+arraydouble.length);
		// no of columns
		System.out.println(("no of columns  -"   +  arraydouble[0].length));
		for(int i =0; i<arraydouble.length;i++){
			for(int j =0; j<=(arraydouble.length)-1;j++)
			System.out.println("Row and column is "+ arraydouble[i][j]);
		}

	}

}
