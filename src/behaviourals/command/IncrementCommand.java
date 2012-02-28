package behaviourals.command;

public class IncrementCommand implements Command {

	Receiver receiver = new Receiver();
	
	public IncrementCommand(Receiver receiver) {
		super();
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		receiver.increment();
	}

	@Override
	public void undo() {
		receiver.decrement();
	}

}
