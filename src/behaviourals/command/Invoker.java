package behaviourals.command;

import java.util.Stack;

public class Invoker {

	Stack<Command> commands;
	Command incCommand;
	Command decCommand;
	public Invoker() {
		super();
		commands = new Stack<Command>();
	}
	public void setIncCommand(Command incCommand) {
		this.incCommand = incCommand;
	}
	public void setDecCommand(Command decCommand) {
		this.decCommand = decCommand;
	}
	
	public void addRequest() {
		incCommand.execute();
		commands.add(incCommand);
	}

	public void removeRequest() {
		decCommand.execute();
		commands.add(decCommand);
	}
}
