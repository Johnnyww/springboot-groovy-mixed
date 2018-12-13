package com.wmd.test.springboot.groovy.mixed.test

import org.junit.Test
import org.springframework.http.MediaType

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

/**
 * @Author: wengmd
 * @Date: 18-12-13 下午10:07
 */
class MxiedGroovyTest extends BaseTest {
    @Test
    void helloworldMixed() throws Exception {
        def body = '''
              {
                "springboot":"hi springboot",
                "groovy":"hi groovy",
                "hello":"hi hello",
                "world":"hi world"
              }
        ''';
        def responseString = mockMvc.perform(
                post("/sgmixed/rest/test/hello")
                        .contentType(MediaType.APPLICATION_JSON_UTF8)
                        .content(body)
        ).andExpect(status().isOk())
                .andDo(print())
                .andReturn().getResponse().getContentAsString();
        println(responseString);
    }
}
