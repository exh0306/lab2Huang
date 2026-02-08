package monsters;

public abstract class Monster {

    // Class Variables
    private String name;
    private Eyes eyes;

    // Getters / Setters
    public Monster(String name, Eyes eyes, Specialpower specialpower) {
        this.name = name;
        this.eyes = eyes;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Eyes getEyes() {return eyes;}

    public void setEyes(Eyes eyes) {this.eyes = eyes;}


    // Abstract behavior
    public abstract void specialPowers();


}
