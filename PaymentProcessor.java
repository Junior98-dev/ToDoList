package coreapi;

public class PaymentProcessor {
    // // TODO: processPayment with amount only (cash payment)
    public void processPayment(double amount){
        System.out.println("Payement en espèces de: " + amount + " euros.");
    }
    // TODO: processPayment with amount and card number (credit card)
    public void processPayment(double amount, int cardNumber){
        System.out.println("Payement par carte de: " + amount + " euros." + " Numéro de carte: " + cardNumber);
    }

    // TODO: processPayment with amount, card number, and CVV (secure credit card)
    public void processPayment(double amount, int cardNumber, int cvv){
        System.out.println("Payement par carte de: " + amount + " euros." + " Numéro de carte: " + cardNumber + " CVV: " + cvv);
    }

    // TODO: processPayment with amount and account number (bank transfer)
    public void processPayment(double amount, String accountNumber){
        System.out.println("Payement par virement bancaire de: " + amount + " euros." + " Numéro de compte: " + accountNumber);
    }

    // TODO: processPayment with amount, discount percentage, and payment method
    public void processPayment(double amount, double discountPercentage, String paymentMethod){
        double discountedAmount = amount - (amount * discountPercentage / 100);
        System.out.println("Payement de: " + discountedAmount + " euros après une remise de " + discountPercentage + "%. Méthode de payement: " + paymentMethod);
    }
}
