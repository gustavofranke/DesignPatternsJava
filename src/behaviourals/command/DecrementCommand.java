package behaviourals.command;

public class DecrementCommand implements Command {

	Receiver receiver = new Receiver();

	public DecrementCommand(Receiver receiver) {
		super();
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		receiver.decrement();
	}

	@Override
	public void undo() {
		receiver.increment();
	}

}
