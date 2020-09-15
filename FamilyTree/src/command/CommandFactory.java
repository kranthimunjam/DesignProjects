package command;

public interface CommandFactory {
	Command getCommand(final String input_command);

}
