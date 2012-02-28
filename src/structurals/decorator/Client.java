package structurals.decorator;

public class Client {

	public static void main(String[] args) {
		Component comp = new ComponentImpl();
		Decorator decorator = new ConcreteDecorator(comp);
		decorator.doStuff();

	}
}