

public class Item{
    private String name;
    private int quantity;

    // Constructor
    public Item(String name, int quantity){
        this.name = name;
        this.quantity = quantity;
    }

    // Method to get name
    public String getName(){
        return name;
    }

    // Method to get quantity
    public int getQuantity(){
        return quantity;
    }
    

    // POLYMORPHISM: Overriding a function
    @Override
    public String toString() {
        return "Name = " + name + ", Quantity = " + quantity;
    }
}


// public class Item {
//     private String name;
//     private double price;

//     public Item(String name, double price) {
//         this.name = name;
//         this.price = price;
//     }

//     public String getName() {
//         return name;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }

//     public double getPrice() {
//         return price;
//     }

//     public void setPrice(double price) {
//         this.price = price;
//     }

//     @Override
//     public String toString() {
//         return "Item{" +
//                 "name='" + name + '\'' +
//                 ", price=" + price +
//                 '}';
//     }
// }