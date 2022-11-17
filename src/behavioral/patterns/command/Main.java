package behavioral.patterns.command;

public class Main {
    public static void main(String [] args){
        //Create Receivers
       CharacterReceiver character1 = new CharacterReceiver();
       character1.setName("Mario");

        //Create Commands
        UpCommand character1UpCommand = new UpCommand(character1);
        DownCommand character1DownCommand = new DownCommand(character1);
        LeftCommand character1LeftCommand = new LeftCommand(character1);
        RightCommand character1RightCommand = new RightCommand(character1);


        //Create Invokers
        GameBoy gameBoy1 = new GameBoy(character1UpCommand,character1DownCommand,character1LeftCommand,character1RightCommand);
        gameBoy1.arrowDown();
        gameBoy1.arrowLeft();

    }
}
