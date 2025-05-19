package com.company;


import com.company.behavioral.chainOfResponsability.Tarjeta;
import com.company.behavioral.commad.RNIs.ProceduresRNI001Impl;
import com.company.behavioral.command.CreditCard;
import com.company.behavioral.command.CreditCardActivateCommand;
import com.company.behavioral.command.CreditCardDesactivateCommand;
import com.company.behavioral.command.CreditCardInvoker;
import com.company.behavioral.iterator.CardList;
import com.company.behavioral.iterator.Iterator;
import com.company.behavioral.iterator.List;
import com.company.behavioral.mediator.ConcreteCollege1;
import com.company.behavioral.mediator.ConcreteCollege2;
import com.company.behavioral.mediator.ConcreteMediator;
import com.company.behavioral.memento.Article;
import com.company.behavioral.memento.Carateker;
import com.company.behavioral.observer.Coche;
import com.company.behavioral.observer.MessagePublisher;
import com.company.behavioral.observer.Peaton;
import com.company.behavioral.observer.Semaforo;
import com.company.behavioral.state.MobileAlertStateContext;
import com.company.behavioral.state.Silent;
import com.company.behavioral.state.Vibracion;
import com.company.creational.abstractFactory.AbstractFactory;
import com.company.creational.abstractFactory.Card;
import com.company.creational.abstractFactory.FactoryProvider;
import com.company.creational.abstractFactory.PaymentMethod;
import com.company.creational.factoryMethod.Payment;
import com.company.creational.factoryMethod.PaymentFactory;
import com.company.creational.factoryMethod.PaymentType;
import com.company.creational.factoryMethodEjm2.DialogEjm2;
import com.company.creational.factoryMethodEjm2.DialogEjm2Linux;
import com.company.creational.factoryMethodEjm2.DialogEjm2Windows;
import com.company.creational.factoryMethodEjm3.ButtonEjm3;
import com.company.creational.factoryMethodEjm3.OperativeSystemFactory;
import com.company.creational.factoryMethodEjm3.OperativeSystemType;
import com.company.creational.prototype.PrototypeCard;
import com.company.creational.prototype.PrototypeFactory;

import java.util.Objects;

import static com.company.creational.prototype.PrototypeFactory.CartType.AMEX;
import static com.company.creational.prototype.PrototypeFactory.CartType.VISA;


public class Main {
    public static void main(String[] args) {

//        CREACIONALES
//        factoryMethodTest();
//        factoryMethodEjm2Test();
//        factoryMethodEjm3Test();
//        abstractFactoryMethodTest();
//        builderTest();
//        prototypeTest();
//        singletonTest();

//        Comportamiento
//        chainOfREsponsability();
//        commandTest();
//        commandTest2();
//        iteratorTest();
//        mediator();
//        memento();
//        observer();
          state();
    }

    private static void state() {
        MobileAlertStateContext context = new MobileAlertStateContext();
        context.alert();
        context.alert();
/*        context.setState(new Vibracion());
        context.alert();
        context.alert();
        context.setState(new Silent());
        context.alert();
        context.alert();*/
    }

    private static void observer() {
        Coche coche = new Coche();
        Peaton peaton = new Peaton();
        MessagePublisher messagePublisher = new MessagePublisher();
        
        messagePublisher.attach(coche);
        messagePublisher.attach(peaton);
        messagePublisher.notifyUpdate(new Semaforo("ROJO_COCHE"));

        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            
        }

        System.out.println("------------------------------");

        messagePublisher.notifyUpdate(new Semaforo("VERDE_COCHE"));
        
    }

    private static void memento() {
        Carateker carateker = new Carateker();
        Article article = new Article("Autor","Memento es una pelicula");
        article.setText(article.getText() + " de Nolan");
        System.out.println(article.getText());
        carateker.addMemento(article.createMemento());
    }

    private static void mediator() {
        ConcreteMediator mediator = new ConcreteMediator();
        ConcreteCollege1 user1 = new ConcreteCollege1(mediator);
        ConcreteCollege2 user2 = new ConcreteCollege2(mediator);

        mediator.setUser1(user1);
        mediator.setUser2(user2);
        
        user1.send("Hola Soy User1");
        user2.send("Hola User1, soy User2");
    }

    private static void iteratorTest() {
        com.company.behavioral.iterator.Card[] cards = new com.company.behavioral.iterator.Card[5];
        cards[0] = new com.company.behavioral.iterator.Card("VISA");
        cards[1] = new com.company.behavioral.iterator.Card("AMEX");
        cards[2] = new com.company.behavioral.iterator.Card("MASTER CARD");
        cards[3] = new com.company.behavioral.iterator.Card("GOOGLE CARD");
        cards[4] = new com.company.behavioral.iterator.Card("APPLE CARD");

        List lista = new CardList(cards);
        Iterator iterator = lista.iterator();

        while (iterator.hasNext()) {
            com.company.behavioral.iterator.Card card = (com.company.behavioral.iterator.Card) iterator.next();
            System.out.println(card.getType());
        }
    }

    private static void commandTest() {
        CreditCard creditCardActivate = new CreditCard();
        CreditCard creditCardDeactivate = new CreditCard();
        CreditCardInvoker invoker = new CreditCardInvoker();

        invoker.setCommand(new CreditCardActivateCommand(creditCardActivate));
        invoker.run();
        System.out.println("--------------------");
        invoker.setCommand(new CreditCardDesactivateCommand(creditCardDeactivate));
        invoker.run();

    }

    private static void commandTest2() {
        ProceduresRNI001Impl proceduresRNI001Impl = new ProceduresRNI001Impl();
        boolean res = proceduresRNI001Impl.execute(2L);
        System.out.println("-------------------- " + res);
    }

    private static void chainOfREsponsability() {
        Tarjeta tarjeta = new Tarjeta();
        // Se puede utilizar el patron factory para crear la tarjeta
        tarjeta.crediCardRequest(60000);
        
        /*
        Tedioso para debuguear
         */
    }

    private static void singletonTest() {
        com.company.creational.singleton.Card.getInstance().setCardNumber("123-456-789");
        System.out.println(com.company.creational.singleton.Card.getInstance().getCardNumber());
        
        /*
        Ventajas
        - Acceso controlado a dicha clase
        
        Desventaja
        - dificil de testear ya que guarda la misma referencia y en el test no podemos apuntar a esa referencia
         */
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

        } catch (CloneNotSupportedException e) {
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

    private static void factoryMethodEjm3Test() {
        ButtonEjm3 button = null;
        String os = System.getProperty("os.name").toLowerCase();
        if (os.contains(OperativeSystemType.WINDOWS.getCodigo())) {
            button = OperativeSystemFactory.getButtonEjm3(OperativeSystemType.WINDOWS);
        } else if (os.contains(OperativeSystemType.LINUX.getCodigo())) {
            button = OperativeSystemFactory.getButtonEjm3(OperativeSystemType.LINUX);
        }

        if (Objects.nonNull(button)) {
            button.render();
        }
    }

    private static void factoryMethodEjm2Test() {
        DialogEjm2 dialogEjm2;

//        String os = System.getProperty("os.name").toLowerCase();
        String os = "win";
        if (os.contains("win")) {
            dialogEjm2 = new DialogEjm2Windows();
        } else {
            dialogEjm2 = new DialogEjm2Linux();
        }

        dialogEjm2.renderWindow(); // Usamos el patrón sin saber la clase concreta del botón
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