package exercice_map;

import java.util.HashMap;
import java.util.Map;

public class GradeBook {
    private Map<String, Double> grades;

    public GradeBook() {
        this.grades = new HashMap<>();
    }

    // TODO: Ajouter une note pour un étudiant
    public void addGrade(String studentName, double grade) {
        // À implémenter avec put()
    }

    // TODO: Vérifier si un étudiant existe dans le système
    public boolean hasStudent(String studentName) {
        // À implémenter avec containsKey()
        return false;
    }

    // TODO: Vérifier si une note spécifique a été attribuée
    public boolean hasGrade(double grade) {
        // À implémenter avec containsValue()
        return false;
    }

    // TODO: Compter combien d'étudiants ont eu la note maximale (20)
    public int countPerfectScores() {
        // À implémenter avec containsValue()
        return 0;
    }

    // TODO: Vérifier si quelqu'un a échoué (note < 10)
    public boolean hasFailingGrade() {
        // À implémenter avec values()
        return false;
    }

    public static void main(String[] args) {
        GradeBook gradeBook = new GradeBook();

        gradeBook.addGrade("Alice", 18.5);
        gradeBook.addGrade("Bob", 20.0);
        gradeBook.addGrade("Charlie", 15.0);
        gradeBook.addGrade("Diana", 20.0);

        System.out.println("Alice existe? " + gradeBook.hasStudent("Alice"));
        System.out.println("Eve existe? " + gradeBook.hasStudent("Eve"));
        System.out.println("Quelqu'un a eu 20? " + gradeBook.hasGrade(20.0));
        System.out.println("Notes parfaites: " + gradeBook.countPerfectScores());
    }
}
