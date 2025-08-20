package coreapi;

import java.util.ArrayList;
import java.util.Arrays;

public class Algorithmes {

    // 1- Implementation d'Algorithme simple recherche (Deviner le nombre auquel je pense)
    public static int simpleSearch(ArrayList<Integer> tab, int number){
        int low = 0;
        for(int a : tab){
            low++;
            if(a == number){
                return a;
            }
        }
        return -1;
    }

    public static int simpleSearch(int[] tab, int number){
        for(int i = 0; i < tab.length; i++){
            if(tab[i] == number){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
         ArrayList<Integer> tab = new ArrayList<Integer>(100);
         int[] tab2 = new int[100];
         int number = (int)Math.floor(Math.random()*100);

         for(int i = 0 ; i < 100; i++){
             tab.add(i);
             tab2[i] += i;
         }
         System.out.println("Le nombre recherché : " + number);
         System.out.println(Algorithmes.simpleSearch(tab2, number));



    }
}
