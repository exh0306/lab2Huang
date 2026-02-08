package monsters;

public class Werewolf extends Monster {

    public Werewolf(String name, Eyes eyes, Specialpower specialpower) {
        super(name, eyes, specialpower);
    }

    @Override
   public void specialPowers() {
        System.out.println("The werewolf started howling under the full moon.");
   }
}
