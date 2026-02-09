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

public class Ghost extends Monster {

    public Ghost(String name, Eyes eyes, int age, double height, Specialpower specialpower, Dangerlevel dangerlevel) {
        super(name, eyes, age, height, specialpower, dangerlevel);
    }

    @Override
    public void specialPowers() {
        System.out.println(getName() + " uses " + getSpecialPower());
        System.out.println("The ghost floats through walls and haunts the area!");
    }
}
