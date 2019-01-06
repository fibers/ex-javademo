package com.fibers.demo.spring.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@Import(AnimalConfig.class)
@ImportResource("classpath:spring-context.xml")
public class GlobalConfig {
}
