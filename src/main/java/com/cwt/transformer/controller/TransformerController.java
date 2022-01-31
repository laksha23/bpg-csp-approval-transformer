package com.cwt.transformer.controller;

import com.cwt.transformer.model.AuthRequest;
import com.cwt.transformer.model.AuthResponse;
import com.cwt.transformer.registry.ServiceRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;


@RestController
public class TransformerController {

    @Autowired
    private ServiceRegistry serviceRegistry;

    @PostMapping("/auth")
    public ResponseEntity<AuthResponse>  authorize(@RequestBody AuthRequest authRequest){
        return new ResponseEntity<>(serviceRegistry.getTransformer(authRequest.getClientName().toLowerCase(Locale.ROOT)).transform(authRequest), HttpStatus.OK);
    }
}
