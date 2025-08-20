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

    public static int binarySearch(int[] tab, int number){

        int left = 0;
        int right = tab.length - 1;
        int count = 0;

        while(left <= right){
            // recherche de l'index du mileu du tableau
            int middle = (int)Math.floor((double) (left + right) / 2);
            count++; // le nombre de tour pour trouver le number

            if(tab[middle] == number){
                System.out.println(count);
                return middle;
            }else if(tab[middle] < number){
                left =  middle + 1; // On recherche number dans l'intervalle à droite
            }else {
                right = middle - 1; // On recherche number dans l'intervalle à gauche
            }
        }

        return -1;
    }

    public static void main(String[] args) {
         ArrayList<Integer> tab = new ArrayList<Integer>(100);
         int[] tab2 = new int[10000];
         int number = (int)Math.floor(Math.random()*10000);

         for(int i = 0 ; i < 10000; i++){
             tab.add(i);
             tab2[i] += i;
         }

         System.out.println(number);
         System.out.println(binarySearch(tab2, number));




    }
}
