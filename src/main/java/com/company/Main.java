package com.company;


import com.company.behavioral.chainOfResponsability.Tarjeta;
import com.company.behavioral.commad.RNIs.ProceduresRNI001Impl;
import com.company.behavioral.command.CreditCard;
import com.company.behavioral.command.CreditCardActivateCommand;
import com.company.behavioral.command.CreditCardDesactivateCommand;
import com.company.behavioral.command.CreditCardInvoker;
import com.company.behavioral.interpreter.AndExpresion;
import com.company.behavioral.interpreter.Expresion;
import com.company.behavioral.interpreter.OrExpresion;
import com.company.behavioral.interpreter.TerminalExpresion;
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
import com.company.behavioral.strategy.CapitalStrategyTestFormatter;
import com.company.behavioral.strategy.Context;
import com.company.behavioral.strategy.LowerStrategyTestFormatter;
import com.company.behavioral.templateMethod.AMex;
import com.company.behavioral.templateMethod.Paypal;
import com.company.behavioral.templateMethod.Visa;
import com.company.behavioral.visitor.*;
import com.company.behavioral.visitorEjm2.*;
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
import com.company.structural.adapterEjm2.SimpleCoffee;
import com.company.structural.adapterEjm2.WithMilk;
import com.company.structural.bridge.bridge.ClassicCreditCard;
import com.company.structural.bridge.bridge.SecureCreditCard;
import com.company.structural.bridge.bridge.UsecureCreditCard;
import com.company.structural.bridge.bridge_II.*;
import com.company.structural.compostie.compostie1.CuentaAhorro;
import com.company.structural.compostie.compostie1.CuentaComponent;
import com.company.structural.compostie.compostie1.CuentaComposite;
import com.company.structural.compostie.compostie1.CuentaCorriente;
import com.company.structural.decorator.decorater1.*;
import com.company.structural.facade.facade1.CreditMarketFacade;
import com.company.structural.flywight.Enemy;
import com.company.structural.flywight.EnemyFactory;
import com.company.structural.proxy.Internet;
import com.company.structural.proxy.Proxy;

import java.util.Objects;
import java.util.Random;

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
//          state();
//        interpreter();
//        strategy();
//        tempateMethod();
//        visitor();
//        visitor2();

//        Structurales
//        adapter();
//        adapterEjm2();
//        bridge();
//        bridge2();
//        composite();
//        decorator();
//        facade();
//        flyweight();
        proxy();
    }

    private static void proxy() {
        Internet internet = new Proxy();
        try {
            internet.connectTo("https://www.google.com");
            internet.connectTo("https://www.facebook.com");

        } catch (Exception e) {
            System.out.println("Error connecting to: " + e.getMessage());
        }

    }

    private static void flyweight() {
        for (int i = 0; i < 15; i++) {
            Enemy enemy = EnemyFactory.getEnemy(getRandomEnemyType());
            enemy.setWeapon(getRandomWeapon());
            enemy.lifePoints();
        }
    }

    private static String getRandomWeapon() {
        Random r = new Random();
        int randInt = r.nextInt(weapon.length);
        return weapon[randInt];
    }

    private static String getRandomEnemyType() {
        Random r = new Random();
        int randInt = r.nextInt(enemyType.length);
        return enemyType[randInt];
    }

    private static String[] enemyType = {"Private", "Detective"};
    private static String[] weapon = {"Fusil", "Revolver", "Pistola", "Metralleta", "Lanza Granadas", "9mm"};

    private static void facade() {
        CreditMarketFacade creditMarketFacade = new CreditMarketFacade();
        creditMarketFacade.showCreditGold();
        creditMarketFacade.showCreditSilver();
        creditMarketFacade.showCreditBlack();
    }

    private static void decorator() {
        System.out.println("-------- Tarjeta Gold con configuración --------");
        Credit gold = new Gold();
        gold.showCredit();

        System.out.println("-------- Tarjeta Black con configuración --------");
        Credit blackInternationalPayment = new Black();
        blackInternationalPayment = new InternationalPaymentDecorator(blackInternationalPayment);
        blackInternationalPayment.showCredit();

        System.out.println("-------- Tarjeta Gold2 con configuración --------");
        Credit goldSecureInternational = new Gold();
        goldSecureInternational = new InternationalPaymentDecorator(goldSecureInternational);
        goldSecureInternational = new SecureDecorator(goldSecureInternational);
        goldSecureInternational = new PSEDecorator(goldSecureInternational);
        goldSecureInternational.showCredit();
    }

    private static void composite() {
        CuentaComponent cuentaCorriente = new CuentaCorriente(1000.0, "Alberto");
        CuentaComponent cuentaAhorro = new CuentaAhorro(2000.0, "Alberto");

        CuentaComposite cuentaComposite = new CuentaComposite();
        cuentaComposite.addCuenta(cuentaCorriente);
        cuentaComposite.addCuenta(cuentaAhorro);

        cuentaComposite.showAccountName();
        cuentaComposite.getAmount();

    }

    private static void bridge2() {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }


    private static void bridge() {
        com.company.structural.bridge.bridge.CreditCard classic = new ClassicCreditCard(new UsecureCreditCard());
        classic.realizarPago();

        classic = new ClassicCreditCard(new SecureCreditCard());
        classic.realizarPago();
    }

    private static void adapter() {
        com.company.structural.adapter.CreditCard creditCard = new com.company.structural.adapter.CreditCard();
        creditCard.pay("clasic");
        creditCard.pay("gold");
        creditCard.pay("black");
        creditCard.pay("silver");
    }

    private static void adapterEjm2() {
        SimpleCoffee simpleCoffee = new SimpleCoffee();
        System.out.println(simpleCoffee.getDescription());
        System.out.println(simpleCoffee.getCost());

        WithMilk withMilk = new WithMilk(simpleCoffee);
        System.out.println(withMilk.getDescription());
        System.out.println(withMilk.getCost());
    }

    private static void visitor2() {
        Dot dot = new Dot(1, 10, 55);
        Circle circle = new Circle(2, 23, 15, 10);
        Rectangle rectangle = new Rectangle(3, 10, 17, 20, 30);

        CompoundShape compoundShape = new CompoundShape(4);
        compoundShape.add(dot);
        compoundShape.add(circle);
        compoundShape.add(rectangle);

        CompoundShape c = new CompoundShape(5);
        c.add(dot);
        compoundShape.add(c);

        export(circle, compoundShape);
    }

    private static void export(Shape... shapes) {
        XMLExportVisitor exportVisitor = new XMLExportVisitor();
        System.out.println(exportVisitor.export(shapes));
    }

    private static void visitor() {
        OfertaElement ofertaElement = new OfertaGasolina();
        ofertaElement.accept(new BlankCreditCardVisitor());

        ofertaElement = new OfertaVuelos();
        ofertaElement.accept(new ClassicCreditCardVisitor());
        ofertaElement.accept(new BlankCreditCardVisitor());
    }

    private static void tempateMethod() {
        com.company.behavioral.templateMethod.Payment payment = new Visa();
        payment.makePayment();

        payment = new AMex();
        payment.makePayment();

        payment = new Paypal();
        payment.makePayment();
    }

    private static void strategy() {
        Context context = new Context(new CapitalStrategyTestFormatter());
        context.publishText("este texto será convertido en mayuscula a traves del algoritmos");

        context = new Context(new LowerStrategyTestFormatter());
        context.publishText("EsTE texto será convERTido en MINUSCULAS a traves del algoRITMOs");
    }

    private static void interpreter() {
        Expresion cero = new TerminalExpresion("0");
        Expresion uno = new TerminalExpresion("1");

        Expresion containBoolean = new OrExpresion(cero, uno);
        Expresion containOneAndCero = new AndExpresion(cero, uno);

        System.out.println(containBoolean.interpreter("cero"));
        System.out.println(containBoolean.interpreter("0"));

        System.out.println(containOneAndCero.interpreter("0"));
        System.out.println(containOneAndCero.interpreter("0, 1"));

    }

    private static void state() {
        MobileAlertStateContext context = new MobileAlertStateContext();
        context.alert();
        context.alert();
        context.setState(new Vibracion());
        context.alert();
        context.alert();
        context.setState(new Silent());
        context.alert();
        context.alert();
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
        } catch (InterruptedException e) {

        }

        System.out.println("------------------------------");

        messagePublisher.notifyUpdate(new Semaforo("VERDE_COCHE"));

    }

    private static void memento() {
        Carateker carateker = new Carateker();
        Article article = new Article("Autor", "Memento es una pelicula");
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