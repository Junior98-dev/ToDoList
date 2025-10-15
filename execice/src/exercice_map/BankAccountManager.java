package exercice_map;

//## Exercice 9: Comptes Bancaires

//**Méthodes à utiliser:** `computeIfPresent()`, `compute()`, `removeIf()`

import java.util.HashMap;
import java.util.Map;

public class BankAccountManager {
    private Map<String, Double> accounts;

    public BankAccountManager() {
        this.accounts = new HashMap<>();
    }

    // TODO: Créer un compte
    public void createAccount(String accountHolder, double initialBalance) {
        // À implémenter
        accounts.put(accountHolder, initialBalance);
    }

    // TODO: Ajouter des intérêts de 5% uniquement aux comptes existants
    public void addInterest(String accountHolder) {
        // À implémenter avec computeIfPresent()
        accounts.computeIfPresent(accountHolder, (account, balance) -> accounts.put(account, balance*0.95));
    }

    // TODO: Appliquer une taxe de 2€ (créer le compte avec -2€ s'il n'existe pas)
    public void applyTax(String accountHolder) {
        // À implémenter avec compute()
        accounts.compute(accountHolder, (account, balance) -> (balance == null) ? -2 : balance - 2);
    }

    // TODO: Faire un dépôt ou retrait
    public void updateBalance(String accountHolder, double amount) {
        // À implémenter avec compute()
        // Si le solde devient négatif ou nul, supprimer le compte
    }

    // TODO: Supprimer les comptes avec solde <= 0
    public void removeInactiveAccounts() {
        // À implémenter avec removeIf() sur entrySet()
    }

    // TODO: Afficher tous les comptes
    public void displayAccounts() {
        // À implémenter
        accounts.forEach((account, balance) -> System.out.printf("%s : %.2f€%n",account,balance));
    }

    public static void main(String[] args) {
        BankAccountManager bank = new BankAccountManager();

        bank.createAccount("Alice", 1000.0);
        bank.createAccount("Bob", 500.0);
        bank.createAccount("Charlie", 10.0);

        System.out.println("=== Comptes initiaux ===");
        bank.displayAccounts();

        System.out.println("\n=== Après intérêts sur Alice ===");
        bank.addInterest("Alice");
        bank.displayAccounts();

        System.out.println("\n=== Après taxes ===");
        bank.applyTax("Alice");
        bank.applyTax("Bob");
        bank.applyTax("Diana"); // Compte inexistant
        bank.displayAccounts();

        System.out.println("\n=== Après retrait de Charlie ===");
        bank.updateBalance("Charlie", -15.0);
        bank.displayAccounts();
    }
}
