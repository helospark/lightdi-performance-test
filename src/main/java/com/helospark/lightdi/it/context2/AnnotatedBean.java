package com.helospark.lightdi.it.context2;

@com.helospark.lightdi.annotation.Component
@org.springframework.stereotype.Component
public class AnnotatedBean {
    private Dependency dependency;

    @org.springframework.beans.factory.annotation.Autowired
    @com.helospark.lightdi.annotation.Autowired
    public void setDependency(Dependency dependency) {
        this.dependency = dependency;
    }

    public Dependency getDependency() {
        return dependency;
    }

}
