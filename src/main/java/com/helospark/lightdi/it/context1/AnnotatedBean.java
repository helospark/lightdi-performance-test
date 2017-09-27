package com.helospark.lightdi.it.context1;

@com.helospark.lightdi.annotation.Component
@org.springframework.stereotype.Component
public class AnnotatedBean {
    private String value;
    private int intValue;
    private Dependency dependency;

    @com.helospark.lightdi.annotation.Value("${TEST_PROPERTY}")
    @org.springframework.beans.factory.annotation.Value("${TEST_PROPERTY}")
    public void setValue(String value) {
        this.value = value;
    }

    @org.springframework.beans.factory.annotation.Autowired
    @com.helospark.lightdi.annotation.Autowired
    public void setDependency(Dependency dependency) {
        this.dependency = dependency;
    }

    @com.helospark.lightdi.annotation.Value("${INT_PROPERTY}")
    @org.springframework.beans.factory.annotation.Value("${INT_PROPERTY}")
    public void setIntValue(Integer intValue) {
        this.intValue = intValue;
    }

    public String getValue() {
        return value;
    }

    public Dependency getDependency() {
        return dependency;
    }

    public int getIntValue() {
        return intValue;
    }

}
