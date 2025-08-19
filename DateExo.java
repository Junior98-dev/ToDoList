package coreapi;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class DateExo {
    public static void main(String[] args) {

        /**
         * Period
         * Répresente une durée en année, mois et jours.
         * Conçu pour travailler avec des dates ( LocalDate, ect)
         * Ne tient pas en compte des heures, minutes et secondes
         * Exemple : 2ans, 3mois et 5jours
         */

        LocalDate date1 = LocalDate.of(2022, 1, 1);
        LocalDate date2 = LocalDate.of(2025, 8, 19);

        Period period = Period.between(date1, date2);

        System.out.println(period.getYears()+"ans, " +  period.getMonths()+"Mois, et "+period.getDays() + "Jours");

    }
}