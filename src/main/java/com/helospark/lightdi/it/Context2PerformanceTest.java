package com.helospark.lightdi.it;

import java.util.concurrent.TimeUnit;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.helospark.lightdi.LightDi;
import com.helospark.lightdi.LightDiContext;
import com.helospark.lightdi.it.context2.AnnotatedBean;
import com.helospark.lightdi.it.context2.SpringContextInit;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MICROSECONDS)
public class Context2PerformanceTest {

    @Benchmark
    public AnnotatedBean testSpringContext() {
        try (AnnotationConfigApplicationContext asd = new AnnotationConfigApplicationContext(SpringContextInit.class)) {
            return asd.getBean(AnnotatedBean.class);
        }
    }

    @Benchmark
    public AnnotatedBean testLightdiContext() {
        LightDi lightDi = new LightDi();
        try (LightDiContext asd = lightDi.initContextByPackage(com.helospark.lightdi.it.context2.AnnotatedBean.class.getPackage().getName())) {
            return asd.getBean(AnnotatedBean.class);
        }
    }
}
