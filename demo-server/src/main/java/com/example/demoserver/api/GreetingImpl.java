package com.example.demoserver.api;

import com.googlecode.jsonrpc4j.spring.AutoJsonRpcServiceImpl;
import org.springframework.stereotype.Service;

@Service
@AutoJsonRpcServiceImpl
public class GreetingImpl implements Greeting {
    @Override
    public String sayHi() {
        return "Greetings when testing out json-rpc";
    }
}
