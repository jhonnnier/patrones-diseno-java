package com.company.behavioral.commad.RNIs;

public class ProceduresRNI001Impl extends ProceduresRNI001 {
    @Override
    public boolean execute(Long idInvoice) {
        this.setActive(Boolean.TRUE);
        this.setCalculateCoinsurance(Boolean.TRUE);
        return super.execute(idInvoice);
    }
}
