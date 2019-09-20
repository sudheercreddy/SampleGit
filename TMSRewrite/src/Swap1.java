
public class Swap1 {
		static int  x=10;
		static int y =20;
		
		public 	void swappwe(int x ,int y){
			int temp =x;
			x=y;
			y=temp;
			System.out.println("The value of x is --"+"Call by value"+ x);
			System.out.println("thw value of y is ----"+"Call by value"+ y);
		}
		public static void swapRef(Swap1 s1){
			int temp =x;
			x=y;
			y=temp;
			System.out.println("The value of x is --"+"Call by REf-----"+ x);
			System.out.println("thw value of y is ----"+"Call by REf----"+ y);
		}

	public static void main(String[] args) {
		
		Swap1 sw1= new Swap1();
		System.out.println(x);
		System.out.println(y);
		sw1.swappwe(100, 200);
		swapRef(sw1);

	}

}
