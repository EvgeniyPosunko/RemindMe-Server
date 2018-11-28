package com.evgeniyposunko.remindme.server.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration // данный клас являеться конфигурацие, которую нужно выполнить перед тем как разворачивать контекст спринга
@EnableWebMvc  // означает, что мы должны включить режим WebMvc (даст возможность исплозование контроллеров)
@ComponentScan("com.evgeniyposunko.remindme.server")  // говорит о том где нужно искать "бины (компоненты, сервисы, репозитории)"
public class WebConfig extends WebMvcConfigurerAdapter {
}
