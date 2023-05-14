package com.minenger.App.Config;

import jakarta.persistence.EntityManagerFactory;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.beans.factory.annotation.Qualifier;
import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(entityManagerFactoryRef = "dbEntityManagerFactory",
                       transactionManagerRef = "dbTransactionManager",
                       basePackages = {"com.minenger.App.Repository"})
public class MySqlConfig {

    @Value("jdbc:mysql://localhost:3306/MINENGER-APP?useSSL=false")
    private String url;

    @Value("root")
    private String username;

    @Value("test1234")
    private String password;

    @Value("com.mysql.cj.jdbc.Driver")
    private String driverClassName;

    @Primary
    @Bean(name = "dbDataSource")
    public DataSource dataSource(){
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setUrl(url);
        driverManagerDataSource.setUsername(username);
        driverManagerDataSource.setPassword(password);
        driverManagerDataSource.setDriverClassName(driverClassName);
        return driverManagerDataSource;
    }
    @Primary
    @Bean(name = "dbEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean dbEntityManagerFactory(EntityManagerFactoryBuilder builder,
                                                                         @Qualifier("dbDataSource") DataSource dataSource){
        return builder.dataSource(dataSource)
                .packages("com.minenger.App.Entity")
                .persistenceUnit("db")
                .build();
    }

    @Primary
    @Bean(name = "dbTransactionManager")
    public PlatformTransactionManager platformTransactionManager(@Qualifier("dbEntityManagerFactory")EntityManagerFactory entityManagerFactory){
        return new JpaTransactionManager();
    }







}
