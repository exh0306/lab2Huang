package monsters;

public class Werewolf extends Monster {
    public Werewolf(String name) {
        super(name);
    }

    public Werewolf(String wayne, Eyes eyes, Specialpower specialpower) {
        super();
    }

    @Override
    public Specialpower getSpecialPower() {
        return null;
    }
}
