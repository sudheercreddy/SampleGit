
public class Ran {

	public static void main(String[] args) {
		//System.out.println(Math.random()*10);
//int i=(int) (Math.random()*20);
//System.out.println(i);
		Ran ran=new Ran();
		ran.randomGenerate(89);
	}
public int randomGenerate(int r){
	int i=(int) (Math.random()*r);
	System.out.println(i);
	return i;
	
}
}
