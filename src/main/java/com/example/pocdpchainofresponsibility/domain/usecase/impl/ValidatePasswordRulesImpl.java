package com.example.pocdpchainofresponsibility.domain.usecase.impl;

import com.example.pocdpchainofresponsibility.domain.rules.*;
import com.example.pocdpchainofresponsibility.domain.usecase.ValidatePasswordRules;
import org.springframework.stereotype.Service;

@Service
public class ValidatePasswordRulesImpl implements ValidatePasswordRules {

    RulesHandler special = new SpecialCharactersHandler();
    RulesHandler lowercase = new LowercaseCharactersHandler();
    RulesHandler blankOrNull = new BlankOrIsNullHandler();
    RulesHandler uppercase = new UppercaseCharactersHandler();


    @Override
    public Boolean validatePassword(String password){

        blankOrNull.setNext(lowercase);
        lowercase.setNext(uppercase);
        uppercase.setNext(special);
        var valid =  blankOrNull.handleRules(password);

        return valid;
    }


}
