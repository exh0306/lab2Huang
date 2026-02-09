/**

 * Project: Lab 2
 * Purpose Details: Monsters
 * Course : IST 242
 * Author: Emlety Huang
 * Date Developed: 2/4/26
 * Last Date Changed: 2/8/26
 * Revision:2/8/26
 *
 */

package monsters;

public class Main {
    public static void main(String[] args) {

        Monster mon1 = new Dragon("Toothless", Eyes.TWO, 30, 6.5, Specialpower.PLASMA_BLASTS, Dangerlevel.HIGH);
        Monster mon2 = new Dragon("Haku", Eyes.THREE, 13, 4.5, Specialpower.SHAPE_SHIFTING, Dangerlevel.MEDIUM);
        Monster mon3 = new Ghost("Casper", Eyes.TWO,12,1.0, Specialpower.INVISIBILITY, Dangerlevel.LOW);
        Monster mon4 = new Werewolf("Wayne", Eyes.TWO,500,6.0, Specialpower.SUPER_SPEED, Dangerlevel.LOW );
        Monster mon5 = new Werewolf("Jacob", Eyes.TWO,25, 6.7, Specialpower.SHAPE_SHIFTING, Dangerlevel.HIGH);

        System.out.println("Monster 1 name:" + mon1.getName());
        System.out.println("Monster 1 eyes count:" + mon1.getEyes());
        System.out.println("Monster 1 age: " + mon1.getAge());
        System.out.println("Monster 1 height: " + mon1.getHeight() + " feet");
        System.out.println("Monster 1 danger level: " + mon1.getDangerlevel());
        mon1.specialPowers();

        System.out.println("Monster 2 name:" + mon2.getName());
        System.out.println("Monster 2 eyes count:" + mon2.getEyes());
        System.out.println("Monster 2 age: " + mon2.getAge());
        System.out.println("Monster 2 height: " + mon2.getHeight() + " feet");
        System.out.println("Monster 2 danger level: " + mon2.getDangerlevel());
        mon2.specialPowers();

        System.out.println("Monster 3 name:" + mon3.getName());
        System.out.println("Monster 3 eyes count:" + mon3.getEyes());
        System.out.println("Monster 3 age: " + mon3.getAge());
        System.out.println("Monster 3 height: " + mon3.getHeight() + " feet");
        System.out.println("Monster 3 danger level: " + mon3.getDangerlevel());
        mon3.specialPowers();

        System.out.println("Monster 4 name:" + mon4.getName());
        System.out.println("Monster 4 eyes count:" + mon4.getEyes());
        System.out.println("Monster 4 age: " + mon4.getAge());
        System.out.println("Monster 4 height: " + mon4.getHeight() + " feet");
        System.out.println("Monster 4 danger level: " + mon4.getDangerlevel());
        mon4.specialPowers();

        System.out.println("Monster 5 name:" + mon5.getName());
        System.out.println("Monster 5 eyes count:" + mon5.getEyes());
        System.out.println("Monster 5 age: " + mon5.getAge());
        System.out.println("Monster 5 height: " + mon5.getHeight() + " feet");
        System.out.println("Monster 5 danger level: " + mon5.getDangerlevel());
        mon5.specialPowers();
    }

}
