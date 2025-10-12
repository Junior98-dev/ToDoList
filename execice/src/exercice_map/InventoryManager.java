package exercice_map;

import java.util.HashMap;
import java.util.Map;

public class InventoryManager {
    private Map<String, Integer> inventory;

    public InventoryManager() {
        this.inventory = new HashMap<>();
    }

    // TODO: Ajouter un produit avec sa quantité
    public void addProduct(String productName, int quantity) {
        // À implémenter avec put()
    }

    // TODO: Obtenir la quantité d'un produit
    public Integer getQuantity(String productName) {
        // À implémenter avec get()
        return null;
    }

    // TODO: Retourner le nombre total de produits différents
    public int getTotalProducts() {
        // À implémenter avec size()
        return 0;
    }

    // TODO: Vérifier si l'inventaire est vide
    public boolean isInventoryEmpty() {
        // À implémenter avec isEmpty()
        return false;
    }

    // TODO: Vider complètement l'inventaire
    public void clearInventory() {
        // À implémenter avec clear()
    }

    // TODO: Afficher l'inventaire complet
    public void displayInventory() {
        // À implémenter
    }

    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();

        // Tester vos méthodes ici
        manager.addProduct("Laptop", 10);
        manager.addProduct("Mouse", 50);
        manager.addProduct("Keyboard", 30);

        System.out.println("Quantité de Laptop: " + manager.getQuantity("Laptop"));
        System.out.println("Total produits: " + manager.getTotalProducts());
        System.out.println("Inventaire vide? " + manager.isInventoryEmpty());

        manager.displayInventory();
        manager.clearInventory();
        System.out.println("Après clear - Inventaire vide? " + manager.isInventoryEmpty());
    }
}
