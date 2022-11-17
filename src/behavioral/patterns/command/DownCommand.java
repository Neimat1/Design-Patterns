package behavioral.patterns.command;

public class DownCommand implements  Command{
    CharacterReceiver characterReceiver;

    public DownCommand(CharacterReceiver marioCharacterReceiver) {
        this.characterReceiver = marioCharacterReceiver;
    }

    @Override
    public void execute() {
        characterReceiver.moveDown();

    }
}
