package monsters;

public class Dragon extends Monster {

    public Dragon(String name, Eyes eyes, int age, double height, Specialpower specialpower, Dangerlevel dangerlevel) {
        super(name, eyes,age, height, specialpower, dangerlevel);
    }

    @Override
    public void specialPowers() {
        System.out.println(getName() + " uses " + getSpecialPower());
        System.out.println("The dragon takes flight!");
    }


}
