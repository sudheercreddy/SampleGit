
public class Exericise_random {
public static void main(String[]args){
	//System.out.println(Math.random()*10);
	Exericise_random exericise_random= new Exericise_random();
	double d= Math.random()*100;
	int randomnumber= (int)d;
	exericise_random.random_Num(10);
	//	System.out.println(randomnumber);
	//exericise_random.random_Num(10000);
}
public int random_Num(int n){
	double d= Math.random()*100*n;
	int randomnumber= (int)d;
		System.out.println(randomnumber);
	return randomnumber;
	
}
}
