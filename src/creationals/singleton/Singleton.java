package creationals.singleton;

public class Singleton {

	private static Singleton instance;
	
	private Singleton() {
		super();
	}
	
	public static Singleton getInstance(){
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	
	public void doSomething() {
		System.out.println("Hi!");
	}
}
