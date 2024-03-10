import units.*;

public class MyFirstGame {
    public static void main(String[] args) {
        Crossbowman crossbowman = new Crossbowman("Петр", 20);
        Monk monk = new Monk("Адам", 78);
        Peasant peasant = new Peasant("Аркадий", 28);
        Pikeman pikeman = new Pikeman("Павел", 42);
        Robber robber = new Robber("Глеб", 34);
        Sniper sniper = new Sniper("Олег", 25);
        Wizard wizard = new Wizard("Константин", 50);

        System.out.println(robber);
        System.out.println(peasant);
        System.out.println(crossbowman);
        System.out.println(monk);
        System.out.println(wizard);
        System.out.println(pikeman);
        System.out.println(sniper);

    }
}
