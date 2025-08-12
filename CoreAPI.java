package coreapi;

public class CoreAPI {

    // API: Application Programming Interface
    // Collection API de java

    // la classe String: represente une chaine de caractere
    // String est immutable, c'est-a-dire que les objets String ne peuvent pas etre modifies apres leur creation.

    // une classe mutable est une classe dont les objets peuvent etre modifies apres leur creation.
    // example de classe mutable
    static class MutableInteger {
        private int value;

        public MutableInteger(int value) {
            this.value = value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    public static void main(String[] args) {
        String message = "Hello, World!";

        // message qui pointe sur "Hello, World!"
        // message.toLowerCase() alors ce que le code fait est que il va iterer sur tous les characteres de la chaine
        // et va les mettre en minuscule et pour finir il va creer un nouveau String avec les caracteres modifies.

        String lowerCase = message.toLowerCase();

        // message est une variable tout comme a

        // concatenation de chaines de caracteres

        System.out.println("Concatenated Message: " + message);
        System.out.println("lower case Message: " + lowerCase);

        // INteger est une wrapper class pour le type primitif int
        // Double, Long, Float, Short, Byte, Character, Boolean sont aussi des wrapper classes
        // toutes les wrapper classes sont immutables

        // quelques methodes importantes de la classe String
        // - length(): retourne la longueur de la chaine
        // - charAt(int index): retourne le caractere a l'index donné
        // - contains(CharSequence sequence): retourne true si la chaine contient la sous-chaine donnée, example: "Hello, World!".contains("World") retourne true, mais "Hello, World!".contains("world") retourne false
        // - indexOf(String str): retourne l'index de la premiere occurrence de la sous-chaine donnée, example: "Hello, World!".indexOf("World") retourne 7
        // - indexOf(int ch, int fromIndex): retourne l'index de la premiere occurrence du caractere donné a partir de l'index donné, example: "Hello, World!".indexOf('o', 5) retourne 8
        // - indexOf(String str, int fromIndex): retourne l'index de la premiere occurrence de la sous-chaine donnée a partir de l'index donné, example: "Hello, World!".indexOf("World", 5) retourne 7
        // - substring(int beginIndex, int endIndex): retourne une sous-chaine de la chaine, si j'ai "Hello, World!" et je veux "Hello", je vais faire "Hello, World!".substring(0, 5)
        // - substring(int beginIndex): retourne une sous-chaine de la chaine a partir de l'index donné jusqu'a la fin de la chaine, example: "Hello, World!".substring(7) retourne "World!"
        // - toLowerCase(): retourne une nouvelle chaine avec tous les caracteres en minuscules, example: "Hello, World!".toLowerCase() retourne "hello, world!"
        // - toUpperCase(): retourne une nouvelle chaine avec tous les caracteres en majuscules,
        // - replace(CharSequence target, CharSequence replacement): retourne une nouvelle chaine avec toutes les occurrences de la sous-chaine cible remplacees par la sous-chaine de remplacement, example: "Hello, World!, World".replace("World", "Java") retourne "Hello, Java!, World"
        // - replaceAll(String regex, String replacement): retourne une nouvelle chaine avec toutes les occurrences
        // - equals(Object anObject): compare deux chaines de caracteres, retourne true si les deux chaines sont egales, example: "Hello, World!".equals("Hello, World!") retourne true, mais "Hello, World!".equals("hello, world!") retourne false
        // - equalsIgnoreCase(String anotherString): compare deux chaines de caracteres, retourne true
        // - trim(): retourne une nouvelle chaine avec les espaces au debut et a la fin de la chaine enlevees, example: "   Hello, World!   ".trim() retourne "Hello, World!"
        // - split(String regex): retourne un tableau de chaines de caracteres en decoupant la chaine en fonction de l'expression reguliere fournie, example: "Hello, World!".split(", ") retourne un tableau de deux chaines: ["Hello", "World!"]
        // - indent(int n): retourne une nouvelle chaine avec les caracteres indentés de n espaces, example: "Hello, World!".indent(4) retourne "    Hello, World!"
        // - stripIndent(): retourne une nouvelle chaine avec les caracteres indentés de n espaces enlevees, example: "    Hello, World!".stripIndent() retourne "Hello, World!"
        // - isBlank(): retourne true si la chaine est vide ou ne contient que des espaces, example: "   ".isBlank() retourne true, mais "Hello, World!".isBlank() retourne false
        // - isEmpty(): retourne true si la chaine est vide, example: "".isEmpty, "   ".isEmpty() retourne false, mais "".isEmpty() retourne true
        // - startsWith(String prefix): retourne true si la chaine commence par le prefixe donne

        // StringBuilder

        // les methodes de la classe StringBuilder:
        // append(String str): ajoute la chaine de caracteres str a la fin de l'objet StringBuilder.
        // append(char c): ajoute le caractere c a la fin de l'objet StringBuilder.
        // append(int c): ajoute le caractere dont la valeur ascii est c a la fin de l'objet StringBuilder.
        // insert(int offset, String str): insere la chaine de caracteres str a l'offset donne dans l'objet StringBuilder, example: StringBuilder sb = new StringBuilder("Hello"); sb.insert(0, "Greetings: ") -> "Greetings: Hello"
        // "Hello".insert(0, "Greetings: ") -> "Greetings: Hello".substring(0, 10) -> "Greetings: "
        // delete(int start, int end): supprime les caracteres de l'offset start a l'offset end dans l'objet StringBuilder, example: StringBuilder sb = new StringBuilder("Greetings: Hello"); sb.delete(0, 10) -> "Hello"
        // deleteCharAt(int index): supprime le caractere a l'index donne dans l'objet StringBuilder, example: StringBuilder sb = new StringBuilder("Hello"); sb.deleteCharAt(0) -> "ello"
        // replace(int start, int end, String str): remplace les caracteres de l'offset start a l'offset end par la chaine de caracteres str dans l'objet StringBuilder, example: StringBuilder sb = new StringBuilder("Hello"); sb.replace(0, 5, "Greeting") -> "Greeting
        // reverse(): inverse l'ordre des caracteres dans l'objet StringBuilder, example: StringBuilder sb = new StringBuilder("Hello"); sb.reverse() -> "olleH"


        // Tableaux

        // la classe Arrays qui contient des methodes statiques pour manipuler les tableaux:
        // Arrays.sort(int[] a): trie le tableau d'entiers a en ordre croissant
        // Arrays.sort(int[] a, int fromIndex, int toIndex): trie le tableau d'entiers a de l'index fromIndex a l'index toIndex en ordre croissant
        // Arrays.binarySearch(int[] a, int key): recherche la valeur key dans le tableau d'entiers a et retourne l'index de la valeur si elle est trouvee, sinon retourne un nombre negatif qui indique l'index ou la valeur pourrait etre inseree pour maintenir l'ordre du tableau.
        // Arrays.equals(int[] a, int[] a2): compare les deux tableaux d 'entiers a et a2 et retourne true si les deux tableaux sont egaux, sinon retourne false.
        // Arrays.toString(int[] a): retourne une representation sous forme de chaine de caracteres du tableau d'entiers a, example: int[] a = {1, 2, 3}; Arrays.toString(a) -> "[1, 2, 3]"
        // Arrays.compare(int[] a, int[] a2): compare les deux tableaux d'entiers a et a2 et retourne un nombre negatif si a est lexicographiquement avant a2, 0 si les deux tableaux sont egaux, et un nombre positif si a est lexicographiquement apres a2.
        // [1, 2, 3, 4, 5, 5]
        // [1, 2, 3, 4, 5, 5, 7, 6, 8, 9] mismatch at index 2

        //message.substring(0, 5);
        // iteration sur les caracteres d'une chaine de caracteres
        char[] chars = {};
        for (int i = 0; i < 5; i++) {
            char c = message.charAt(i); // recuperer le caractere a l'index i
            chars[i] = c;
            System.out.println("Character at index " + i + ": " + c);
        }

        System.out.println("substring(0, 5): " + new String(chars)); // "Hello"
    }

    public class StringExercises {

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
            String result = "" + start + end; // concaténer les deux caractères
            return result;
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
            return "";
        }

        // Exercice 5 : substring() avec deux paramètres
        // Ecrire une méthode qui extrait le nom d'utilisateur d'une adresse email
        // Exemple : "user@example.com" -> "user"
        public static String extractUsername(String email) {
            // TODO: Implement this method
            return "";
        }

        // Exercice 6 : toLowerCase() et toUpperCase()
        // Ecrire une méthode qui alterne la casse de chaque caractère
        // Exemple : "Hello World" -> "hElLo wOrLd"
        public static String alternateCase(String str) {
            // TODO: Implement this method
            return "";
        }

        // Exercice 7 : replace()
        // Ecrire une méthode qui censure les mauvais mots en les remplaçant par des astérisques
        // Exemple : censor("This is bad word", "bad") -> "This is *** word"
        public static String censor(String text, String badWord) {
            // TODO: Implement this method
            return "";
        }

        // Exercice 8 : Méthodes multiples combinées
        // Écrire une méthode qui vérifie si une chaîne est un palindrome (en ignorant la casse)
        // Exemple : "Racecar" -> vrai, "Hello" -> faux
        public static boolean isPalindrome(String str) {
            // TODO: Implement this method
            return false;
        }

        // Exercice 9 : Avancé - Extraire l'extension d'un fichier
        // Écrire une méthode qui extrait l'extension d'un nom de fichier
        // Exemple : "document.pdf" -> "pdf", "archive.tar.gz" -> "gz"
        public static String getFileExtension(String filename) {
            // TODO: Implement this method
            return "";
        }

        // Exercice 10 : Avancé - Title Case
        // Écrire une méthode qui convertit une chaîne de caractères en title case (première lettre de chaque mot en majuscule)
        // Exemple : "hello world java" -> "Hello World Java"
        public static String toTitleCase(String str) {
            // TODO: Implement this method
            return "";
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


}
