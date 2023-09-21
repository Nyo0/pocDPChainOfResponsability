package com.example.pocdpchainofresponsibility.domain.rules;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BlankOrIsNullHandler extends RulesHandler{

    @Override
    public boolean handleRules(String password) {

        if (password.isBlank() || password.isEmpty()) {
            System.out.println("Senha invalida, Senha não pode ser vazia.");
            return false;
        } else {
            next.handleRules(password);
            return true;
        }
    }
}
