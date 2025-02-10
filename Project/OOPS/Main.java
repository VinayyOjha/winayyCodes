// import OOPS.Weapons;

public class Main {
    public static void main(String[] args) {
        // System.out.println("Yo, wassup!");

        // Creating an object 'inventory' of type 'Inventory'
        Inventory inventory = new Inventory();

        // Declaring two items:
        Item item1 = new Item("Generic Item", 20);
        Fruits fruit = new Fruits("Apples", 13, "Fuji");
        Weapons weapon = new Weapons("Swords", 2, 80, "Talwaar");

        // Adding these two items into our Inventory
        inventory.addItems(item1);
        inventory.addItems(fruit);
        inventory.addItems(weapon);

        // Displaying the inventory
        inventory.displayInventory();
    }
}
