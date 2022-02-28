package com.example.demo;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller("/demo/")
@Component
@Slf4j
public class DemoController {

    @PostMapping(value = "save/{msgId}")
    public ResponseResult saveSms(@PathVariable(value = "msgId") String msgId, @RequestBody String body){
        log.info("== msgId: {}; body: {}", msgId, body);
        return new ResponseResult();
    }
}
