package exercice_map;

// Exercice 4: Réservation de Parking
        //**Méthodes à utiliser:** `putIfAbsent()`, `replace()`, `remove()`, `get()`

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ParkingReservation {
    private Map<Integer, String> parkingSpots;

    public ParkingReservation() {
        this.parkingSpots = new HashMap<>();
    }

    // TODO: Réserver une place seulement si elle est libre
    public boolean reserveSpot(int spotNumber, String ownerName) {
        // À implémenter avec putIfAbsent()
        //parkingSpots.computeIfAbsent(spotNumber, p -> ownerName);
        // Retourner true si réservation réussie, false sinon
        var value = parkingSpots.putIfAbsent(spotNumber, ownerName);
        return value == null;
    }

    // TODO: Changer le propriétaire d'une place
    public String changeOwner(int spotNumber, String newOwner) {
        // À implémenter avec replace()
        // Retourner l'ancien propriétaire
        return parkingSpots.replace(spotNumber, newOwner);
    }

    // TODO: Libérer une place
    public String releaseSpot(int spotNumber) {
        // À implémenter avec remove()
        // Retourner le nom de l'ancien propriétaire
        return parkingSpots.remove(spotNumber);
    }

    // TODO: Obtenir le propriétaire d'une place
    public String getOwner(int spotNumber) {
        // À implémenter avec get()
        return parkingSpots.get(spotNumber);
    }

    // TODO: Afficher toutes les réservations
    public void displayReservations() {
        // À implémenter
        for (Map.Entry<Integer, String> entry : parkingSpots.entrySet()){
            System.out.println("Place " + entry.getKey() + " -> " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        ParkingReservation parking = new ParkingReservation();

        System.out.println("Réserver place 1 pour Alice: " + parking.reserveSpot(1, "Alice"));
        System.out.println("Réserver place 1 pour Bob: " + parking.reserveSpot(1, "Bob"));
        System.out.println("Réserver place 2 pour Bob: " + parking.reserveSpot(2, "Bob"));

        parking.displayReservations();

        System.out.println("Ancien propriétaire place 1: " + parking.changeOwner(1, "Charlie"));
        System.out.println("Libérer place 2: " + parking.releaseSpot(2));

        parking.displayReservations();

    }
}
