package com.cwt.transformer.registry;

public interface ServiceRegistry {
    public <T> TransformerAdapter<T> getTransformer(String clientName);
}
