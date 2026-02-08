package monsters;

public class Dragon extends Monster {

    public Dragon(String name, Eyes eyes, Specialpower specialpower) {
        super(name, eyes, specialpower);
    }

    @Override
    public void specialPowers() {
        System.out.println("The dragon takes flight");
    }
}
