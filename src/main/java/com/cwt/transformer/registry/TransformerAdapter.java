package com.cwt.transformer.registry;


import com.cwt.transformer.model.AuthResponse;

public interface TransformerAdapter<T> {
    public AuthResponse transform(T authRequest);
}
