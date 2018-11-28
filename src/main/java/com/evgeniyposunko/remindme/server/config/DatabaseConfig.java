package com.evgeniyposunko.remindme.server.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.Resource;

@PropertySource("classpath:db.properties")
@Configuration // помечаем что данный класс является конфигурацией
@EnableJpaRepositories("com.evgeniyposunko.remindme.server.repository")
@EnableTransactionManagement
@ComponentScan("com.evgeniyposunko.remindme.server")
public class DatabaseConfig {

    @Resource
    private Environment env; //обеспечиваем доступ к проперти файлам

}
