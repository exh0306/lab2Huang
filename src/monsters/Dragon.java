package monsters;

public class Dragon extends Monster {

    public Dragon(String name, Eyes eyes, Specialpower specialpower, Dangerlevel dangerlevel) {
        super(name, eyes, specialpower, dangerlevel);
    }

    @Override
    public void specialPowers() {
        System.out.println(getName() + " uses " + getSpecialPower());
        System.out.println("The dragon takes flight!");
    }


}
