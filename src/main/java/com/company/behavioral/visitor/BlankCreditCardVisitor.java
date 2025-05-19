package com.company.behavioral.visitor;

public class BlankCreditCardVisitor implements CreditCardVisitor {
    @Override
    public void ofertaGasolina(OfertaGasolina ofertaGasolina) {
        System.out.println("Descuento del 15% en Gasolina con tu tarjeta Black");
    }

    @Override
    public void ofertaVuelos(OfertaVuelos ofertaVuelos) {
        System.out.println("Descuento del 25% en Vuelos con tu tarjeta Black");
    }
}
