package monsters;

public class Ghost extends Monster {

    public Ghost(String name, Eyes eyes, Specialpower specialpower, Dangerlevel dangerlevel) {
        super(name, eyes, specialpower, dangerlevel);
    }

    @Override
    public void specialPowers() {
        System.out.println(getName() + " uses " + getSpecialPower());
        System.out.println("The ghost floats through walls and haunts the area!");
    }
}
