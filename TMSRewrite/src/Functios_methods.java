
public class Functios_methods {
public static void abc(){
	System.out.println("abcd");
}

public int sumAll(int a , int b,int c){
	int sum = a+b+c;
	return sum;
}
	
	public static void main (String[]args){
		Functios_methods functios_methods= new Functios_methods();
		functios_methods.abc();
		int z=functios_methods.sumAll(12, 13, 14);
		if (z<10){
			System.out.println("It is less than 10 " + "Orginal is " + z);
		}else{
			System.out.println("Greater than 10");
		}
		
	}
}
