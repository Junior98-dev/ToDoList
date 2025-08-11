package coreapi;

public class ExerciceStringMethode {
    // Exercise 1: charAt()
    // Écrire une méthode qui renvoie le premier et le dernier caractère d'une chaîne de caractères sous la forme d'une nouvelle chaîne.
    // Example: "Hello" -> "Ho"
    public static String firstAndLast(String str) {
        // TODO: Implement this method
        // tu recois une chaine de characteres et tu dois retourner une nouvelle chaine de caracteres qui contient le premier et le dernier caractere de la chaine
        // comment je fais pour recuperer le caractère à un index donné dans une chaine de caracteres? charAt
        // comment je fais pour recuperer le dernier caractère de la chaine de caractères?
        // qu'est ce qu'on entends par dernier caractère? c'est le caractère à l'index str.length() - 1

        char start = str.charAt(0); // premier caractère
        char end = str.charAt(str.length() - 1); // dernier caractère
        return "" + start + end;
    }

    // Exercice 2 : contains()
    // Écrire une méthode qui vérifie si une adresse électronique est valide (contient "@" et ".")
    // Exemple : "user@example.com" -> true, "userexample.com" -> false
    public static boolean isValidEmail(String email) {
        return email.contains("@") && email.contains(".");
        // TODO: Implement this method

    }

    // Exercice 3 : indexOf()
    // Ecrire une méthode qui trouve la position de la deuxième occurrence d'un caractère
    // Retourner -1 s'il n'y a pas de deuxième occurrence
    // Exemple : secondOccurrence("Hello", 'l') -> 3
    public static int secondOccurrence(String str, char ch) {
        // TODO: Implement this method
        // On peut utiliser indexOf pour trouver la première occurrence
        // pour la deuxième occurrence, on peut utiliser indexOf avec un index de départ de la première occurrence plus la longueur de la chaine de caractère

        int firstIndex = str.indexOf(ch); // 2
        // recherhe l'index de l en utilisant indexOf(ch) //2
        // ensuite tu dois recherche en commencant à l'index superieur
        return str.indexOf(ch, firstIndex + 1); //3
    }

    // Exercice 4 : substring()
    // Écrire une méthode qui extrait le domaine d'une adresse email
    // Exemple : "user@example.com" -> "exemple.com"
    public static String extractDomain(String email) {
        // TODO: Implement this method
        // 1 - rechercher la position de @
        // 2 - Extraire tout à partir de cette position + 1

        int firstIndex = email.indexOf('@');
        return email.substring(firstIndex + 1);
    }

    // Exercice 5 : substring() avec deux paramètres
    // Ecrire une méthode qui extrait le nom d'utilisateur d'une adresse email
    // Exemple : "user@example.com" -> "user"
    public static String extractUsername(String email) {
        // TODO: Implement this method
        int firstIndex = email.indexOf('@');
        return email.substring(0, firstIndex);
    }

    // Exercice 6 : toLowerCase() et toUpperCase()
    // Ecrire une méthode qui alterne la casse de chaque caractère
    // Exemple : "Hello World" -> "hElLo wOrLd"
    public static String alternateCase(String str) {
        // TODO: Implement this method
        // 1 - Convertir la chaîne en tableau de caractères
        // 2 - Parcourir le tableau et alterner la casse

        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (i % 2 == 0){
                chars[i] = Character.toLowerCase(chars[i]);
            }else {
                chars[i] = Character.toUpperCase(chars[i]);
            }
        }


        String result = new String(chars);

        return result;
    }

    // Exercice 7 : replace()
    // Ecrire une méthode qui censure les mauvais mots en les remplaçant par des astérisques
    // Exemple : censor("This is bad word", "bad") -> "This is *** word"
    public static String censor(String text, String badWord) {
        // TODO: Implement this method
        if(text.contains(badWord)) {
            text = text.replace(badWord, "***");
        }
        return text;
    }

    // Exercice 8 : Méthodes multiples combinées
    // Écrire une méthode qui vérifie si une chaîne est un palindrome (en ignorant la casse)
    // Exemple : "Racecar" -> vrai, "Hello" -> faux
    public static boolean isPalindrome(String str) {
        // TODO: Implement this method
        String trans = str.toLowerCase();
        char[] chars = trans.toCharArray();
        char[] result = new char[chars.length];
        for (int i = chars.length - 1; i >= 0 ; i--) {
            result[chars.length - i - 1] = chars[i];
        }
        String temp = new String(result);


        if (temp.equals(trans)) {
            return true;
        }
        return false;
    }

    // Exercice 9 : Avancé - Extraire l'extension d'un fichier
    // Écrire une méthode qui extrait l'extension d'un nom de fichier
    // Exemple : "document.pdf" -> "pdf", "archive.tar.gz" -> "gz"
    public static String getFileExtension(String filename) {
        // TODO: Implement this method
        int index = filename.lastIndexOf('.'); // Recherche la dernière occurrence du caractère '.' dans la chaîne

        return filename.substring(index + 1);
    }

    // Exercice 10 : Avancé - Title Case
    // Écrire une méthode qui convertit une chaîne de caractères en title case (première lettre de chaque mot en majuscule)
    // Exemple : "hello world java" -> "Hello World Java"
    public static String toTitleCase(String str) {
        // TODO: Implement this method
        char[] chars = str.toCharArray();
        if (chars.length > 0) {
            chars[0] = Character.toUpperCase(chars[0]);
        }
        for (int i = 1; i < chars.length - 1; i++) {
            if (chars[i] == ' ' && i + 1 < chars.length) {
                chars[i + 1] = Character.toUpperCase(chars[i + 1]);
            }
        }
        return new String(chars);
    }

    // Main method with test cases
    public static void main(String[] args) {
        // Test Exercise 1
        System.out.println("Exercise 1 - First and Last:");
        System.out.println("firstAndLast(\"Hello\"): " + firstAndLast("Hello"));
        System.out.println("Expected: Ho\n");

        // Test Exercise 2
        System.out.println("Exercise 2 - Valid Email:");
        System.out.println("isValidEmail(\"user@example.com\"): " + isValidEmail("user@example.com"));
        System.out.println("isValidEmail(\"userexample.com\"): " + isValidEmail("userexample.com"));
        System.out.println("Expected: true, false\n");

        // Test Exercise 3
        System.out.println("Exercise 3 - Second Occurrence:");
        System.out.println("secondOccurrence(\"Hello\", 'l'): " + secondOccurrence("Hello", 'l'));
        System.out.println("secondOccurrence(\"Hello\", 'x'): " + secondOccurrence("Hello", 'x'));
        System.out.println("Expected: 3, -1\n");

        // Test Exercise 4
        System.out.println("Exercise 4 - Extract Domain:");
        System.out.println("extractDomain(\"user@example.com\"): " + extractDomain("user@example.com"));
        System.out.println("Expected: example.com\n");

        // Test Exercise 5
        System.out.println("Exercise 5 - Extract Username:");
        System.out.println("extractUsername(\"user@example.com\"): " + extractUsername("user@example.com"));
        System.out.println("Expected: user\n");

        // Test Exercise 6
        System.out.println("Exercise 6 - Alternate Case:");
        System.out.println("alternateCase(\"Hello World\"): " + alternateCase("Hello World"));
        System.out.println("Expected: hElLo wOrLd\n");

        // Test Exercise 7
        System.out.println("Exercise 7 - Censor:");
        System.out.println("censor(\"This is bad word\", \"bad\"): " + censor("This is bad word", "bad"));
        System.out.println("Expected: This is *** word\n");

        // Test Exercise 8
        System.out.println("Exercise 8 - Palindrome:");
        System.out.println("isPalindrome(\"Racecar\"): " + isPalindrome("Racecar"));
        System.out.println("isPalindrome(\"Hello\"): " + isPalindrome("Hello"));
        System.out.println("Expected: true, false\n");

        // Test Exercise 9
        System.out.println("Exercise 9 - File Extension:");
        System.out.println("getFileExtension(\"document.pdf\"): " + getFileExtension("document.pdf"));
        System.out.println("getFileExtension(\"archive.tar.gz\"): " + getFileExtension("archive.tar.gz"));
        System.out.println("Expected: pdf, gz\n");

        // Test Exercise 10
        System.out.println("Exercise 10 - Title Case:");
        System.out.println("toTitleCase(\"hello world java\"): " + toTitleCase("hello world java"));
        System.out.println("Expected: Hello World Java");
    }
}


