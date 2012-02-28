package creationals.factory;

public class FactoryTest {

	public static void factoryTest(){
		ChildA ca = (ChildA) Factory.newChildA();
		ChildB cb = (ChildB) Factory.newChildB();
		
		ca.print();
		cb.print();
		
		ca.methodA(7);
		cb.methodB("hola");
		
		System.out.println("\n***********************\n");
	}
	public static void serviceLocatorTest(){
		ServiceLocator sl = new ServiceLocator();
		
		ChildA ca = (ChildA) sl.create("ChildA");
		ChildB cb = (ChildB) sl.create("ChildB");
		
		ca.print();
		cb.print();
		
		ca.methodA(7);
		cb.methodB("hola");
	}
	public static void main(String[] args) {
		
		factoryTest();
		serviceLocatorTest();
	}

}
