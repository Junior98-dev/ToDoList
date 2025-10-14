package exercice_map;

//Exercice 6: Itération avec forEach

//**Méthodes à utiliser:** `forEach()`


import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class ProductPricing {
    private Map<String, Double> products;

    public ProductPricing() {
        this.products = new HashMap<>();
    }

    // TODO: Ajouter un produit
    public void addProduct(String name, double price) {
        // À implémenter
        products.put(name,price);
    }

    // TODO: Appliquer une réduction de 10% sur tous les produits
    public void applyDiscount() {
        // À implémenter avec forEach()
        products.forEach((p,price) -> products.put(p, price*0.9));
    }

    // TODO: Afficher tous les produits avec format "Produit: XX.XX€"
    public void displayFormattedPrices() {
        // À implémenter avec forEach()
        products.forEach((p,price) -> System.out.printf("%s : %.2f€%n", p,price));
    }

    // TODO: Compter les produits qui coûtent plus de 50€
    public int countExpensiveProducts() {
        // À implémenter avec forEach()
        AtomicInteger count = new AtomicInteger(0); // permet d’incrémenter un entier à l’intérieur d’une lambda
        products.forEach((p, price) -> {
            if(price > 50) count.incrementAndGet();
        });
        return count.get();
    }

    // TODO: Créer un récapitulatif pour chaque produit
    public void displaySummary() {
        // À implémenter avec forEach()
        // Format: "Le produit [nom] coûte [prix]€"
        products.forEach((name, price) ->
                System.out.printf("Le produit %s coûte %.2f€%n", name, price)
        );
    }

    public static void main(String[] args) {
        ProductPricing pricing = new ProductPricing();

        pricing.addProduct("Laptop", 899.99);
        pricing.addProduct("Mouse", 25.50);
        pricing.addProduct("Keyboard", 75.00);
        pricing.addProduct("Monitor", 299.99);

        System.out.println("=== Prix originaux ===");
        pricing.displayFormattedPrices();

        System.out.println("\n=== Après réduction de 10% ===");
        pricing.applyDiscount();
        pricing.displayFormattedPrices();

        System.out.println("\nProduits > 50€: " + pricing.countExpensiveProducts());
        pricing.displaySummary();
    }
}
