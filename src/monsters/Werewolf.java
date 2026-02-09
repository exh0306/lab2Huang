package monsters;

public class Werewolf extends Monster {

    public Werewolf(String name, Eyes eyes, int age, double height, Specialpower specialpower, Dangerlevel dangerlevel) {
        super(name, eyes, age, height, specialpower, dangerlevel );
    }

    @Override
   public void specialPowers() {
        System.out.println(getName() + " uses " + getSpecialPower());
        System.out.println("The werewolf howls at  the moon and prepare to hunt! ");
    }
}
