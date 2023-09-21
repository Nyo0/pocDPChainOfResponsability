package com.example.pocdpchainofresponsibility.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class TransactionRequest {

    @JsonProperty("password")
    private String password;

}