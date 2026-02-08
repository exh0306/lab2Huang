package monsters;

public class Ghost extends Monster {

    public Ghost(String name, Eyes eyes, Specialpower specialpower) {
        super(name, eyes, specialpower);
    }

    @Override
    public void specialPowers() {
        System.out.println("The ghost appears.");
    }
}
