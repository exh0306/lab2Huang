/**

 * Project: Lab 2
 * Purpose Details: Monsters
 * Course : IST 242
 * Author: Emlety Huang
 * Date Developed: 2/4/26
 * Last Date Changed: 2/8/26
 * Revision: 2/8/26
 *
 */

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
