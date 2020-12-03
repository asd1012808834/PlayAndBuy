package com.eurekaclient.eurekaclient.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class ClientControlDemo {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/hello")
    public String HelloDemo(@RequestParam(value = "name", defaultValue = "asd") String name) {
        return "hello " + name + " , i am from port : " + port;
    }
}
