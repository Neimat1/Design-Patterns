package behavioral.patterns.command;

public class RightCommand implements Command {
    CharacterReceiver characterReceiver;

    public RightCommand(CharacterReceiver marioCharacterReceiver) {
        this.characterReceiver = marioCharacterReceiver;
    }

    @Override
    public void execute() {
        characterReceiver.moveRight();

    }
}
