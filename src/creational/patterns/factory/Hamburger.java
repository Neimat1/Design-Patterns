package creational.patterns.factory;

public abstract class Hamburger {
    private String name;
    private   String sauce;
    private String buns;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public String getBuns() {
        return buns;
    }

    public void setBuns(String buns) {
        this.buns = buns;
    }

    void prepare(){
        System.out.println("Preparing :" + name);
        System.out.println("Adding Sauce... " +sauce );
        System.out.println("Adding buns..." + buns);
        System.out.println("--------------------------------------");
    }
    void cook(){
        System.out.println("Cooking...");
        System.out.println("--------------------------------------");

    }
    void box(){
        System.out.println("Boxing...");
        System.out.println("--------------------------------------");

    }
}
