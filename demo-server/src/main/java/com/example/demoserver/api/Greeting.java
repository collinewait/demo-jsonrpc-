package com.example.demoserver.api;

import com.googlecode.jsonrpc4j.JsonRpcService;

@JsonRpcService("/greeting")
public interface Greeting {
    String sayHi();
}