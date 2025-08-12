package coreapi;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Date {

    public static void main(String[] args) {
        // Java nous permet de modeliser le concepte de date, jour, mois, année
        LocalDate today = LocalDate.now();
        System.out.println("Today is: " + today);
        System.out.println("Today day is " + today.getDayOfWeek());

        // Date
        LocalDate date = LocalDate.of(2023, 10, 1);

        // Date avec le temps
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Date and time: " + dateTime);

        // Heure
        LocalTime time = LocalTime.now();
        System.out.println("Current time: " + time);

        // La date et l'heure avec le fuseau horaire
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("Zoned date and time: " + zonedDateTime);

        OffsetDateTime offsetDateTime = OffsetDateTime.now();
        System.out.println("Offset date and time: " + offsetDateTime);


        // la montre
        Clock clock = Clock.systemUTC();
        LocalDateTime currentDate = LocalDateTime.now(clock);
        System.out.println("Current date using clock: " + currentDate);

        Clock clock2 = Clock.system(ZoneId.of("Europe/Paris"));
        Clock clock3 = Clock.system(ZoneId.of("Africa/Abidjan"));

        System.out.println("Time Difference between Abidjan and Paris " + ChronoUnit.HOURS.between(LocalDateTime.now(clock3), LocalDateTime.now(clock2)));

        LocalDateTime localDateTime = currentDate.plus(2, ChronoUnit.HOURS);

        // les operations sur les dates
        // ajouter des jours, mois, années, heures, minutes, secondes, milliseconds, nanos
        // convertir vers un autre fuseau horaire
        LocalDateTime plusDays = localDateTime.now();
        ZonedDateTime zonedDateTime1 = plusDays.atZone(ZoneId.of("Africa/Abidjan"));
        LocalDateTime localDateTime1 = zonedDateTime1.toLocalDateTime();


        // Période et Durée
        // en java une periode est une durée entre deux Temporal (un point dans le temps) et l'unité minimale est le jour : Period
        // en java la durée est une durée entre deux Temporal (un point dans le temps) et l'unité minimale est la seconde: Duration

        Duration duration = Duration.between(LocalDateTime.now(), LocalDateTime.now());
        duration.getSeconds();
        duration.getNano();
        duration.toDays();
        duration.toHours();
        duration.toMinutes();
        Duration.ofDays(1);
        Duration.ofHours(1);
        Duration.ofMinutes(1);
        Duration.ofSeconds(1);
        Duration.ofMillis(1);
        Duration.ofNanos(1);

        Duration.of(3, ChronoUnit.DAYS);

        Period period = Period.between(LocalDate.now(), LocalDate.now());
        period.getDays();
        period.getMonths();
        period.getYears();
        Period.ofDays(1);
        Period.ofMonths(1);
        Period.ofYears(1);

        // il represente le nombre de milliseconds depuis le 1er janvier 1970
        Instant instant = Instant.now();
        instant.atZone(ZoneId.of("Europe/Paris")).toLocalDateTime();
        long epochMilli = instant.toEpochMilli();
    }
}
