package com.company;


import com.company.creational.factoryMethod.Payment;
import com.company.creational.factoryMethod.PaymentFactory;
import com.company.creational.factoryMethod.PaymentType;

public class Main {
    public static void main(String[] args) {
        factoryMethodTest();
    }

    public static void factoryMethodTest() {
        Payment cardPayment = PaymentFactory.getPayment(PaymentType.CARD_PAYMENT);
        cardPayment.doPayment();

        Payment googlePayment = PaymentFactory.getPayment(PaymentType.GOOGLE_PAYMENT);
        googlePayment.doPayment();
        
        /*
         Si queremos agregar otro metodo de pago tan solo creamos la clase de pago EJM "PayPalPayment" y la agreagamos 
         la fabrica "Switch" de la clase "PaymentFactory".
         
         Desventaja:
         Nos obliga a crear bastantes clases
         
         
        */
    }

}