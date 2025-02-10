
// INHERITANCE: Here, 'Item' is the super class and Fruits(a sub-class) which extends it.
public class Fruits extends Item {
    private String type;

    // Constructor
    public Fruits(String name, int quantity, String type){
        super(name, quantity);
        this.type = type;
    }

    public String getType(){
        return type;
    }

    // IMP : POLYMORPHISM: Overriding a function. This is dynamic in nature as it happens at run-time. And acts differently to the over-ridden function "to.String()" present in the Weapons or Iten class.
    @Override
    public String toString() {
        return "Fruit = " + getName() + ", Quantity = " + getQuantity() + ", Type: " + getType();
    }
}
 