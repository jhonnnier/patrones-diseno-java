package com.company.behavioral.commad.RNIs;

import java.time.LocalDateTime;

public abstract class Rule {

    /**
     * This field is filled with a LocalDate which will be used by the rule
     *
     */
    protected LocalDateTime startDate;

    /**
     * This field is filled with a LocalDate which will be used by the rule
     *
     */
    protected LocalDateTime endDate;
    
    protected boolean active;
    
    public abstract boolean execute(final Long idInvoice);
    
    public boolean invoiceIsOverdue() {
        return false;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
