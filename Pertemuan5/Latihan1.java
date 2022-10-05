package Pertemuan5;

class Player{
    String name;
    double health;
    int level;
    Weapon weapon;
    Armor armor;

    Player(String name, double health){
        this.name = name;
        this.health = health;
    }

    void equipWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    void equipArmor(Armor armor){
        this.armor = armor;
    }

    void display(){
        System.out.println("\nName : " + this.name);
        System.out.println("Health : " + this.health + " hp");
        this.weapon.display();
        this.armor.display();
    }
}

class Weapon{
    double attackPower;
    String name;

    Weapon(String name, double attackPower){
        this.name = name;
        this.attackPower = attackPower;
    }

    void display(){
        System.out.println("Weapon : " + this.name + " , attack : " + this.attackPower);
    }
}

// armor
class Armor{
    double defencePower;
    String name;

    Armor(String name, double defencePower){
        this.name = name;
        this.defencePower = defencePower;
    }

    void display(){
        System.out.println("Armor : " + this.name + " , defence : " + this.defencePower);
    }
}

public class Latihan1 {
    public static void main(String[] args) {
        Player player1 = new Player("Jarot",1000);
        Player player2 = new Player("Toro",2000);

        Weapon KorekKuping = new Weapon("Korek Kuping",999);
        Weapon PencukurKumis = new Weapon("Pencukur kumis",1000);

        Armor PDIP = new Armor("Kaos Partai PDIP",50);
        Armor Kutang = new Armor("Kaos Kutang",20);

        player1.equipWeapon(KorekKuping);
        player1.equipArmor(PDIP);
        player1.display();

        player2.equipWeapon(PencukurKumis);
        player2.equipArmor(Kutang);
        player2.display();
    }

}
