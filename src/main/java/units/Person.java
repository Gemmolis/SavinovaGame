package units;

public abstract class Person {
    protected String name;
    protected int health;
    protected int power;
    protected int age;
    protected int armor;
    protected String weapon;
    protected int endurance; // выносливость
    protected int gold;
    protected String className;
    protected Position position;


    public  Person (String name, int health, int power, int age, int armor, int endurance, String weapon, int gold, String className, int x, int y) {
        this.name = name;
        this.health = health;
        this.power = power;
        this.age = age;
        this.armor = armor;
        this.weapon = weapon;
        this.endurance = endurance;
        this.gold = gold;
        this.className = className;
        this.position = new Position(x, y);

    }

    @Override
    public String toString(){
        return (className + " >>> " +  name + " (" + age + ") " + position.x + ":" + position.y );

    }
   // public nearestEnemy()
}
// public void attack(Person person){
//     person.health-=this.power;
// }
// public void heal(int val){
//     this.health += val;
// }

