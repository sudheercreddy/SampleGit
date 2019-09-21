package InheritancePrac;

public abstract class Aclass implements InterfaceB {

	@Override
	public void aMethod() {
		System.out.println("I am from aMethod@Aclass");
		
	}

	@Override
	public void bMethod() {
		System.out.println("I am from bMethod@Aclass");
		
	}


}
