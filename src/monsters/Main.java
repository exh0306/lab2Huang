/**

 * Project: Lab 2
 * Purpose Details: Monsters
 * Course : IST 242
 * Author: Emlety Huang
 * Date Developed: 2/4/26
 * Last Date Changed: 2/7/36
 * Revision:
 *
 */

package monsters;

public class Main {
    public static void main(String[] args) {

        Monster mon1 = new Dragon("Toothless", Eyes.TWO, Specialpower.PLASMA_BLASTS);
        Monster mon2 = new Dragon("Haku", Eyes.THREE, Specialpower.SHAPE_SHIFTING);
        Monster mon3 = new Ghost("Casper", Eyes.TWO, Specialpower.INVISIBILITY);
        Monster mon4 = new Werewolf("Wayne", Eyes.TWO, Specialpower.SUPER_SPEED);
        Monster mon5 = new Werewolf("Jacob", Eyes.TWO, Specialpower.SHAPE_SHIFTING);

        System.out.println("Monster 1 name:" + mon1.getName());
        System.out.println("Monster 1 eyes count:" + mon1.getEyes());


        System.out.println("Monster 2 name:" + mon2.getName());

        System.out.println("Monster 3 name:" + mon3.getName());

        System.out.println("Monster 4 name:" + mon4.getName());

        System.out.println("Monster 5 name:" + mon5.getName());
    }

}
