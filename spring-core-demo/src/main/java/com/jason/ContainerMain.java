package com.jason;

import org.springframework.core.io.ClassPathResource;

public class ContainerMain {

    public static void main(String[] args) {
        ClassPathResource classPathResource = new ClassPathResource("beans.xml");
    }
}
