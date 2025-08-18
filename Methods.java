package coreapi;

public class Methods {

    // une variable statique vit aussi longtemps que la classe existe
    // donc cela implique que elle vit au moins aussi longtemps que les instances de la classe
    // donc si on a une instance de la classe alors la variable statique est accessible et disponible
    // c'est ce qui explique que la variable statique est accessible dans les méthodes statiques et methodes d'instance
    // au moment ou l'objet est créé, la variable statique est deja existante et initialisée


    // dans une methode statique, on n'est pas sur que l'objet de la classe existe deja
    // et donc on ne peut pas acceder aux variables d'instance dans une methode statique

    // syntaxe pour la methode est comme suit:
    // 1. access modifier (public, private, protected)

    //public: methode est accessible de partout
    // private: methode est accessible seulement dans la classe ou elle est definie
    // protected: methode est accessible dans la classe, les sous-classes et les classes du même package
    // default: methode est accessible seulement dans le même package


    // 2. optional access modifier (static, final)
    // 3. return type (void, int, String, etc.)
    // 4. method name (firstAndLast)
    // 5. parameters (String str)
    // 6. optionel throw clause (optional, used for exceptions)
    // 7. method body (enclosed in curly braces)

    // variable locales et variable d'instance
    // 1 -  une variable locale est definie dans une méthode et n'est accessible que dans cette méthode
    // 2 - une variable d'instance est definie dans la classe et est accessible dans toutes les méthodes de la classe ou alors or de la clase dependamment du access modifier
}
