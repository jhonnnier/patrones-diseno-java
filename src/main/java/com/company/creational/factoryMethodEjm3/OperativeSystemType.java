package com.company.creational.factoryMethodEjm3;

public enum OperativeSystemType {
    WINDOWS("win"),
    LINUX("lin");

    private final String codigo;

    OperativeSystemType(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }
}