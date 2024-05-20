package com.example.api_uemycourse.Resources;

import com.example.api_uemycourse.domain.HelloWordService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/hello-world")
public class HelloWorldController {
    @GetMapping("{name}/{age}")
    public HelloWordService helloWorld(@PathVariable String name, @PathVariable String age){
        return new HelloWordService(String.format("Hello %s %s", name, age));
    }
}
