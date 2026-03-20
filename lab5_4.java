class InvalidQuantityException extends Exception {
    InvalidQuantityException(String message) {
        super(message);
    }
}
class InvalidPriceException extends Exception {
    InvalidPriceException(String message) {
        super(message);
    }
}

class Fruits {
    String name;
    int quantity;
    double price;

    Fruits(String name, int quantity, double price) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    void display() {
        try {
            if (quantity < 0) {
                throw new InvalidQuantityException("Quantity cannot be negative");
            }
            if (price <0){
                throw new InvalidPriceException("Price cannot be negative");
            }
            System.out.println("The details of Fruits are below:");
            System.out.println("Name:" + name);

            if (quantity == 1)
                System.out.println("This is a single Fruits");
            else
                System.out.println("These are fruits in a bunch");

            System.out.println("Price" + price);

        } catch (InvalidQuantityException e) {
            System.out.println("Error: " + e.getMessage());
        }
        catch(InvalidPriceException e){
            System.out.println("Error :"+e.getMessage());
        }
    }
}
public class lab5_4 {
    public static void main(String[] args) {
        Fruits f1=new Fruits("Apples", 5, 100);
        Fruits f2=new Fruits("Banana", 1, 5);
        f1.display();
        f2.display();
    }
}
