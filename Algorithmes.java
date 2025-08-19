package coreapi;

import java.util.ArrayList;
import java.util.Arrays;

public class Algorithmes {

    // 1- Implementation d'Algorithme simple recherche (Deviner le nombre auquel je pense)
    public static int simpleSearch(ArrayList<Integer> tab, int number){
        for(int a : tab){
            if(a == number){
                return a;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
         ArrayList<Integer> tab = new ArrayList<Integer>(100);
         int number = (int)Math.floor(Math.random()*1000);

         for(int i = 1; i <= 100; i++){
             tab.add(i);
         }
         System.out.println("Le nombre recherché : " + number);
         System.out.println(simpleSearch(tab, number));



    }
}
