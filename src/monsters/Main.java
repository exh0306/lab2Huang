package monsters;

public class Main {
    public static void main(String[] args) {
        Monster mon1 = new Dragon("Toothless");
        Monster mon2 = new Ghost("Casper");

        System.out.println("Monster 1:" + mon1.getName());
        System.out.println("Monster 2:" + mon2.getName());
    }

}
