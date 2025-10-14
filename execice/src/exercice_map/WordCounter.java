package exercice_map;

//## Exercice 7: Compteur de Mots

//**Méthodes à utiliser:** `merge()`, `entrySet()`


import java.util.*;

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

        // Diviser le texte en mots (en supprimant ponctuation et espaces multiples)
        String[] words = text.split("\\W+");
        for (var word : words){
            if (!word.isEmpty()){
                word = word.toLowerCase();
                wordCounts.merge(word, 1, Integer::sum);
            }
        }
    }

    // TODO: Fusionner les comptes d'un autre texte
    public void mergeText(String additionalText) {
        // À implémenter avec merge()
        String[] words = additionalText.split("\\W+");
        for (var word : words){
            if (!word.isEmpty()){
                word = word.toLowerCase();
                wordCounts.merge(word, 1, Integer::sum);
            }
        }
    }

    // TODO: Obtenir le compte d'un mot spécifique
    public int getWordCount(String word) {
        // À implémenter
        return wordCounts.get(word);
    }

    // TODO: Afficher les mots par ordre de fréquence
    public void displayByFrequency() {
        // À implémenter avec entrySet() et tri

        //Creation d'une liste des entrées pour pouvoir la trier
        List<Map.Entry<String, Integer>> entries = new ArrayList<>(wordCounts.entrySet());

        // Trier la liste par valeur (ordre décroissant)
        entries.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()){
            System.out.printf("%s : %d%n", entry.getKey(), entry.getValue());
        }
    }

    // TODO: Obtenir le mot le plus fréquent
    public String getMostFrequentWord() {
        // À implémenter
        String name = "";
        int count = 0;
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()){
            if (entry.getValue() > count){
                count = entry.getValue();
                name = entry.getKey();
            }
        }
        return name;
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
