package com.cwt.transformer.service;

import com.cwt.transformer.model.AuthRequest;
import com.cwt.transformer.model.AuthResponse;
import com.cwt.transformer.registry.TransformerAdapter;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service("amazon")
public class AmazonTransformer implements TransformerAdapter<AuthRequest> {

    @Override
    public AuthResponse transform(AuthRequest authRequest) {
        return new AuthResponse(authRequest.getClientName().toUpperCase(Locale.ROOT) +" Authorization: Bearer "+ RandomStringUtils.random(100, true, true));
    }
}
