import java.util.ArrayList;

public class Inventory {

    // The ArrayList 'items' stores object of the class Items.
    // Store and manage group of objects.

    private ArrayList<Item> items; // Declaraiton
    
    public Inventory(){ 
        items = new ArrayList<>(); // Constructor
    }

    // Following method adds an item (Of type "Item") in the ArrayList 'items'.
    public void addItems(Item item){
        items.add(item);
    }

    // Diplay the Inventory
    public void displayInventory(){
        for (Item item : items) {
            System.out.println(item.toString());
        }
    }
}
