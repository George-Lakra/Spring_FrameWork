package com.spring.javaconfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/*
 * In XML configuration, we define beans and their dependencies
 * inside an XML file.
 *
 * In Java-based configuration, we use @Configuration to tell Spring
 * that this class contains bean configuration.
 *
 * @Bean tells Spring that the object returned by the method
 * should be registered and managed as a Spring bean.
 */
@Configuration
public class Application {

    @Bean
    Marco march(){
        return new Marco();
    }

    @Bean
    Jenny jeny(){
        return new Jenny();
    }

    @Bean
    CharacterSection characterSec(){
        return new CharacterSection(jeny());
    }
}
