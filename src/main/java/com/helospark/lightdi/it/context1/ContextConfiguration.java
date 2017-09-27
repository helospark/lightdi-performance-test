package com.helospark.lightdi.it.context1;

// lightdi
@com.helospark.lightdi.annotation.Configuration
@com.helospark.lightdi.annotation.ComponentScan
@com.helospark.lightdi.annotation.PropertySource("classpath:testproperties.properties")
//spring
@org.springframework.context.annotation.Configuration
@org.springframework.context.annotation.ComponentScan
@org.springframework.context.annotation.PropertySource("classpath:testproperties.properties")
public class ContextConfiguration {

    @com.helospark.lightdi.annotation.Bean
    @org.springframework.context.annotation.Bean
    public NonAnnotatedBean nonAnnotationBean() {
        return new NonAnnotatedBean();
    }

}
