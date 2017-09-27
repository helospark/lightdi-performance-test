package com.helospark.lightdi.it.context3;

@com.helospark.lightdi.annotation.Configuration
@org.springframework.context.annotation.Configuration
public class ContextConfiguration {

    @com.helospark.lightdi.annotation.Bean
    @org.springframework.context.annotation.Bean
    public AnnotatedBean annotatedBean() {
        return new AnnotatedBean();
    }

    @com.helospark.lightdi.annotation.Bean
    @org.springframework.context.annotation.Bean
    public Dependency dependency() {
        return new Dependency();
    }

    @com.helospark.lightdi.annotation.Bean
    @org.springframework.context.annotation.Bean
    public OtherAnnotatedBean otherAnnotatedBean() {
        return new OtherAnnotatedBean();
    }

}
