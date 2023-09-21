package com.example.pocdpchainofresponsibility.adapters.controller;

import com.example.pocdpchainofresponsibility.domain.model.TransactionRequest;
import com.example.pocdpchainofresponsibility.domain.usecase.ValidatePasswordRules;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class pocController {

    @Autowired
    private ValidatePasswordRules validatePasswordRules;

    @PostMapping ("/validatePassword")
    public ResponseEntity<String> validatePassword(@RequestBody TransactionRequest request) {

       validatePasswordRules.validatePassword(request.getPassword());
        return null;
    }
}
