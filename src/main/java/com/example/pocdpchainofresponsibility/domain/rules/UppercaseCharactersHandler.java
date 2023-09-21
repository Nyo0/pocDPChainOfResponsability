package com.example.pocdpchainofresponsibility.domain.rules;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UppercaseCharactersHandler extends RulesHandler{

    @Override
    public boolean handleRules(String password) {
        String regex = ".*[A-Z].*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        if (!matcher.matches()) {
            System.out.println("Senha invalida, não contem nenhuma caracter maiusculo");
            return false;
        } else {
            next.handleRules(password);
            return true;
        }
    }
}
