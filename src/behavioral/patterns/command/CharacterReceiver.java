package behavioral.patterns.command;

public class CharacterReceiver {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void moveUp(){
        System.out.println(getName() + " moves up !");
    }

    public void moveDown(){
        System.out.println(getName() + " moves down!");
    }


    public void moveLeft(){
        System.out.println(getName() + " moves left !");
    }

    public void moveRight(){
        System.out.println(getName() + " moves right !");
    }

}
