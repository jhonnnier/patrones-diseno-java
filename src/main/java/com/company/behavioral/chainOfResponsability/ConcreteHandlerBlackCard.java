package com.company.behavioral.chainOfResponsability;

public class ConcreteHandlerBlackCard implements ApproveLoanChain {
    private ApproveLoanChain next;

    @Override
    public void setNext(ApproveLoanChain loan) {
        next = loan;
    }

    @Override
    public ApproveLoanChain getNext() {
        return next;
    }

    @Override
    public void crediCardRequest(int totalLoan) {
        if(totalLoan > 50000){
            System.out.println("Esta solicitud de tarjeta de crédito la maneja la tarjeta Black");
        } else {
            next.crediCardRequest(totalLoan);
        }
    }
}
