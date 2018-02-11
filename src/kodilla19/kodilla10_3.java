package kodilla19;

public class kodilla10_3 {
    package com.kodilla.spring.reader;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

    public class ReaderTestSuite {
        @Test
        public void testRead() {
            //Given
            ApplicationContext context = new AnnotationConfigApplicationContext(ReaderConfig.class);
            Reader reader = context.getBean(Reader.class);
            //When & Then
            reader.read();
        }
    }
}
