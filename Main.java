

abstract class Cat{
    String attire; 
    double size; 
    boolean isBehaved; 

    public Cat(String attire, double size, boolean isBehaved){
        this.attire = attire; 
        this.size = size; 
        this.isBehaved = isBehaved; 
    }

    abstract void sound();
}

class cat1 extends Cat{
    public cat1(String attire, double size, boolean isBehaved){
        super(attire, size, isBehaved);
    }

    @Override
    void sound(){
        System.out.println("Meowww");
    }
}
class cat2 extends Cat{
    Weapon weapon; 
    public cat2(
        String attire, double size, boolean isBehaved,
        Weapon weapon
    )
    {
        super(attire, size, isBehaved);
        this.weapon = weapon;
    }

    @Override
    void sound(){
        System.out.println("Ngaungggg");
    }

    public void attack(){
        System.out.println(
            "Kucing menyerang dengan"
            + weapon.getNama()
        );
        weapon.attack();
    }
}

interface Weapon{
    String getNama(); 
    void attack(); 
}

class lightsaber implements Weapon{
    @Override
    public void attack(){
        System.out.println("swing zing");
    }

    @Override
    public String getNama(){
        return "Light Saber";
    }
}

public class Main {
    public static void main(String[] args) {
        Cat redCat = new cat2(
            "Blue hat", 
            1.0, 
            true, 
            new lightsaber()); 
            
        redCat.sound();
        redCat.attack(); 
    }
}