public class Item{

  String name;
  float price;
  int quantity;

  public Item(String name, float price, int quantity){
    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }

  public String getName() {
    return this.name;
  }

  public float getPrice() {
    return this.price;
  }

  public int getQuantity() {
    return this.quantity;
  }

  public Item(String name){
    this.name = name;
  }

  public String toString() {
    return this.name + " name, " + this.price + " price, " + this.quantity + " and quantity";
  }
}