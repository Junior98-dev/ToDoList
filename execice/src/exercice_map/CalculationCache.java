package exercice_map;

//## Exercice 8: Cache de Calculs

//**Méthodes à utiliser:** `computeIfAbsent()`


import java.util.HashMap;
import java.util.Map;

public class CalculationCache {
    private Map<Integer, Long> factorialCache;
    private int cacheHits;

    public CalculationCache() {
        this.factorialCache = new HashMap<>();
        this.cacheHits = 0;
    }

    // TODO: Calculer la factorielle (méthode helper)
    private long calculateFactorial(int n) {
        // Implémentation simple de factorielle
        if (n <= 1) return 1;
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // TODO: Obtenir la factorielle avec cache
    public long getFactorial(int n) {
        // À implémenter avec computeIfAbsent()
        // Si le résultat n'existe pas, le calculer et le stocker
        // Sinon, incrémenter cacheHits

        /*long factorial = calculateFactorial(n);
        if (!factorialCache.containsKey(n)){
            factorialCache.computeIfAbsent(n,k -> factorial);
            return factorial;
        }else{
            cacheHits++;
            return factorialCache.get(n);

        }*/

        if (factorialCache.containsKey(n)){
            cacheHits++;
            return factorialCache.get(n);
        }
        long factorial = calculateFactorial(n);
        factorialCache.computeIfAbsent(n,k -> factorial);
        return factorial;
    }

    // TODO: Obtenir le nombre de hits du cache
    public int getCacheHits() {
        return cacheHits;
    }

    // TODO: Afficher le contenu du cache
    public void displayCache() {
        // À implémenter
        if (factorialCache.isEmpty()){
            System.out.println("Le cache est vide");
        }else {
            factorialCache.forEach((key, value) -> {
                System.out.printf("%d! = %d%n", key, value);
            });
        }
    }

    // TODO: Vider le cache
    public void clearCache() {
        // À implémenter
        factorialCache.clear();
    }

    public static void main(String[] args) {
        CalculationCache cache = new CalculationCache();

        System.out.println("5! = " + cache.getFactorial(5));
        System.out.println("3! = " + cache.getFactorial(3));
        System.out.println("5! = " + cache.getFactorial(5)); // Devrait utiliser le cache
        System.out.println("7! = " + cache.getFactorial(7));
        System.out.println("3! = " + cache.getFactorial(3)); // Devrait utiliser le cache

        System.out.println("\nCache hits: " + cache.getCacheHits());
        cache.displayCache();
    }
}
