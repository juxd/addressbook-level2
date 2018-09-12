package seedu.addressbook.commands;

public class SortCommand extends Command{
    public static final String COMMAND_WORD = "sort";

    public static final String MESSAGE_USAGE = COMMAND_WORD
            + "Sorts the list of users by name.\n"
            + "Example: " + COMMAND_WORD;

    public SortCommand();
}
