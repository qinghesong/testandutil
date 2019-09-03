package com.syh.Controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
@Api(tags = "TestController测试")
public class TestController {
    @RequestMapping(value = "/hello")
    @ApiOperation(value = "/hello",notes = "hellotest",httpMethod = "GET")
    public String hello(){
        return "hello";
    }
}
