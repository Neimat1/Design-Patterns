package behavioral.patterns.command;

public class UpCommand implements Command{
    private CharacterReceiver characterReceiver;

    public UpCommand(CharacterReceiver marioCharacterReceiver) {
        this.characterReceiver = marioCharacterReceiver;
    }

    @Override
    public void execute() {
        characterReceiver.moveUp();
    }
}
