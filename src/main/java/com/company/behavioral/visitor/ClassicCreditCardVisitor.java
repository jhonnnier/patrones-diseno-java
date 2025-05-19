package com.company.behavioral.visitor;

public class ClassicCreditCardVisitor implements CreditCardVisitor {
    @Override
    public void ofertaGasolina(OfertaGasolina ofertaGasolina) {
        System.out.println("Descuento del 3% en Gasolina con tu tarjeta Clasica");
    }

    @Override
    public void ofertaVuelos(OfertaVuelos ofertaVuelos) {
        System.out.println("Descuento del 5% en Vuelos con tu tarjeta Clasica");
    }
}
