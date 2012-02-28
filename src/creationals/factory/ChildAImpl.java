package creationals.factory;

public class ChildAImpl implements ChildA{

	public void print() {

		System.out.println("Child A");
	}

	public void methodA(int aNumber){
		System.out.println("I've received " + aNumber);
	}
}
