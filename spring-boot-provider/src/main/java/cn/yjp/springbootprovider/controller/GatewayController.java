package cn.yjp.springbootprovider.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@Scope("prototype")
public class GatewayController {

    @GetMapping(value = "/gateway")
    public String gateway() throws Exception {
        return "hello world,this is spring-boot-provider";
    }

    @PostMapping(value = "/user")
    public String user(@RequestParam(value = "name") String name) throws Exception {
        return "hello world,this is spring-boot-provider. name is " + name;
    }

    @PostMapping(value = "/users")
    public Map<String, String> users(@RequestBody Map<String, String> request) throws Exception {
        request.put("hello world", "spring-boot-provider");
        return request;
    }
}
