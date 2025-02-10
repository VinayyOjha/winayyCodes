

public class Weapons extends Item {
    private String type;
    private int damage;

    public Weapons(String name, int quantity, int damage, String type) {
        super(name, quantity);
        this.type = type;
        this.damage = damage;
    }

    public int getDamage(){
        return damage;
    }

    public String getType(){
        return type;
    }

    // IMP : POLYMORPHISM: Overriding a function. This is dynamic in nature as it happens at run-time. And acts differently to the over-ridden function "to.String()" present in the Fruits or Item class.

    @Override
    public String toString() {
        return "Weapon = " + this.getName() + ", Quantity = " + this.getQuantity() + ", Type: " + this.getType() + ", Damage: " + this.getDamage();
    }
}
