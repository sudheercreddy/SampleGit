
public class ThisB {
	String a="Sudheer";
	String b="chittireddy";
	
	ThisB(String a, String b){
		 System.out.println(a);
		 System.out.println(b);
		 System.out.println(this.a);
		 System.out.println(this.b);
	}
public static void main (String[]args){
	ThisB ThisB= new ThisB("Suresh", "Pellireddy");
}

}
