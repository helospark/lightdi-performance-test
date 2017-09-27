package com.helospark.lightdi.it;

import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

public class PerformanceTests {

    public static void main(String[] args) {
        Options opt = new OptionsBuilder()
                .include(Context1PerformanceTest.class.getSimpleName())
                .include(Context2PerformanceTest.class.getSimpleName())
                .include(Context3PerformanceTest.class.getSimpleName())
                .warmupIterations(5)
                .measurementIterations(10)
                .forks(1)
                .build();

        try {
            new Runner(opt).run();
        } catch (RunnerException e) {
            e.printStackTrace();
        }
    }

}
