package exercice_map;

import java.util.HashMap;
import java.util.Map;

public class CustomerDatabase {
    // TODO: Fusionner deux bases de données
    public static Map<String, String> mergeDatabases(Map<String, String> db1, Map<String, String> db2) {
        // À implémenter avec putAll()
        // Créer une nouvelle map et y mettre les deux bases
        return null;
    }

    // TODO: Ajouter tous les clients d'une base dans une autre
    public static void addAllCustomers(Map<String, String> targetDb, Map<String, String> sourceDb) {
        // À implémenter avec putAll()
    }

    // TODO: Afficher une base de données
    public static void displayDatabase(String dbName, Map<String, String> database) {
        // À implémenter
    }

    public static void main(String[] args) {
        Map<String, String> storeA = new HashMap<>();
        storeA.put("C001", "Alice");
        storeA.put("C002", "Bob");
        storeA.put("C003", "Charlie");

        Map<String, String> storeB = new HashMap<>();
        storeB.put("C003", "Charlotte"); // Client en commun avec ID différent
        storeB.put("C004", "Diana");
        storeB.put("C005", "Eve");

        displayDatabase("Store A", storeA);
        displayDatabase("Store B", storeB);

        Map<String, String> merged = mergeDatabases(storeA, storeB);
        displayDatabase("Merged Database", merged);
    }
}
