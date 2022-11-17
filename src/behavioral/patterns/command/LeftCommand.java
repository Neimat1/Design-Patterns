package behavioral.patterns.command;

public class LeftCommand implements Command{
    CharacterReceiver characterReceiver;

    public LeftCommand(CharacterReceiver marioCharacterReceiver) {
        this.characterReceiver = marioCharacterReceiver;
    }

    @Override
    public void execute() {
        characterReceiver.moveLeft();

    }
}
