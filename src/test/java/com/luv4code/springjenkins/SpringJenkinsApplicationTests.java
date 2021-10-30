package com.luv4code.springjenkins;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
class SpringJenkinsApplicationTests {

    @Test
    void contextLoads() {
        log.info("Test case executed");
        assert (true);
    }

}
