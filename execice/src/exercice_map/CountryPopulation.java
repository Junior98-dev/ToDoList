package exercice_map;

import java.util.*;

public class CountryPopulation {
    private Map<String, Long> populations;

    public CountryPopulation() {
        this.populations = new HashMap<>();
    }

    // TODO: Ajouter un pays avec sa population
    public void addCountry(String country, long population) {
        // À implémenter avec put()
        populations.put(country,population);
    }

    // TODO: Obtenir tous les noms de pays
    public Set<String> getAllCountries() {
        // À implémenter avec keySet()
        return new HashSet<>(populations.keySet());
    }

    // TODO: Obtenir toutes les populations
    public Collection<Long> getAllPopulations() {
        // À implémenter avec values()
        return new ArrayList<>(populations.values());
    }

    // TODO: Afficher toutes les paires pays-population
    public void displayAllEntries() {
        // À implémenter avec entrySet()
        for (Map.Entry<String, Long> entry : populations.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    // TODO: Calculer la population totale
    public long getTotalPopulation() {
        // À implémenter avec values()
        long total = 0;
        for (long p : populations.values()) total += p;
        return total;
    }

    // TODO: Trouver le pays le plus peuplé
    public String getMostPopulatedCountry() {
        // À implémenter avec entrySet()
        long max = 0;
        String name = "";
        for (Map.Entry<String, Long> entry : populations.entrySet()){
            if (entry.getValue() > max){
                max = entry.getValue();
                name = entry.getKey();
            }
        }
        return name;
    }

    public static void main(String[] args) {
        CountryPopulation cp = new CountryPopulation();

        cp.addCountry("China", 1_400_000_000L);
        cp.addCountry("India", 1_380_000_000L);
        cp.addCountry("USA", 331_000_000L);
        cp.addCountry("Indonesia", 273_000_000L);

        System.out.println("Pays: " + cp.getAllCountries());
        System.out.println("Population totale: " + cp.getTotalPopulation());
        System.out.println("Pays le plus peuplé: " + cp.getMostPopulatedCountry());
        cp.displayAllEntries();
    }
}
