package com.wmd.test.springboot.groovy.mixed;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: wengmd
 * @Date: 18-12-13 下午10:13
 */
@SpringBootApplication(scanBasePackages = "com.wmd.test.springboot.groovy.mixed")
public class MixedApplication {
    public static void main(String[] args) {
        SpringApplication.run(MixedApplication.class, args);
    }
}
