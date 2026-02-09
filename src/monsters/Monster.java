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

public abstract class Monster {

    // Class Variables
    private String name;
    private Eyes eyes;
    private int age;
    private double height;
    private Specialpower specialpower;
    private Dangerlevel dangerlevel;


    // Getters / Setters
    public Monster(String name,
                   Eyes eyes,
                   int age,
                   double height,
                   Specialpower specialpower,
                   Dangerlevel dangerlevel) {
        this.name = name;
        this.eyes = eyes;
        this.age = age;
        this.height = height;
        this.specialpower = specialpower;
        this.dangerlevel = dangerlevel;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Eyes getEyes() {
        return eyes;
    }

    public void setEyes(Eyes eyes) {
        this.eyes = eyes;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    public Specialpower getSpecialPower() {

        return specialpower;
    }

    public Dangerlevel getDangerlevel() {
        return dangerlevel;
    }


    // Abstract behavior
    public abstract void specialPowers();

    public void DangerLevel() {

    }

    public String getDangerLevel() {
        return "";
    }
}