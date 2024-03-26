public class Main {
    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        Wizard wizard = new Wizard();
        System.out.print("Warrior attack wizard - ");
        System.out.println(warrior.getDamagePoints(wizard));
        System.out.print("Wizard attack warrior - ");
        System.out.println(wizard.getDamagePoints(warrior));
        System.out.print("Warrior attack wizard - ");
        System.out.println(warrior.getDamagePoints(wizard));
        System.out.println("Wizard prepare spell");
        wizard.prepareSpell();
        System.out.print("Wizard attack warrior - ");
        System.out.println(wizard.getDamagePoints(warrior));
    }
}
