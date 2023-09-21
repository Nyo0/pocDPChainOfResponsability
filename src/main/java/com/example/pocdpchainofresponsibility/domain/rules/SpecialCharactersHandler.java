package com.example.pocdpchainofresponsibility.domain.rules;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SpecialCharactersHandler extends RulesHandler{

    @Override
    public boolean handleRules(String password) {
        String regex = "[^a-zA-Z0-9]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        if (!matcher.find()) {
            System.out.println("Senha invalida, não contem nenhuma caracter especial");
            return false;
        } else {
            next.handleRules(password);
            return true;
        }
    }
}
