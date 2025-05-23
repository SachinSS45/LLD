//Product class representing any item of any Ecommerce

import java.util.ArrayList;
import java.util.List;

class Product{
    public String name;
    public double price;

    public Product(String name,double price){
        this.name = name;
        this.price = price;
    }
}

//violating SRP : Shopping cart is handling multiple responsibilities
class ShoppingCart {

    private List<Product> products = new ArrayList<>();

    public void addProduct(Product p){
        products.add(p);
    }

    public final List<Product> getProducts(){
        return products;
    }

    //1.Calculates total price in cart
    public double calculateTotal(){
        double total = 0;
        for(Product p:products){
            total += p.price;
        }
        return total;
    }

    //2.Violating SRP : Print invoice (Should be in a separte class
    public void printInvoice(){
        System.out.println("Shopping Cart Invoice : ");
        for(Product p : products){
            System.out.println(p.name + " - $ " + p.price);
        }
        System.out.println("Total : $" + calculateTotal());
    }

    //3.Violating SRP : Saves to DB(should be in separte class)
    public void saveToDatabase(){
        System.out.println("Saving cart to database...");
    }
} 
public class SRP_Voilated {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(new Product("Laptop", 1500));
        cart.addProduct(new Product("Mouse", 50));

        cart.printInvoice();
        cart.saveToDatabase();
    }
}