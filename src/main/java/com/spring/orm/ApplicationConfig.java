package com.spring.orm;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import jakarta.persistence.EntityManagerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
public class ApplicationConfig {
    DriverManagerDataSource ds = new DriverManagerDataSource();
    Dotenv dotenv = Dotenv.load();

    @Bean
    public DataSource dataSource(){
        ds.setDriverClassName(dotenv.get("DRIVER"));
        ds.setUrl(dotenv.get("URL"));
        ds.setUsername(dotenv.get("USER_NAME"));
        ds.setPassword(dotenv.get("USER_PASSWORD"));
        return ds;
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean   entityManagerFactory(){
        LocalContainerEntityManagerFactoryBean emf = new LocalContainerEntityManagerFactoryBean();
        emf.setDataSource(dataSource());
        emf.setPackagesToScan("com.spring.orm");
        emf.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
        Properties properties = new Properties();

        properties.setProperty(
                "hibernate.dialect",
                "org.hibernate.dialect.PostgreSQLDialect"
        );

        properties.setProperty(
                "hibernate.show_sql",
                "true"
        );

        properties.setProperty(
                "hibernate.hbm2ddl.auto",
                "none"
        );

        emf.setJpaProperties(properties);

        return emf;
    }

    @Bean
    public JpaTransactionManager jpaTransactionManager(EntityManagerFactory entityManagerFactory){
        return new JpaTransactionManager(entityManagerFactory);
    }
}
