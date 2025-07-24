package com.effective.demo;

import com.effective.demo.ch02.sourcecode.Singleton;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class SingletonTest {

    @Test
    Singleton create() {
        return Singleton.INSTANCE;
    }

    @Test
    void testLogging() {
        Singleton instance = create();

        // given
        Singleton logger = Singleton.INSTANCE;

        // when
        // 아래 3개 메소드가 ConsoleAppLogger 구현체로 고정되어 있기 때문에 mock 객체를 사용하기 힘듬
        logger.logInfo("info");
        logger.logWarn("warn");
        logger.logError("error");

        // then
        assertTrue(instance == logger, "두 인스턴스는 동일");
    }
}
