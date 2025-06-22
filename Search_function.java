import java.util.*;

class Product {
    String name;
    double price;
    String category;

    Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    void display() {
        System.out.println(name + " | ₹" + price + " | Category: " + category);
    }
}


class SearchEngine {
    private List<Product> products;

    SearchEngine() {
        products = new ArrayList<>();
        loadSampleProducts();
    }

    
    private void loadSampleProducts() {
        products.add(new Product("Apple iPhone 14", 79999, "Electronics"));
        products.add(new Product("Samsung Galaxy S22", 69999, "Electronics"));
        products.add(new Product("Nike Running Shoes", 3499, "Footwear"));
        products.add(new Product("HP Laptop 15s", 54999, "Computers"));
        products.add(new Product("Boat Bluetooth Earphones", 1299, "Accessories"));
        products.add(new Product("Apple MacBook Air", 99999, "Computers"));
        products.add(new Product("Puma Sneakers", 2899, "Footwear"));
    }

    
    List<Product> search(String keyword) {
        List<Product> results = new ArrayList<>();
        for (Product product : products) {
            if (product.name.toLowerCase().contains(keyword.toLowerCase())) {
                results.add(product);
            }
        }
        return results;
    }
}


public class EcommerceSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SearchEngine searchEngine = new SearchEngine();

        System.out.println("🔍 Welcome to ShopEasy Search!");
        System.out.print("Enter a product keyword to search: ");
        String keyword = scanner.nextLine();

        List<Product> results = searchEngine.search(keyword);

        if (results.isEmpty()) {
            System.out.println("No products found for: " + keyword);
        } else {
            System.out.println(" Found " + results.size() + " product(s):");
            for (Product product : results) {
                product.display();
            }
        }

        scanner.close();
    }
}
