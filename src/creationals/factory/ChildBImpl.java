package creationals.factory;

public class ChildBImpl implements ChildB{

	public void print() {

		System.out.println("Child B");
	}
	
	public void methodB(String aString){
		System.out.println("i've received " + aString);
	}
}
