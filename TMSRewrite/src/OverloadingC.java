
public class OverloadingC {
	String name;
	int fuelQuantity;
	
	public OverloadingC(){
		System.out.println("Inside the Overloaded default constructor");
	}
	public OverloadingC(int fuelQuantity,String name){
		this.fuelQuantity=fuelQuantity;
		this.name=name;
		System.out.println(fuelQuantity);
		System.out.println(name);
	}
	public OverloadingC(int quantity){
		fuelQuantity=fuelQuantity+quantity;
	}

	public static void main(String[] args) {
		OverloadingC c= new OverloadingC();
		OverloadingC c1= new OverloadingC(10, "BMW");
		System.out.println(c1.fuelQuantity);
		System.out.println(c1.name);
		OverloadingC c2= new OverloadingC(15);
		System.out.println(c2.fuelQuantity);
	}


}
