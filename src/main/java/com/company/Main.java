package com.company;


import com.company.creational.abstractFactory.AbstractFactory;
import com.company.creational.abstractFactory.Card;
import com.company.creational.abstractFactory.FactoryProvider;
import com.company.creational.abstractFactory.PaymentMethod;
import com.company.creational.factoryMethod.Payment;
import com.company.creational.factoryMethod.PaymentFactory;
import com.company.creational.factoryMethod.PaymentType;
import com.company.creational.prototype.PrototypeCard;
import com.company.creational.prototype.PrototypeFactory;

import static com.company.creational.prototype.PrototypeFactory.CartType.AMEX;
import static com.company.creational.prototype.PrototypeFactory.CartType.VISA;


public class Main {
    public static void main(String[] args) {

        //CREACIONALES
        //factoryMethodTest();
        //abstractFactoryMethodTest();
        //builderTest();
        prototypeTest();
    }

    private static void prototypeTest() {
        PrototypeFactory.loadCard();
        try {
            PrototypeCard visa = PrototypeFactory.getInstance(VISA);
            visa.getCard();

            PrototypeCard amex = PrototypeFactory.getInstance(AMEX);
            amex.getCard();
            
            /*
            - Clonar es más facil que volverlo a crear
             */

        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
    }

    private static void builderTest() {
        com.company.creational.builder.Card card = new com.company.creational.builder.Card.CardBuilder(
                "VISA",
                "0000 1111 2222 3333")
                .name("Alberto")
                .expires(2030)
                .credit(true)
                .build();

        System.out.println(card.toString());

        com.company.creational.builder.Card card2 = new com.company.creational.builder.Card.CardBuilder(
                "AMEX",
                "9999 9999 9999 9999")
                .build();

        System.out.println(card2.toString());
        
        /*
        - Reduce el acoplamiento (Bajo acoplamiento).
        - El código de construcción es independiente del de representación, las clases concretas que tratan la representación
        son internas (no forman parte de la interfaz builder).
        - Nos da mayor control en la creación de objetos, lo podemos configurar tal como lo necesitamos
         */
    }

    private static void abstractFactoryMethodTest() {
        AbstractFactory abstractFactory1 = FactoryProvider.getFactory("Card");
        Card visaCard = (Card) abstractFactory1.create("VISA");
        System.out.println(visaCard.getCardNumber());

        AbstractFactory abstractFactory2 = FactoryProvider.getFactory("PaymentMethod");
        PaymentMethod paymentMethod1 = (PaymentMethod) abstractFactory2.create("DEBIT");
        System.out.println(paymentMethod1.doPayment());

        AbstractFactory abstractFactory3 = FactoryProvider.getFactory("Card");
        Card masterCard = (Card) abstractFactory3.create("MASTERCARD");
        System.out.println(masterCard.getCardNumber());

        AbstractFactory abstractFactory4 = FactoryProvider.getFactory("PaymentMethod");
        PaymentMethod paymentMethod2 = (PaymentMethod) abstractFactory2.create("CREDIT");
        System.out.println(paymentMethod2.doPayment());
        
        /*
        Ventajas:
        - Se ocultan a los clientes las clases de implementación, los clientes pueden manipular los objetos mediante 
        las interfaces o clases abstractas, es decir, aisla el código del cliente de las clases concretas.
        - Nos facilita el intercambio de familia de objetos y promueve la concistencia entre los objetos.
        - Perfecto cuando el sistema debe ser independiente de como se crea, se compone y representa los objetos que son
        necesarios aislando de manera efectiva 
        
        Desventajas
        - Para crear nuevos productos se deben modificar las clases abstractas como concretas.
         */
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