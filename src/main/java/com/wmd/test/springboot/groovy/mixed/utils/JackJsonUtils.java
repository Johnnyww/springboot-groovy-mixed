package com.wmd.test.springboot.groovy.mixed.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author: wengmd
 * @Date: 18-12-12 下午8:02
 */
public class JackJsonUtils {
    private static final Logger LOGGER = LoggerFactory.getLogger(JackJsonUtils.class);

    public static String toStr(Object object) {
        if (object == null) {
            return "";
        }

        ObjectMapper mapper = new ObjectMapper();
        String json;
        try {
            json = mapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            json = "";
            LOGGER.error("转换json错误", e);
        }
        return json;
    }
}
