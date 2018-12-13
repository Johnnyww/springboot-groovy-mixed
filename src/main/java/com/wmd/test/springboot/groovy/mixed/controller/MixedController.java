package com.wmd.test.springboot.groovy.mixed.controller;

import com.wmd.test.springboot.groovy.mixed.domain.HelloDataBean;
import com.wmd.test.springboot.groovy.mixed.utils.JackJsonUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: wengmd
 * @Date: 18-12-13 下午9:59
 */
@RestController
@RequestMapping("/sgmixed/rest/test")
public class MixedController {
    @RequestMapping(
            value = "/hello",
            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public String hello(@RequestBody HelloDataBean helloDataBean) {
        System.out.println(JackJsonUtils.toStr(helloDataBean));
        return "hello world";
    }
}
