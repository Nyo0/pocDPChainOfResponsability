package com.example.pocdpchainofresponsibility.domain.rules;

public abstract  class RulesHandler {
    protected RulesHandler next;
    public void setNext(RulesHandler next) {
        this.next = next;
    }
    public abstract boolean handleRules(String password);
}
