package com.myapps.batchdoubledb.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class PropsConfig {

    /*
    Use it if you want to point an external location for the properties file
    @Bean
    public PropertySourcesPlaceholderConfigurer config() {
        PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
        configurer.setLocation(new FileSystemResource("/opt/spring-batch-database-double/application.properties"));
        return configurer;
    }
    */

}
