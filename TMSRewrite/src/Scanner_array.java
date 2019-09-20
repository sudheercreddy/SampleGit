import java.util.Scanner;


public class Scanner_array {

	public static void main(String[] args) {
		Scanner sc1= new Scanner(System.in);
		
		int a1= sc1.nextInt();
		int a2= sc1.nextInt();
		int a3= sc1.nextInt();
		int a4= sc1.nextInt();
		int a5= sc1.nextInt();
//		if(a==0){
//		System.out.println("Awesome");	
//		}else{
//			System.out.println("i am out ");
//		}
		int aa[]  = new int[5];
		aa[0]=a1;
		aa[1]=a2;
		aa[2]=a3;
		aa[3]=a4;
		aa[4]=a5;
			for(int i =aa.length-1;i>=0;i--){
				System.out.println(aa[i]);
	
			}
	}
}
