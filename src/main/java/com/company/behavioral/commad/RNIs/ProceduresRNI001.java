package com.company.behavioral.commad.RNIs;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public abstract class ProceduresRNI001 extends Rule {
    boolean calculateCoinsurance;

    @Override
    public boolean execute(Long idInvoice) {
        setStartDate(LocalDateTime.now());
        
        if(calculateCoinsurance) {
            BigDecimal coinsurance = calculateCoinsuranceValue();
            System.out.println("Coinsurance: " + coinsurance);
        }
        
        return Boolean.FALSE;
    }


    private BigDecimal calculateCoinsuranceValue() {
        return BigDecimal.ONE;
    }

    public boolean isCalculateCoinsurance() {
        return calculateCoinsurance;
    }

    public void setCalculateCoinsurance(boolean calculateCoinsurance) {
        this.calculateCoinsurance = calculateCoinsurance;
    }
}
