
interface Weapon {
    String getName();
    void attack();
}

class Sword implements Weapon {
    @Override
    public String getName() {
        return "Sword";
    }
// this is a new line to test on merging in github
    @Override
    public void attack() {
        System.out.println("Swing swing ziiinggg!");
    }
}

abstract class Cat {
    protected double size;
    protected String attire;
    protected boolean isBehaved;

    public Cat(double size, String attire, boolean isBehaved) {
        this.size = size;
        this.attire = attire;
        this.isBehaved = isBehaved;
    }

    public abstract void sound();
}
class Cat2 extends Cat {

    private final Weapon weapon; // mandatory

    public Cat2(double size, String attire, boolean isBehaved, Weapon weapon) {
        super(size, attire, isBehaved);
        this.weapon = weapon;
    }

    public void attack() {
        System.out.println("Cat attacks with " + weapon.getName());
        weapon.attack();
    }

    @Override
    public void sound() {
        System.out.println("Ngaung");
    }
}


public class Main {
    public static void main(String[] args) {

        Cat2 redCat = new Cat2(1.0, "Red hat", false, new Sword());

        redCat.sound();
        redCat.attack();

        redCat.attack();
    }
}