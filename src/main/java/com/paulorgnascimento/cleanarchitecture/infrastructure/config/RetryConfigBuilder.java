package com.paulorgnascimento.cleanarchitecture.infrastructure.config;

import io.github.resilience4j.core.IntervalFunction;
import io.github.resilience4j.retry.RetryConfig;

public class RetryConfigBuilder {
    public static RetryConfig defaultConfig() {
        return RetryConfig.custom()
                .maxAttempts(5)
                .retryOnException(e -> e instanceof Exception)
                .intervalFunction(IntervalFunction.ofExponentialBackoff())
                .build();
    }
}

