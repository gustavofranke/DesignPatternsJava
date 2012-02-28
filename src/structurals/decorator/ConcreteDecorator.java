package structurals.decorator;

public class ConcreteDecorator implements Decorator {

	Component component;

	public ConcreteDecorator(Component component) {
		super();
		this.component = component;
	}

	@Override
	public void addedBehavior() {
		System.out.println("Decorator does some stuff too");

	}

	@Override
	public void doStuff() {
		component.doStuff();
		addedBehavior();

	}

}
