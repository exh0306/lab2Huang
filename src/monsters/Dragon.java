package monsters;

public class Dragon extends Monster {

    public Dragon(String name, Eyes eyes, int age, double height, Specialpower specialpower, Dangerlevel dangerlevel,
                  String scaleColor) {
        super(name, eyes,age, height, specialpower, dangerlevel);
        this.scaleColor = scaleColor;
    }

    private String scaleColor;
    public String getScaleColor() {
        return scaleColor;
    }

    public void getScaleColor(String scaleColor) {
        this.scaleColor = scaleColor;
    }

    public void setScaleColor(String scaleColor) {}
    @Override
    public void specialPowers() {
        System.out.println(getName() + " uses " + getSpecialPower());
        System.out.println("The dragon takes flight!");
    }


}
