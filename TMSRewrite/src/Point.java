
public class Point {
	int x;
	int y;
	public static void main(String[] args) {
		Point p1= new Point();
		p1.x=100;
		p1.y=200;
		swap(p1.x,p1.y);
		System.out.println(p1.x  +"  + " +p1.y);
		swapq(p1);
		System.out.println(p1.x  +"  + " +p1.y);
	}
    public static void swap(int a, int b){
    	int temp = 0;
    	a=b;
    	b=temp;
    }
    public static void swapq(Point p){
    	int temp = p.x;
    	p.x=p.y;
    	p.y=temp;
    }
}
