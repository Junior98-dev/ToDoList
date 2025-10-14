package exercice_map;

//## Exercice 7: Compteur de Mots

//**Méthodes à utiliser:** `merge()`, `entrySet()`


import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    private Map<String, Integer> wordCounts;

    public WordCounter() {
        this.wordCounts = new HashMap<>();
    }

    // TODO: Compter les mots d'un texte
    public void countWords(String text) {
        // À implémenter avec merge()
        // Diviser le texte en mots et compter chaque occurrence
        // merge(key, 1, Integer::sum) pour incrémenter
    }

    // TODO: Fusionner les comptes d'un autre texte
    public void mergeText(String additionalText) {
        // À implémenter avec merge()
    }

    // TODO: Obtenir le compte d'un mot spécifique
    public int getWordCount(String word) {
        // À implémenter
        return 0;
    }

    // TODO: Afficher les mots par ordre de fréquence
    public void displayByFrequency() {
        // À implémenter avec entrySet() et tri
    }

    // TODO: Obtenir le mot le plus fréquent
    public String getMostFrequentWord() {
        // À implémenter
        return null;
    }

    public static void main(String[] args) {
        WordCounter counter = new WordCounter();

        String text1 = "hello world hello java world";
        String text2 = "java programming java is fun";

        counter.countWords(text1);
        System.out.println("Après texte 1:");
        counter.displayByFrequency();

        counter.mergeText(text2);
        System.out.println("\nAprès fusion avec texte 2:");
        counter.displayByFrequency();

        System.out.println("\nMot le plus fréquent: " + counter.getMostFrequentWord());
    }
}
