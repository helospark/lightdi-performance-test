package com.helospark.lightdi.it;

import java.util.concurrent.TimeUnit;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.helospark.lightdi.LightDi;
import com.helospark.lightdi.LightDiContext;
import com.helospark.lightdi.it.context1.AnnotatedBean;
import com.helospark.lightdi.it.context1.ContextConfiguration;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MICROSECONDS)
public class Context1PerformanceTest {

    @Benchmark
    public AnnotatedBean testSpringContext() {
        try (AnnotationConfigApplicationContext asd = new AnnotationConfigApplicationContext(ContextConfiguration.class)) {
            return asd.getBean(AnnotatedBean.class);
        }
    }

    @Benchmark
    public AnnotatedBean testLightdiContext() {
        LightDi lightDi = new LightDi();
        try (LightDiContext asd = lightDi.initContextByClass(ContextConfiguration.class)) {
            return asd.getBean(AnnotatedBean.class);
        }
    }
}
