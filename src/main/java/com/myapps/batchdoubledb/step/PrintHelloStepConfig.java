package com.myapps.batchdoubledb.step;

import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PrintHelloStepConfig {

    private final StepBuilderFactory stepBuilderFactory;

    public PrintHelloStepConfig(StepBuilderFactory stepBuilderFactory) {
        this.stepBuilderFactory = stepBuilderFactory;
    }

    @Bean
    public Step printHelloStep(Tasklet printHelloTasklet) {
        return stepBuilderFactory
                .get("printHelloStep")
                .tasklet(printHelloTasklet)
                .build();
    }

}
