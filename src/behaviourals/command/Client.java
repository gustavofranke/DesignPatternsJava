package behaviourals.command;

public class Client {
	public static void main(String[] args) {
		Receiver rec = new Receiver();
		Command incCommand = new IncrementCommand(rec);
		Command decCommand = new DecrementCommand(rec);
		Invoker invoker = new Invoker();
		invoker.setDecCommand(decCommand);
		invoker.setIncCommand(incCommand);
		invoker.addRequest();
		invoker.addRequest();
		invoker.removeRequest();
		System.out.println(rec.getValue());
	}
}
