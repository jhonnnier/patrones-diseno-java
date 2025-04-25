package com.company.behavioral.chainOfResponsability;

public interface ApproveLoanChain {
    void setNext(ApproveLoanChain loan);

    ApproveLoanChain getNext();

    void crediCardRequest(int totalLoan);
}
