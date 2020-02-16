package com.example.democlient;

import com.googlecode.jsonrpc4j.JsonRpcParam;

public interface CalculatorAPI {
    int add(@JsonRpcParam(value = "a") int a, @JsonRpcParam(value = "b") int b);
}
